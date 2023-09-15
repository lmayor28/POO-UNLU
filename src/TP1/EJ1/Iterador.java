package TP1.EJ1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterador implements Iterator<Object> {
    private Nodo nodo;

    // Constructor
    public Iterador(Nodo nodo) {
        this.nodo = nodo;
    }

    @Override
    public boolean hasNext() {
        return nodo != null;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object dato = nodo.getDato();
        nodo = nodo.getProximo();
        return dato;
    }
}
