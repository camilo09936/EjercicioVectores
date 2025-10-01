public class Nodo{
    private Personas dato;
    private Nodo siguiente;

    public Nodo(){
    }
    public Nodo (Personas dato){
        this.dato= dato;
        this.siguiente= null;
    }
    public Nodo (Personas dato, Nodo sigiente){
        this.dato=dato;
        this.siguiente=sigiente;
    }
    public Personas getDato() {
        return dato;
    }
    public void setDato(Personas dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}