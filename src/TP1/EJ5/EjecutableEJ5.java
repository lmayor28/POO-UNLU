package TP1.EJ5;

import java.time.LocalDate;
// Preguntar sobre como se maneja el completado en fechas anteriores, si usar un localDate especifico y no usar el LocalDate.now();
public class EjecutableEJ5 {
    public static void main(String[] args) {

        // Primera tarea con el tiempo de vencimiento para mañana.
        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 1, LocalDate.now().plusDays(1));

        // Segunda tarea con el tiempo de vencimiento para ayer.
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 2, LocalDate.now().minusDays(1));

        // Tercera tarea con el tiempo de vencimiento para hoy.
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3,  LocalDate.now().minusDays(1));

        tarea1.mostrarTarea();
        tarea2.completarTareaConTrampas(LocalDate.now().minusDays(2));

        tarea2.mostrarTarea();
        tarea3.mostrarTarea();

        System.out.println("\nSe completan todas las tareas.... \n");
        tarea1.completarTarea();
        //tarea2.completarTareaConTrampas(LocalDate.now().minusDays(2));
        tarea3.completarTarea();

        tarea1.mostrarTarea();
        tarea2.mostrarTarea();
        tarea3.mostrarTarea();
    }
}
