public class Matriz {
private int Indicef;
private int Indicec;
private int fila;
private int columna;
private Personas [][] matrizPersonas;

public Matriz(){
}
public Matriz(int filas, int columnas){
    this.fila= filas;
    this.columna= columnas;
    this.Indicef=-1;
    this.Indicec=-1; 
    this.matrizPersonas = new Personas [filas] [columnas];
}
public int getIndicef() {
    return Indicef;
}
public void setIndicef(int indicef) {
    Indicef = indicef;
}
public int getIndicec() {
    return Indicec;
}
public void setIndicec(int indicec) {
    Indicec = indicec;
}
public int getFila() {
    return fila;
}
public void setFila(int fila) {
    this.fila = fila;
}
public int getColumna() {
    return columna;
}
public void setColumna(int columna) {
    this.columna = columna;
}
public Personas[][] getMatrizPersonas() {
    return matrizPersonas;
}
public void setMatrizPersonas(Personas[][] matrizPersonas) {
    this.matrizPersonas = matrizPersonas;
}
public boolean matrizVacia(){
    if(this.Indicef==-1 && this.Indicec == -1)
    return true;
    else
    return false;
}
public boolean matrizLlena(){
    if(this.Indicef == this.fila - 1 && this.Indicec == this.columna -1)
    return true;
    else
    return false;
}
public void agregarPersonaPorPosicion(Personas p, int fila, int columna){
    if(!matrizLlena()){
        if (fila>= 0 && fila < fila && columna >= 0 && columna < columna){
            if (this.matrizPersonas[fila][columna] == null){
                this.matrizPersonas[fila][columna] = p;
            }else{
                System.out.println("La posicion ya esta ocupada");
            }
        }else{
            System.out.println("Posicion fuera de rango");
        }
    }else{
        System.out.println("La matriz esta llena");
    }
}
//public void ingresarPersonaSecuencial(Personas p){
   // if (matrizVacia()){
    //this.Indicec++;
    //this.Indicef++;
   // this.matrizPersonas[this.fila][this.columna]= p;
   // }else{
      //  if(!matrizLlena() && this.Indicec != this.columna){
       //     this.Indicec++;
      //      this.matrizPersonas[this.fila][this.columna]= p;
       // }else{
       //     this.Indicef++;
       //     this.matrizPersonas[this.Indicef][this.Indicec]= p;
      //  }
   // }
//}
public void ingresarPersonaSecuencial2(Personas p){
    if (matrizVacia()){
        this.Indicef=0;
        this.Indicec=0;
        this.matrizPersonas[this.Indicef][this.Indicec]=p;
    }else
    if (!matrizLlena()){
        if (this.Indicec<this.columna - 1){
            this.Indicec++;
        }else{
            this.Indicec = 0;
            this.Indicef++;
        }
        this.matrizPersonas[this.Indicef][this.Indicec]=p;
    }else{
        System.out.println("La Matriz Esta Llena");
        if(!matrizLlena() && this.Indicec != this.columna){
        }
        }
    }
    public void mostrarMatriz(){
        if (matrizVacia()){
            System.out.println("La Matriz Esta Vacia: ");
        }else{
            System.out.println("Contenido de la Matriz: ");
        }
            for (int i=0;i<fila;i++){
                for(int j=0;j<columna;j++){
                    if(this.matrizPersonas[i][j] != null){
                        System.out.printf("%-20s","[" + this.matrizPersonas[i][j].getNombre() + " " + this.matrizPersonas[i][j].getApellido() + "]");
                }else{
                    System.out.printf("%-20s", "[Vacio]");
                }
                }
                System.out.println();
            }
    }
    public void eliminarMatrizporPos(int fila, int columna){
        if(fila>=0 && fila<this.fila && columna>=0 && columna<this.columna){
            if(this.matrizPersonas[fila][columna] != null){
                this.matrizPersonas[fila][columna] = null;
                System.out.println("Persona eliminada en la posicion [" + fila +"][" + columna + "]");
            }else{
                System.out.println("No hay personas en esta posiición");
            }
        }else{
            System.out.println("Posicion Fuera de Rango");
        }
        }
        public void eliminarMatrizporNombre(String nombre){
            boolean encontrado= false;
            for (int i = 0; i<this.fila; i++){
                for (int j = 0; j<this.columna; j++){
                    if (this.matrizPersonas[i][j] != null && this.matrizPersonas[i][j].getNombre().equalsIgnoreCase(nombre)){
                        System.out.println("Persona " + nombre + " Eliminada en [" + i + "][" + j + "]");
                        this.matrizPersonas[i][j]= null;
                        encontrado= true;
                        break;
                    }
                }
                if (encontrado)
                break;
            }
            if (!encontrado){
                System.out.println("No Se Encontro La Persona Con Nombre: " + nombre);
            }
        }
        public void promedioPesoMP(){
            double suma=0;
            int cont=0;
            for(int i=0;i<fila;i++){
                if(matrizPersonas[i][i] != null){
                    suma +=matrizPersonas[i][i].getPeso();
                    cont++;
                }
            }
            if (cont==0){
                System.out.println("No Hay Personas Para Calcular en la Matriz Principal");
            }else{
                double prom= suma/cont;
                System.out.println("El Promedio del Peso en la Matriz Principal es: " + prom);
            }
        }
        public void promedioEstaturaMS(){
            double suma=0;
            int cont=0;
            for(int i=0; i<fila; i++){
                int j= columna -1 - i;
                if(matrizPersonas[i][j] != null){
                        suma += matrizPersonas[i][j].getAltura();
                        cont++;
                    }
                }
                if (cont==0) {
                    System.out.println("No Hay Personas Para Calcular en la Matriz Secundaria");
                }else{
                    double prom= suma/cont;
                    System.out.println("El Promedio de la Altura en la Matriz Secundaria es: " + prom);
                }
            }
        }

