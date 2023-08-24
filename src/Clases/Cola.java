package Clases;

public class Cola {
    private Nodo head = null;
    private Nodo tail = null;

    public boolean esVacia(){
        return head == null;
    }

    public Object desencolar(){
        if (esVacia()){
            return null;
        }
        Object head = this.head.getDato();
        this.head = this.head.getProximo();
        if (this.head == null){
            tail = null;
        }
        return head;
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
}
