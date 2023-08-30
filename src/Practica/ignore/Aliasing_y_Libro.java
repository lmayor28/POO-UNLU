package Practica.ignore;

import TP1.EJ6.Libro;
public class Aliasing_y_Libro {
    public static void main(String[] args){
        String titulo = "Hola";
        Libro libro1 = new Libro(titulo, "Luis", 1999, "123", 100, 10);
        Libro libro2 = new Libro(titulo, "Enzo", 2031, "1233", 100, 10);

        libro1.mostrarNuevaDescripcion();
        libro2.mostrarNuevaDescripcion();

        libro1.mostrarNuevaDescripcion();
        libro2.mostrarNuevaDescripcion();

        Libro copiaLibro1 = libro1;


    }


}
