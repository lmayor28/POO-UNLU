package TP2.EJ10;
import TP2.EJ10.TiposEmpleados.*;

import java.util.Random;

public class EjecutableEJ10 {
    public static void main(String[] args) {
        Random random = new Random();

        Empleados[] empleados = new Empleados[5];
        empleados[0] = new PorHora(random.nextInt(40 ,100), 50);
        empleados[4] = new PorHora(random.nextInt(30), 50);

        empleados[1] = new ComisionesConBaseFija(random.nextInt(200) * 10, random.nextInt(1, 9) * 0.1, 1000);
        empleados[2] = new Comisiones(random.nextInt(200) * 10, random.nextInt(1, 9) * 0.1);
        empleados[3] = new Asalariados(random.nextInt(200) * 10);

        empleados[3].setEsCumpleanios(true);
        empleados[4].setEsCumpleanios(true);
        empleados[2].setEsCumpleanios(true);

        for (Empleados empleado : empleados) {
            System.out.println(empleado);
            System.out.println("\n");
        }
    }
}
