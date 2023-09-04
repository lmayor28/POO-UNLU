package TP1.EJ10;

import java.time.LocalDate;

public class EjecutableEJ10 {
    public static void main(String[] args){
//        Queremos extender la clase Tarea que tuvimos que desarrollar como ejercicio en la clase introductoria. Ahora se les puede establecer una fecha de recordatorio a las tareas, si esa fecha de recordatorio es mayor o igual a la fecha actual entonces las tareas se van a imprimir con el prefijo “(por vencer)”. Además, si la tarea se encuentra próxima a vencer (fecha posterior o igual a la del recordatorio) la prioridad sube a la más alta.
//                Objetivos:
//
//        Definir estructura y comportamiento.
//        Implementar los cambios y realizar pruebas para verificar el correcto funcionamiento
        Tarea2 tarea = new Tarea2("Sacar la basura dentro de dos dias",
                                  "SacarBasura",
                                  2,
                                   LocalDate.now().plusDays(2), // Fecha Limite.
                                   LocalDate.now().plusDays(1)  // Fecha Recordatorio.
        );

        System.out.println("\nSe ha creado una Tarea con fecha de vencimiento para dentro de dos dias y con un recordatorio para dentro de un dia.\n");
        tarea.mostrarTarea();

        tarea.setFechaRecordatorio(LocalDate.now().minusDays(1));
        System.out.println("\nSe ha modificado la Tarea para tener la misma fecha de vencimiento pero con una fecha de recordatorio para un dia anterior que el de ahora\n");
        tarea.mostrarTarea();



    }
}
