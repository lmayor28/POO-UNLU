package TP1.EJ8;

import Clases.ListaEnlazada;

public class EjecutableEJ8 {
    public static void main(String[] strings){
        GeneradoContrasenias generadoContrasenias = new GeneradoContrasenias();

        System.out.println("El generado de contraseñas se ha generado y estas son 5 contraseñas que se han generado:");
        ListaEnlazada contrasenias = new ListaEnlazada();

        for (int i = 0; i < 5; i++){
            String contrasenia = generadoContrasenias.generarContrasenia();
            System.out.println("Contraseña " + (i + 1) + ": " + contrasenia + ". Es fuerte?? " +
                    (generadoContrasenias.esFuerte(contrasenia) ? "Si" : "No"));
            contrasenias.agregarElemento(contrasenia);
        }
        System.out.println(contrasenias);
    }
}
