package Clases;

public class Cola {
    private Nodo head = null;
    private Nodo tail = null;

    public boolean esVacia(){
        return head == null;
    }

    public void desencolar(){
        if (esVacia()){
            return;
        }
        head = head.getProximo();
        if (head == null){
            tail = null;
        }
    }

    public void encolar(Object dato){
        Nodo newNodo = new Nodo(dato);
        if (esVacia()){
            head = newNodo;
            tail = newNodo;

            return;
        }
        tail.setProximo(newNodo);
        tail = newNodo;
    }
    public Object recuperar(){
        if (esVacia()){
            return "La cola esta vacia";
        }
        return head.getDato();
    }
}
