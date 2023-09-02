package Clases;

public class Nodo {
    private Object dato;
    private Nodo proximo = null;

    // Constructor
    public Nodo(Object dato) {
        this(dato,  null);
    }
    public Nodo(Object dato, Nodo anterior){
        this(dato, anterior, null);
    }
    public Nodo(Object dato, Nodo anterior, Nodo proximo){
        this.dato = dato;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    // Getters y Setters
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public Object getDato() {
        return dato;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    public Nodo getProximo() {
        return proximo;
    }


    // Funciones Extras
}
