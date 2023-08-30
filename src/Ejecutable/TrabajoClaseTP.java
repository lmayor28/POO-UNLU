package Ejecutable;

import Practica.ignore.TrabajoClase;
import java.util.ArrayList;

import Practica.ignore.MetodosClase;

public class TrabajoClaseTP {

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public static void main(String[] args) {
            MetodosClase.mostrarData();

            ArrayList<String> array = new ArrayList<String>();
            array.add("Text1");
            array.add("Text2");
            array.add("Text3");
            array.add("Text2");



            TrabajoClase clase = new TrabajoClase();
            System.out.println("Esta en la lista Text1 ??");
            System.out.println(clase.enLista("Text1", array));

            System.out.println("Cuantas veces se repite Text2 ??");
            System.out.println(clase.cantString("Text2", array));

            System.out.println("Se prueba el nuevo metodo de recorrer un bucle for: ");
            clase.mostrarListaConBucleFor(array);
        }
}
