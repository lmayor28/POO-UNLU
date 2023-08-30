package Clases;
public class Pila {

    private Nodo tope = null;

    public boolean esVacia(){
        return tope == null;
    }

    public void apilar(Object dato){
        Nodo newNodo = new Nodo(dato);
        if (!this.esVacia()) {
            newNodo.setProximo(tope);
        }
        tope = newNodo;
    }
    public  void desapilar(){
        tope = tope.getProximo();
    }

    public Object recuperar(){
        return  tope.getDato();
    }

    public int cantidad(){
        Nodo nodoAux = tope;
        int cantidad = 0;
        while (nodoAux != null){
            cantidad += 1;
            nodoAux = nodoAux.getProximo();
        }


        return  cantidad;
    }
}
