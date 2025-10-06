public class ListaSimple {
    private Nodo P,U,Q,T;

    public ListaSimple(){
        this.P=null;
        this.U=null;
        this.Q=null;
        this.T=null;
    }
    public ListaSimple(Personas persona){
        Nodo nuevo= new Nodo(persona);
        this.P= nuevo;
        this.U= nuevo;
        this.Q= null;
        this.T= null;
    }
    public Nodo getP() {
        return P;
    }
    public void setP(Nodo P) {
        this.P = P;
    }
    public Nodo getU() {
        return U;
    }
    public void setU(Nodo U) {
        this.U = U;
    }
    public Nodo getQ() {
        return Q;
    }
    public void setQ(Nodo Q) {
        this.Q = Q;
    }
    public Nodo getT() {
        return T;
    }
    public void setT(Nodo T) {
        this.T = T;
    }
    public boolean ListaVacia(){
        if (this.P == null)
        return true;
        else
        return false;
    }
    public void agregarPersonaFinal(Personas p){
        Nodo nuevo= new Nodo(p);
        if(ListaVacia()){
            this.P= nuevo;
            this.U= nuevo;
        }else{
            this.U.setSiguiente(nuevo);
            this.U= nuevo;
        }
    }
    public void mostrarLista(){
        if (!ListaVacia()){
            this.Q= this.P;
            while(this.Q != null){
                System.out.println(this.Q.getDato().toString());
                this.Q= this.Q.getSiguiente();
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    public int contarNodos(){
        int contador=0;
        if (!ListaVacia()){
            this.Q=this.P;
            while (this.Q!=null){
                contador++;
                this.Q= this.Q.getSiguiente();
            }
        }
        return contador;
    }
    public void agregarPersonaInicio(Personas p){
        Nodo nuevo= new Nodo(p);
        if(ListaVacia()){
            this.P= nuevo;
            this.U= nuevo;
        }else{
            nuevo.setSiguiente(this.P);
            this.P= nuevo;
        }
    }
    public void agregarPersonaAntesDePos(Personas p, int posicion){
        if(posicion<=1 || ListaVacia()){
            agregarPersonaInicio(p);
        }else{
            int contador=1;
            this.Q=this.P;
            while (this.Q != null && contador < posicion - 1) {
                this.Q= this.Q.getSiguiente();
                contador++;
            }
            if(this.Q == null || this.Q.getSiguiente() == null){
                agregarPersonaFinal(p);
            }else{
                Nodo nuevo= new Nodo(p);
                nuevo.setSiguiente(this.Q.getSiguiente());
                this.Q.setSiguiente(nuevo);
            }
        }
    }
    public void agregarPersonaAntesDeNombre(Personas nuevaPersona, String NombreSiguiente){
        if(ListaVacia()){
            System.out.println("La lista esta vacia, no se puede insertar antes de " +NombreSiguiente);
            return;
        }
        Nodo nuevo= new Nodo(nuevaPersona);
        if(this.P.getDato().getNombre().equalsIgnoreCase(NombreSiguiente)){
            nuevo.setSiguiente(this.P);
            this.P= nuevo;
            return;
        }
        Nodo actual= this.P;
        Nodo anterior= null;
        while(actual != null && !actual.getDato().getNombre().equalsIgnoreCase(NombreSiguiente)){
            anterior= actual;
            actual=actual.getSiguiente();
        }
        if (actual == null){
            System.out.println("No se encontro ninguna persona con el nombre: " +NombreSiguiente);
        }else{
            //insertar antes de actual
            anterior.setSiguiente(nuevo);
            nuevo.setSiguiente(actual);
        }
    }
    public void eliminarListaPersonaPorPos(int posicion){
        if(ListaVacia()){
            System.out.println("La lista esta vacia. No se puede eliminar.");
            return;
        }
        if (posicion<=0) {
            System.out.println("Posicion Invalida.");  
            return;  
        }
        if (posicion==1) {
            this.P=this.P.getSiguiente();
            if (this.P==null){
                this.U=null;
            }
            System.out.println("Persona Eliminada de la posicion 1.");
            return;
        }
        this.Q=this.P;
        int contador=1;
        while (this.Q!=null&&contador<posicion-1){
            this.Q=this.Q.getSiguiente();
            contador++;
        }
        if (this.Q==null || this.Q.getSiguiente()==null) {
            System.out.println("Posicion fuera de rango.");
            return;
        }
        Nodo nodoAEliminar=this.Q.getSiguiente();
        this.Q.setSiguiente(nodoAEliminar.getSiguiente());
        if(nodoAEliminar==this.U){
            this.U=this.Q;
        }
        System.out.println("Persona a Eliminar en la Posicion" +posicion+ ".");
    }
    public void eliminarListaPersonaPorNombre(String nombre){
        if(ListaVacia()){
            System.out.println("La Lista Esta Vacia. No se puede eliminar.");
            return;
        }
        if(this.P.getDato().getNombre().equalsIgnoreCase(nombre)){
            this.P= this.P.getSiguiente();
            if(this.P==null){
                this.U=null;
            }
            System.out.println("Persona Con Nombre '" +nombre+ "'Eliminada del Inicio.");
            return;
        }
        this.Q=this.P;
        while (this.Q.getSiguiente()!=null) {
            if (this.Q.getSiguiente().getDato().getNombre().equalsIgnoreCase(nombre)) {
                Nodo nodoAEliminar=this.Q.getSiguiente();
                this.Q.setSiguiente(nodoAEliminar.getSiguiente());
                if(nodoAEliminar==this.U){
                    this.U=this.Q;
                }
                System.out.println("Persona Con Nombre '" +nombre+ "' Eliminado.");
                return;
            }
            this.Q=this.Q.getSiguiente();
        }
        System.out.println("No Se Encontro Ninguna Persona Con El Nombre: " +nombre);
    }
}
