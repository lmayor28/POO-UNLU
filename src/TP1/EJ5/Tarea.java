package TP1.EJ5;
import java.time.LocalDate;



public class Tarea {

    public enum Estado {
        incompleta,
        completa,
        vencida,
        porVencer;

        @Override
        public String toString(){
            return switch (this){
                case incompleta -> "Incompleta";
                case completa -> "Completa";
                case vencida -> "Vencida";
                case porVencer -> "Por vencer";
                default -> throw new IllegalArgumentException();
            };
        } // FIN TO STRING
    } // FIN ENUM ESTADO

    protected String descripcion;
    protected int prioridad;
    protected Estado estado;
    protected LocalDate fechaLimite;
    protected LocalDate fechaCompletada;

//    Constructor:
    public Tarea(String descripcion, int prioridad){
        this(descripcion, prioridad, null);
    }
    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;

        // Comprobamos si la tarea es vencida o no y le asignamos su estado correspondiente.
        if (fechaLimite == null){
            this.estado = Estado.incompleta;
            return;
        }
        if (fechaLimite.isBefore(LocalDate.now())){
            this.estado = Estado.vencida;
        } else {
            this.estado = Estado.incompleta;
        }
    }

//    Setter y getter:
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public int getPrioridad(){
        return this.prioridad;
    }
    public Estado getEstado(){
        return this.estado;
    }
//    FUNCIONES:
    public void completarTarea(){
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
        this.estado = Estado.completa;
    }

    public void completarTareaConTrampas(LocalDate fechaCompletar){
        // Si el estado de la tarea NO es incompleta, no hace nada.
        //if (!(this.estado == Estado.incompleta)){
        //    return;
        //}

        // Si el estado de la tarea es incompleta marca la fecha de completación.
        this.fechaCompletada = fechaCompletar;

        // Comprobamos si la tarea es vencida o no y le asignamos su estado correspondiente.
        if(this.fechaLimite.isBefore(fechaCompletar)){
            this.estado = Estado.vencida;
            return;
        }
        this.estado = Estado.completa;
    }
    public void mostrarTarea(){
//        System.out.println("Estado: " + getEstado() +".\n Tarea: " + getDescripcion() + ".\n Prioridad: " + getPrioridad());
//        System.out.println("Tarea: " + getDescripcion() + "\n Estado: " + getEstado() + ".\n Prioridad: " + getPrioridad());
        System.out.println("Tarea: " + getDescripcion() +
                "\n Estado: " + getEstado() +
                ".\n Prioridad: " + getPrioridad() +
                ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite)
        );
    }
    public boolean tareaVencida(){
        return this.estado == Estado.vencida;
    }
}
