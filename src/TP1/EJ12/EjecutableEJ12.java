package TP1.EJ12;

import TP1.EJ1.ListaEnlazada;
import TP1.EJ10.Tarea2;

import java.time.LocalDate;
import java.util.Random;

public class EjecutableEJ12 {
    public static void main(String[] args){

        Random random = new Random();
        AdministradorDeTareas administradorDeTareas = new AdministradorDeTareas();
        for (int i = 0; i < 10; i++){
            administradorDeTareas.nuevaTarea("Descripcion de la tarea " + i,
                                                  "Tarea " + i, random.nextInt(1, 20),
                    (i > 4 ? LocalDate.now().plusDays(i - 1) : LocalDate.now().minusDays(i + 1)),
                    (i > 4 ? LocalDate.now().minusDays(random.nextInt(-3, 2)) : LocalDate.now().plusDays(i)));
        }



        System.out.println(administradorDeTareas);

        System.out.println("\n\nSe ordenan las tareas por prioridad en una lista: \n");

        ListaEnlazada tareasPrioridadNoVencidas = administradorDeTareas.tareasActivasPrioridad();
        System.out.println(tareasPrioridadNoVencidas);

        System.out.println("\n\nSe completa una tarea, y no deberia de aparecer en la proxima lista que tiene las tareas por vencer\n\n");
        Tarea2 tareaNoVencida = (Tarea2) tareasPrioridadNoVencidas.recuperar(1);
        administradorDeTareas.marcarTerminada(tareaNoVencida);
        System.out.println(tareaNoVencida);
        //System.out.println(administradorDeTareas);


        System.out.println("\n\nSe ordenan las tareas por fecha de vencimiento: \n");
        System.out.println(administradorDeTareas.tareasActivaPorProximidad());

    }
}
