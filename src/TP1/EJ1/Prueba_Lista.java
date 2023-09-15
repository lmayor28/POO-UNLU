package TP1.EJ1;

public class Prueba_Lista {
    public static void main(String[] args){
        System.out.println("Pruebas con Listas: Se carga la lista con numeros aleatorios");

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("La lista esta vacia ?? " + (lista.esVacia() ? "VACIA" : "NO VACIA"));
        System.out.println("La lista se esta cargando...");
        for (int i = 1; i<10; i++){
            //int randomNumber = new Random().nextInt(10,100);
            lista.agregarElemento(i);
        }

        System.out.println("La lista esta vacia ??" + (lista.esVacia() ? "VACIA" : "NO VACIA"));

        //lista.agregarElemento(null);

        //AGREGAR ELEMENTOS
        System.out.println("-------------------------------------------------------------");
        lista.agregarElemento("hola");
        System.out.println("Se imprimen los elementos de la lista");
        System.out.println(lista);
        System.out.println("-------------------------------------------------------------");
        //METODO RECUPERAR
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se utiliza el metodo recuperar para recuperar el elemento del nodo 3: ");
        System.out.println("Elemento recuperado: " + lista.recuperar(3).toString() + "\n");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se elimina el primer, tercer, quinto y ultimo elemento de la lista\n");
        //ELIMINAR ELEMENTOS

        lista.eliminar(0);
        lista.eliminar(3);
        lista.eliminar(4);
        if(!lista.eliminar(15)){
            System.out.println("Se prueba la eliminacion de un elemento que no esta en la lista.");
            System.out.println("No se pudo eliminar el elemento 15\n");
        }
        lista.eliminar("hola");
        System.out.println("Se imprime la lista de nueva sin los elementos eliminados");
        System.out.println(lista);
        //System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Se prueba el metodo insertar");
        System.out.println("Elemento actual en la pos 3: " + lista.recuperar(3).toString());
        System.out.println("Se utilizo el metodo insertar ....");
        System.out.println("Se inserta un elemento en la pos 3");
        lista.insertar(3, "Elemento Insertado");

        System.out.println("Elemento nuevo en la pos 3: " + lista.recuperar(3).toString());
        System.out.println("Elemento en la pos 4: " + lista.recuperar(4).toString());
        System.out.println("-------------------------------------------------------------\n");

        System.out.println("Se prueba el metodo insertar en la primera posicion");
        lista.insertar(1, "Elemento Insertado en la primera Pos");
        System.out.println(lista);

//        if(!lista.insertar( -1, "Elemento Insertado 2")){
//            System.out.println("1-No se pudo insertar el elemento\n");
//        }
//
//        if(!lista.insertar( lista.longitud() + 1, "Elemento Insertado 2")){
//            System.out.println("2-No se pudo insertar el elemento\n");
//        }
        System.out.println("Logitud = " + lista.longitud());
        System.out.println(lista);




        System.out.println("Fin de pruebas");
    }
}
