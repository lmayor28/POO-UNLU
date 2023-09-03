package TP1.EJ9;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class EjecutableEJ9 {
    public static void main(String[] args){
        Calendario calendario = new Calendario();

        System.out.println("Se ha creado un calendario que tiene las diferentes funciones para manejar la fecha");
        System.out.println("Se crea una fecha de tipo Time.LocalDate a partir del string '28/3/2001' y con '10/28/2001' .");

        LocalDate fecha1 = calendario.transforFechaFromString("28/3/2001", 1);
        LocalDate fecha2 = calendario.transforFechaFromString("10/28/2001", 2);

        System.out.println("Fecha 1: " + fecha1);
        System.out.println("Fecha 2: " + fecha2);

        System.out.println("Como se puede ver las dos fechas se formatean en la clase LocalDate sin importar el formato.");

        System.out.println("\nIngresar una fecha para poder decir si esa fecha esta entre las dos fechas anteriores: ");
        Scanner scanner = new Scanner(System.in);
        String fechaIngresada = scanner.nextLine();
        System.out.println("Ingresar el formato con el que se ingreso la fecha(1 para dia/mes/año y 2 para mes/dia/año): ");
        int formato = scanner.nextInt();
        LocalDate fechaIngresadaLocalDate = calendario.transforFechaFromString(fechaIngresada, formato);

        System.out.println("Fecha ingresada: " + fechaIngresadaLocalDate);
        System.out.println("La fecha " +
                (calendario.estaFechaEntreDosFechas(fechaIngresadaLocalDate, fecha1, fecha2) ? "SI" : "NO") +
                " esta entre las dos fechas anteriores.");

        System.out.println("\nAhora se van a compar la fecha ingresada contra las dos primeras fechas ya cargadas");
        System.out.println("La fecha ingresada: " + fechaIngresadaLocalDate + " es " +
                (calendario.fechaMayorQue(fechaIngresadaLocalDate, fecha1) ? "mayor que " : "menor que ") + fecha1);

        System.out.println("La fecha ingresada: " + fechaIngresadaLocalDate + " es " +
                (calendario.fechaMenorQue(fechaIngresadaLocalDate, fecha1) ? "menor que " : "mayor que ") + fecha1);

        System.out.println("La fecha ingresada: " + fechaIngresadaLocalDate + " es " +
                (calendario.fechaMayorQue(fechaIngresadaLocalDate, fecha2) ? "mayor que " : "menor que ") + fecha2);

        System.out.println("La fecha ingresada: " + fechaIngresadaLocalDate + " es " +
                (calendario.fechaMenorQue(fechaIngresadaLocalDate, fecha2) ? "menor que " : "mayor que ") + fecha2);
    }
}
