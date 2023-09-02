package Clases;
// Implemente el TAD Pila. Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso.
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
    public void desapilar(){
        if (this.esVacia()) {
            return;
        }
        tope = tope.getProximo();
    }

    public Object recuperar(){
        if (esVacia()){
            return "La pila está vacía";
        }
        return  tope.getDato();
    }


    /*
    public int longitud(){
        Nodo nodoAux = tope;
        int cantidad = 0;
        while (nodoAux != null){
            cantidad += 1;
            nodoAux = nodoAux.getProximo();
        }
        return cantidad;
    }
    */
}
