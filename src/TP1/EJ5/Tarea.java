package TP1.EJ5;
import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean estado = false;
    private LocalDate fechaLimite;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
        //LocalDate date = new LocalDate(2012, 12, 4);

    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean getEstado(){
        return this.estado;
    }

    public void mostrarTarea(){
        if(this.getEstado()){
            System.out.println(this.descripcion);
        }
    }
}
