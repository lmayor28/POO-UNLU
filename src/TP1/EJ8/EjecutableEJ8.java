package TP1.EJ8;

import Clases.ListaEnlazada;

import java.util.Scanner;

public class EjecutableEJ8 {
    public static void main(String[] strings){

        AdministradorDeContrasenias generadorContrasenias = new AdministradorDeContrasenias();
        System.out.println("El generador de contraseñas se ha creado..");

        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        Scanner scanner = new Scanner(System.in);
        generadorContrasenias.generarContrasenias(scanner.nextInt());
        System.out.println("La cantidad de contraseñas generadas es: " + generadorContrasenias.cantidadContrasenias());
        System.out.println(generadorContrasenias.mostrarContrasenias());
    }
}
