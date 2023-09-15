package TP1.EJ13;



import java.time.LocalDate;
import java.util.Random;

public class EjecutableEJ13 {
    public static void main(String[] args){
        Colaborador[] colaboradores = {
                new Colaborador("Luis"),
                new Colaborador("Genaro"),
                new Colaborador("Gonzalo"),
                new Colaborador("Manuel")
        };

        Random random = new Random();
        AdministradorDeTareasColaboradores administradorDeTareas = new AdministradorDeTareasColaboradores();
        for (int i = 0; i < 10; i++){
            administradorDeTareas.nuevaTarea("Descripcion de la tarea " + i,
                    "Tarea " + i, random.nextInt(1, 20),
                    (i > 1 ? LocalDate.now().plusDays(i - 1) : LocalDate.now().minusDays(i + 1)),
                    (i > 4 ? LocalDate.now().minusDays(random.nextInt(-3, 2)) : LocalDate.now().plusDays(i)));
        }

        for ( Object tareaObj : administradorDeTareas.tareasActivasPrioridad()){
             TareaColaborador tarea = (TareaColaborador) tareaObj;

             administradorDeTareas.marcarTerminada(tarea, colaboradores[random.nextInt(0, 3)]);
        }

        System.out.println("Se completaron las tareas aleatoriamente por diferentes colaboradores");
        System.out.println(administradorDeTareas);

        System.out.println("Tarea ordenada por Colaborador");
        System.out.println(administradorDeTareas.tareaTerminadaPorColaborador(colaboradores[0]));



    }
}
