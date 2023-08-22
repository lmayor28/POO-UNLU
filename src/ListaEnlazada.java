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
        Nodo newNodo = new Nodo();
        if (esVacia()){
            newNodo.setDato(dato);
            primero = newNodo;
            ultimo = newNodo;
            longitud = 0;

        } else {
            newNodo.setDato(dato);
            ultimo.setProximo(newNodo);
            ultimo = newNodo;
            longitud += 1;
        }
    }

    public void eliminar(Object dato){
      if (esVacia()){
          return;
      }

      Nodo nodoAux;
      Nodo nodoAnterior = new Nodo();
      nodoAux = primero;

      while (nodoAux != null){
          if (nodoAux.getDato() == dato){
              // Enlaza el anterior nodo con el siguiente del objetivo.
              nodoAnterior.setProximo(nodoAux.getProximo());
              longitud -= 1;
              continue;
          }

          nodoAux = nodoAux.getProximo();
          nodoAnterior = nodoAux;
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

    public void insertar(Integer pos, Object dato){
        if (this.esVacia()){
            return;
        }
        if (pos > this.longitud || pos < 0){
            return;
        }

        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
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

    //Funciones privadas
    /*private Nodo ultimo(){
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
