package TP1.EJ2;

import TP1.EJ1.Nodo;

public class ListaEnlazadaDoble {
    private Nodo primero = null;
    private Nodo ultimo = null;
    private Integer longitud = 0;

    public boolean esVacia() {
        return (primero == null);
    }

    public Integer longitud() {
        return longitud;
    }

    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setProximo(nuevoNodo);
            ultimo = nuevoNodo;
        }
        longitud++;
    }

    public boolean eliminarDato(Object dato) {
        if (esVacia() || dato == null) {
            return false;
        }

        Nodo nodoAux = primero;
        while (nodoAux != null) {
            if (nodoAux.getDato().equals(dato)) {
                if (nodoAux == primero) {
                    primero = nodoAux.getProximo();
                    if (primero != null) {
                        primero.setAnterior(null);
                    } else {
                        ultimo = null;
                    }
                } else if (nodoAux == ultimo) {
                    ultimo = nodoAux.getAnterior();
                    if (ultimo != null) {
                        ultimo.setProximo(null);
                    } else {
                        primero = null;
                    }
                } else {
                    Nodo anterior = nodoAux.getAnterior();
                    Nodo siguiente = nodoAux.getProximo();
                    anterior.setProximo(siguiente);
                    siguiente.setAnterior(anterior);
                }
                longitud--;
                return true;
            }
            nodoAux = nodoAux.getProximo();
        }
        return false;
    }

    public Object recuperar(Integer pos) {
        if (esVacia() || pos < 1 || pos > longitud) {
            return null;
        }

        Nodo nodoAux = primero;
        for (int i = 1; i < pos; i++) {
            nodoAux = nodoAux.getProximo();
        }
        return nodoAux.getDato();
    }

    public boolean insertar(Integer pos, Object dato) {
        if (esVacia() || pos < 1 || pos > longitud + 1) {
            return false;
        }

        Nodo nuevoNodo = new Nodo(dato);
        if (pos == 1) {
            nuevoNodo.setProximo(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        } else if (pos == longitud + 1) {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setProximo(nuevoNodo);
            ultimo = nuevoNodo;
        } else {
            Nodo nodoAux = primero;
            for (int i = 1; i < pos; i++) {
                nodoAux = nodoAux.getProximo();
            }
            Nodo anterior = nodoAux.getAnterior();
            anterior.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(anterior);
            nuevoNodo.setProximo(nodoAux);
            nodoAux.setAnterior(nuevoNodo);
        }
        longitud++;
        return true;
    }

    public boolean reemplazar(Integer pos, Object nuevoDato) {
        if (esVacia() || pos < 1 || pos > longitud) {
            return false;
        }

        Nodo nodoAux = primero;
        for (int i = 1; i < pos; i++) {
            nodoAux = nodoAux.getProximo();
        }
        nodoAux.setDato(nuevoDato);
        return true;
    }

    public void datoSiguieteAnterior(int pos) {
        if (!esVacia()) {
            Nodo nodoAux = primero;
            System.out.println("DATO EN LA POSICION " + pos + " :" + recuperar(pos));
            if (pos == 1) {
                System.out.println("Anterior: null - Siguiente: " + nodoAux.getProximo().getDato());
            } else if (pos == longitud) {
                System.out.println("Anterior: " + nodoAux.getAnterior() + " - Siguiente: null ");
            } else {
                for (int i = 1; i < pos; i++) {
                    nodoAux = nodoAux.getProximo();
                }
                System.out.println("Anterior: " + nodoAux.getAnterior().getDato() + " - Siguiente: " + nodoAux.getProximo().getDato());
            }
        }
    }

    @Override
    public String toString() {
        String acumulador = "";
        int i = 1;
        Nodo nodoAux = primero;
        if (primero == null) {
            acumulador = "Lista vacía";
        } else {
            while (nodoAux != null) {
                acumulador += "Nodo " + i + " | DATO: " + nodoAux.getDato() + " \n";
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return acumulador;
    }
}

