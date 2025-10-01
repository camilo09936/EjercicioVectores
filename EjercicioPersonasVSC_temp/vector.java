public class vector{
private int max;
private int indice;
private Personas[] vectorPersonas;

public vector(int max){
    this.max = max;
    this.indice=-1;
    this.vectorPersonas= new Personas[max];
}

public int getMax() {                                                                                                         
    return max;
}

public int getIndice() {
    return indice;
}

public Personas[] getVectorPersonas() {
    return vectorPersonas;
}
public boolean vectorVacio(){
    if (this.indice== -1) {
        return true;
    } else {
        return false;
    }
    }
public boolean vectorLleno(){
    if (this.indice== this.max - 1 ) {
        return true;
    } else {
        return false;
    }
}
    public void agregarPersona(Personas p){
        if (!vectorLleno()) {
            this.indice++;
            this.vectorPersonas[this.indice]=p;
        } else {
            System.out.println("El Vector esta Lleno");
        }
        }
        public void mostrarVector(){
            if (!vectorVacio()) {
                for(int i=0; i<=this.indice;i++){
                    System.out.println("Nombre: " + this.vectorPersonas[i].getNombre() + ", Apellido: " + this.vectorPersonas[i].getApellido() + ", Peso: " + this.vectorPersonas[i].getPeso() + " ,Altura: " + this.vectorPersonas[i].getAltura() + " ,Edad: " + this.vectorPersonas[i].getEdad());
                }
            } else {
                System.out.println("El vector esta vacio");
            }
            }
        public void eliminarPersona(int posicion){
            if (!vectorVacio() && posicion >=0 && posicion <= this.indice) {
                for (int i = posicion; i < this.indice; i++) {
                    this.vectorPersonas[i] = this.vectorPersonas[i+1];
                }
                this.vectorPersonas[this.indice] = null;
                this.indice--;
            } else {
                System.out.println("Posicion invalida o vector vacio");
            }
            }
            public int buscarPersona(String Nombre){
                if(!vectorVacio()){
                    int i=0;
                    boolean encontrado = false;
                    while(i<=this.indice && !encontrado){
                        if(this.vectorPersonas[i].getNombre().equalsIgnoreCase(Nombre)){
                            encontrado = true;
                            return i;
                    }else{
                        i++;
                    }
                    }
                    if (!encontrado){
                        System.out.println("No se encontro la persona");
                    }
                    }
                    return -1; //No Encontrado
                }
            
        }










