package TP1.EJ10;
// Clase modificada que es heredera de Tarea.


import TP1.EJ5.Tarea;

import java.time.LocalDate;
import java.util.Formatter;

public class Tarea2 extends Tarea{
    private String titulo;
    LocalDate fechaRecordatorio;
    public Tarea2(String descripcion, String titulo, int prioridad) {
        this(descripcion, titulo, prioridad, null);
    }

    public Tarea2(String descripcion, String titulo, int prioridad, LocalDate fechaLimite){
        this(descripcion, titulo, prioridad, fechaLimite, null);
    }

    public Tarea2(String descripcion, String titulo, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        super(descripcion, prioridad, fechaLimite);
        this.titulo = titulo;
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    // Setter Getters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarTarea() {
        revisarEstado();
        System.out.println("Tarea: " + getDescripcion() +
                           "\n Estado: " + getEstado() +
                           ".\n Prioridad: " + getPrioridad() +
                           ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite) +
                           ".\n Fecha de recordatorio: " + (this.fechaRecordatorio == null ? " Sin definir " : this.fechaRecordatorio)
        );
    }

    public String toString(){

        this.revisarEstado();
        return "Tarea: " + this.getTitulo() +
                ".\nDescripción: " + getDescripcion() +
                ".\n Estado: " + getEstado() +
                ".\n Prioridad: " + getPrioridad() +
                ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite) +
                ".\n Fecha de recordatorio: " + (this.fechaRecordatorio == null ? " Sin definir " : this.fechaRecordatorio);
    }

    private void revisarEstado(){
//        if ( (this.estado == Estado.incompleta) && (this.fechaLimite != null) ){
//            if (this.fechaLimite.isBefore(LocalDate.now())){
//                this.estado = Estado.vencida;
//            } else
//            if (this.fechaRecordatorio != null){
//                if (LocalDate.now().isAfter(this.fechaRecordatorio) || LocalDate.now().isEqual(this.fechaRecordatorio)){
//                    if (this.estado == Estado.incompleta){
//                        this.setPrioridad(this.getPrioridad() + 1);
//                    }
//                    this.estado = Estado.porVencer;
//                }
//            }
//        }

        if ( !(this.estado == Estado.incompleta)){
            return;
        }

        if ( this.fechaLimite == null){
            return;
        }
        if (this.fechaLimite.isBefore(LocalDate.now())){
            this.estado = Estado.vencida;
            return;
        }

        if ( this.fechaRecordatorio == null ){
            return;
        }
        if (LocalDate.now().isAfter(this.fechaRecordatorio) || LocalDate.now().isEqual(this.fechaRecordatorio)){
            if (this.estado == Estado.incompleta){
                this.setPrioridad(this.getPrioridad() + 1);
            }
            this.estado = Estado.porVencer;
        }
    }


}
