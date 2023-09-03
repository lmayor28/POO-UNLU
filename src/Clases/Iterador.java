package Clases;

public class Iterador {
    private Nodo nodo;

    // Contructor
    public Iterador(Nodo nodo){
        this.nodo = nodo;
    }

    //
    public boolean esVacia(){
        return this.nodo == null;
    }

    public Object siguiente(){
        if (esVacia()){
            return null;
        }

        Object dato = nodo.getDato();
        nodo = nodo.getProximo();
        return dato;
    }
}
