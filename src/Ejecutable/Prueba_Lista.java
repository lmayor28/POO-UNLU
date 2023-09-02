package Ejecutable;

import Clases.ListaEnlazada;

import java.util.Random;

public class Prueba_Lista {
    public static void main(String[] args){
        System.out.println("Pruebas con Listas: Se carga la lista con numeros aleatorios");

        ListaEnlazada lista = new ListaEnlazada();

        for (int i = 1; i<10; i++){
            //int randomNumber = new Random().nextInt(10,100);
            lista.agregarElemento(i);
        }
        //lista.agregarElemento(null);

        //AGREGAR ELEMENTOS
        System.out.println("-------------------------------------------------------------");
        lista.agregarElemento("hola");
        System.out.println("Se imprimen los elementos de la lista");
        System.out.println(lista);
        System.out.println("-------------------------------------------------------------");
        //METODO RECUPERAR
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se utiliza el metodo recuperar para probar: ");
        System.out.println("Elemento a recuperar: " + lista.recuperar(3).toString() + "\n");
        System.out.println("Se elimina el primer y quinto elemento de la lista\n");
        System.out.println("-------------------------------------------------------------");
        //ELIMINAR ELEMENTOS

        System.out.println("-------------------------------------------------------------");
        lista.eliminar(0);
        lista.eliminar(3);
        lista.eliminar(4);
        if(!lista.eliminar(15)){
            System.out.println("No se pudo eliminar el elemento 15\n");
        }
        lista.eliminar("hola");
        System.out.println(lista);
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
        System.out.println(lista);

        if(!lista.insertar( -1, "Elemento Insertado 2")){
            System.out.println("1-No se pudo insertar el elemento\n");
        }

        if(!lista.insertar( lista.longitud() + 1, "Elemento Insertado 2")){
            System.out.println("2-No se pudo insertar el elemento\n");
        }
        System.out.println("Logitud = " + lista.longitud());
        System.out.println(lista);




        System.out.println("Fin de pruebas");
    }
}
