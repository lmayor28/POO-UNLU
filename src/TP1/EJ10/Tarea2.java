package TP1.EJ10;
// Clase modificada que es heredera de Tarea.


import TP1.EJ5.Tarea;

public class Tarea2 extends Tarea{
    public Tarea2(String descripcion, int prioridad) {
        super(descripcion, prioridad);
    }

    @Override
    public void mostrarTarea() {
        System.out.println("Tarea: " + getDescripcion() + "\n Estado: " + getEstado() + ".\n Prioridad: " + getPrioridad());
    }

    @Override
    public boolean tareaVencida() {
        return false;
    }
}
