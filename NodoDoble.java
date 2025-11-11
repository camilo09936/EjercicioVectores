public class NodoDoble {
    private Personas dato;
    private NodoDoble izquierda;
    private NodoDoble derecha;

    public NodoDoble(){
    }
    public NodoDoble(Personas dato){
        this.dato= dato;
        this.izquierda= null;
        this.derecha= null;
    }
    public Personas getDato() {
        return dato;
    }
    public void setDato(Personas dato) {
        this.dato = dato;
    }
    public NodoDoble getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(NodoDoble izquierda) {
        this.izquierda = izquierda;
    }
    public NodoDoble getDerecha() {
        return derecha;
    }
    public void setDerecha(NodoDoble derecha) {
        this.derecha = derecha;
    }

    
}
