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
            longitud += 1;

        } else {

            ultimo.setProximo(newNodo);
            ultimo = newNodo;
            longitud += 1;
        }
    }

    public boolean eliminar(Object dato){
      if (esVacia() || dato == null){
          return false;
      }

      Nodo nodoAux;
      Nodo nodoAnterior = new Nodo(null);
      nodoAux = primero;

      while (nodoAux != null){
          if (nodoAux.getDato().equals(dato)){
              // Enlaza el anterior nodo con el siguiente del objetivo.
              if (nodoAnterior.getDato() == null){
                  primero = nodoAux.getProximo();
                  longitud -= 1;
                  return true;
              }

              // 1 , 2 , 3
              nodoAnterior.setProximo(nodoAux.getProximo());
              longitud -= 1;
              return true;

          }

          nodoAnterior = nodoAux;
          nodoAux = nodoAux.getProximo();

      } // FIN DEL BUCLE

      return false;
    }

    // Toma un número ordinario (A partir de 1) y lo recupera.
    public Object recuperar(Integer pos){
        if (this.esVacia()){
            return null;
        }
        if (pos > this.longitud || pos < 1){
            return null;
        }

        Nodo nodoAux = primero;
        int i;
        for (i= 1; i <= pos; i++){

            if (i == pos){
                return nodoAux.getDato();
            }
            nodoAux = nodoAux.getProximo();
        }

        return null;
    }

    public boolean insertar(Integer pos, Object dato){
        if (this.esVacia()){
            return false;
        }
        if (pos > this.longitud() || pos < 1){
            return false;
        }

        Nodo newNodo = new Nodo(dato);
        Nodo nodoAux = primero;
        Nodo anterior = primero;
        if (pos == 1){
            newNodo.setProximo(primero);
            primero = newNodo;
            longitud += 1;
            return true;
        }
        int i;
        for (i= 1; i <= pos; i++){
            if (i == pos){
                newNodo.setProximo(nodoAux);
                anterior.setProximo(newNodo);
                if (pos == 1){
                    primero = newNodo;
                }
                longitud += 1;
                return true;
            }
            anterior = nodoAux;
            nodoAux = nodoAux.getProximo();
        }
        return false;
    }

    public Iterador iterador(){
        return new Iterador(primero);
    }

    public String toString() {
        //imprime por pantalla la lista de los nodos.
        String acumulador = "";//acumulador de strings.
        int i = 1;
        Nodo nodoAux = primero;
        if (primero == null) {
            acumulador = "lista Vacia ";
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

