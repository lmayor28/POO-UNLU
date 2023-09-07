package TP1.EJ13;
// Clase modificada que es heredera de Tarea.


import TP1.EJ1.ListaEnlazada;
import TP1.EJ5.Tarea;

import java.time.LocalDate;

public class TareaColaborador extends Tarea{
    private String titulo;
    private LocalDate fechaRecordatorio;
    private Colaborador colaboradorTermindo = null;
    public TareaColaborador(String descripcion, String titulo, int prioridad) {
        this(descripcion, titulo, prioridad, null);
    }

    public TareaColaborador(String descripcion, String titulo, int prioridad, LocalDate fechaLimite){
        this(descripcion, titulo, prioridad, fechaLimite, null);
    }

    public TareaColaborador(String descripcion, String titulo, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
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

    public Colaborador getColaboradorTermindo() {
        return colaboradorTermindo;
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
    @Override
    public void completarTarea(){
        throw new UnsupportedOperationException("El método no está disponible sin que se le ingrese un colaborador");
    }
    public void completarTarea(Colaborador colaborador){
        // Si el estado de la tarea NO es incompleta, no hace nada.
        if ((this.estado == Estado.vencida || this.estado == Estado.completa)){
            return;
        }

        // Si el estado de la tarea es incompleta marca la fecha de completación.
        this.fechaCompletada = LocalDate.now();

        // Comprobamos si la tarea es vencida o no y le asignamos su estado correspondiente.
        if(this.fechaLimite.isBefore(LocalDate.now())){
            this.estado = Estado.vencida;
            return;
        }
        this.colaboradorTermindo = colaborador;
        this.estado = Estado.completa;
    }

    public String toString(){

        this.revisarEstado();
        return "Tarea: " + this.getTitulo() +
                ".\nDescripción: " + getDescripcion() +
                ".\n Estado: " + getEstado() +
                ".\n Prioridad: " + getPrioridad() +
                ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite) +
                ".\n Fecha de recordatorio: " + (this.fechaRecordatorio == null ? " Sin definir " : this.fechaRecordatorio) +
                ".\n Terminado por: " + (this.getEstado() == Estado.completa ? this.colaboradorTermindo.getNombre() : "- Sin definir -");
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
