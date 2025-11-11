public class ListaDoble {
    private NodoDoble Primero;
    private NodoDoble Ultimo;

    public ListaDoble(){
        this.Primero=null;
        this.Ultimo=null;
    }

    public boolean ListaVacia(){
        if (this.Primero==null)
            return true;
            else
            return false;
        }
    
    public void agregarPersonaFinal(Personas p){
            NodoDoble nuevo= new NodoDoble(p);
            if (ListaVacia()){
                this.Primero=nuevo;
                this.Ultimo=nuevo;
            }else{
                Ultimo.setDerecha(nuevo);
                nuevo.setIzquierda(Ultimo);
                Ultimo=nuevo;
            }
        }
    public void agregarPersonaInicio(Personas p){
        NodoDoble nuevo= new NodoDoble(p);
        if(ListaVacia()){
            this.Primero=nuevo;
            this.Ultimo=nuevo;
        }else{
            nuevo.setDerecha(Primero);
            Primero.setIzquierda(nuevo);
            Primero= nuevo;
        }
    }
    public void agregarPersonaAntesDeNombre(Personas p, String nombreSiguiente){
        if(ListaVacia()){
            System.out.println("La lista esta vacia, no se puede insertar antes de " + nombreSiguiente);
            return;
        }
        NodoDoble actual= Primero;
        while(actual!=null && !actual.getDato().getNombre().equalsIgnoreCase(nombreSiguiente)){
            actual= actual.getDerecha();
        }
        if(actual==null){
            System.out.println("No se encontró la persona con nombre: " +nombreSiguiente);
            return;
        }
        NodoDoble nuevo= new NodoDoble(p);
        NodoDoble anterior= actual.getIzquierda();

        if(anterior==null){
            nuevo.setDerecha(Primero);
            Primero.setIzquierda(nuevo);
            Primero= nuevo;
        }else{
            anterior.setDerecha(nuevo);
            nuevo.setIzquierda(anterior);
            nuevo.setDerecha(actual);
            actual.setIzquierda(nuevo);
        }
    }
    public void eliminarPersonaPorNombre(String nombre){
        if(ListaVacia()){
            System.out.println("La lista esta vacia, no se puede eliminar.");
            return;
        }
        NodoDoble actual= Primero;
        while(actual!=null && !actual.getDato().getNombre().equalsIgnoreCase(nombre)){
            actual= actual.getDerecha();
        }
        if(actual==null){
            System.out.println("No se encontro la persona con nombre: " +nombre);
            return;
        }
        if(actual==Primero){
            Primero= Primero.getDerecha();
            if(Primero!=null) 
            Primero.setIzquierda(null);
            else Ultimo= null;
        }else if (actual==Ultimo){
            Ultimo= Ultimo.getIzquierda();
            Ultimo.setDerecha(null);
        }else{
            actual.getIzquierda().setDerecha(actual.getDerecha());
            actual.getDerecha().setIzquierda(actual.getIzquierda());
        }
        System.out.println("Persona '" + nombre + "' eliminada correctamente.");
    }
    public void mostrarLista(){
        if(ListaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        NodoDoble actual= Primero;
        while(actual!=null){
            System.out.println(actual.getDato());
            actual= actual.getDerecha();
        }
    }
    public void mostrarListaInversa(){
        if(ListaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        NodoDoble actual= Ultimo;
        while(actual!=null){
            System.out.println(actual.getDato());
            actual= actual.getIzquierda();
        }
    }
    public int contarNodos(){
        int contador=0;
        NodoDoble actual= Primero;
        while(actual!=null){
            contador++;
            actual=actual.getDerecha();
        }
        return contador;
    }
    }
