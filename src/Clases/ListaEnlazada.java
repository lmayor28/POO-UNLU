package Clases;

public class ListaEnlazada {
    private Nodo primero = null;
    private Nodo ultimo = null;
    private Integer longitud = 0;

    public boolean esVacia(){
        return (primero == null);
    }

    public Integer longitud() {
        return longitud;
    }

    public void agregarElemento(Object dato){
        Nodo newNodo = new Nodo(dato);
        if (esVacia()){
            //newNodo.setDato(dato);
            primero = newNodo;
            ultimo = newNodo;
            longitud = 0;

        } else {

            ultimo.setProximo(newNodo);
            ultimo = newNodo;
            longitud += 1;
        }
    }


    // REVISAR Y VER LA ENTRADA DEL PRIMERO
    public void eliminar(Object dato){
      if (esVacia()){
          return;
      }

      Nodo nodoAux;
      Nodo nodoAnterior = new Nodo(null);
      nodoAux = primero;

      while (nodoAux != null){
          if (nodoAux.getDato() == dato){
              // Enlaza el anterior nodo con el siguiente del objetivo.
              nodoAnterior.setProximo(nodoAux.getProximo());
              longitud -= 1;
              continue;
          }

          nodoAnterior = nodoAux;
          nodoAux = nodoAux.getProximo();
      }
    }

    public Object recuperar(Integer pos){
        if (this.esVacia()){
            return null;
        }
        if (pos > this.longitud || pos < 0){
            return null;
        }

        Nodo nodoAux = primero;
        int i;
        for (i= 0; i <= pos; i++){

            if (i == pos){
                return nodoAux.getDato();
            }
            nodoAux = nodoAux.getProximo();
        }

        return null;
    }
    //REVISAR
    public void insertar(Integer pos, Object dato){
        if (this.esVacia()){
            return;
        }
        if (pos > this.longitud || pos < 0){
            return;
        }

        Nodo newNodo = new Nodo(dato);
        Nodo nodoAux = primero;
        Nodo anterior = primero;
        int i;
        for (i= 0; i <= pos; i++){

//            PROBLEMAS :C
            if (i == pos){
                newNodo.setProximo(nodoAux);
                anterior.setProximo(newNodo);
                if (pos == 0){
                    primero = newNodo;
                }
                longitud += 1;
                return;
            }
            anterior = nodoAux;
            nodoAux = nodoAux.getProximo();
        }
    }


    // Tres caracteristicas de un objeto: Estado, Comportamiento, Identidad.
    // Diferencia entre objeto y mensaje ??
    /* El mensaje es la forma en la que un objeto cliente se comunnica con el metodo del objeto.
    El mensaje

    //Funciones privadas
    private Nodo ultimo(){
        if (esVacia()) {
            return primero;
        }

        Nodo nodoAux = new Nodo();
        nodoAux = primero;
        while(nodoAux.getProximo() != null){
            nodoAux = nodoAux.getProximo();
        }
        return nodoAux;
    }*/
}
