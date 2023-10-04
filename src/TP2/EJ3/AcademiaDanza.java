package TP2.EJ3;

import java.util.ArrayList;
import java.util.Random;

public class AcademiaDanza {
    public enum Niveles{
        INICIAL,
        INTERMEDIO,
        AVANZADO
    }

    private ArrayList<Diagramacion> diagramaciones;
    private double pagaPorAsistencia;

    private String nombre;

    public AcademiaDanza(String nombre) {
        this.diagramaciones = new ArrayList<>();
        pagaPorAsistencia = 10.0;
        this.nombre = nombre;
    }

    public void agregarDiagramacion(Diagramacion diagramacion) {
        this.diagramaciones.add(diagramacion);
    }

    public void agregarDiagramacion(Niveles nivel, String disiplina, Profesor profesor){
        this.diagramaciones.add(new Diagramacion(nivel, disiplina, profesor));
    }

    public void agregarDiagramacion(){
        this.diagramaciones.add(new Diagramacion());
    }

    public void eliminarDiagramacion(Diagramacion diagramacion) {
        this.diagramaciones.remove(diagramacion);
    }

    public double calcularPagaDeProfesor(Profesor profesor){
        for (Diagramacion diagramacion : this.diagramaciones) {
            if (diagramacion.getProfesor() == profesor) {
                return diagramacion.getPagaDiagramacion(pagaPorAsistencia);
            }
        }

        return 0;
    }

    public Diagramacion DiagramacionMayorPaga(){
        double mayorPaga = 0;
        Diagramacion diagramacionMejorPaga = null;
        for (Diagramacion diagramacion : this.diagramaciones){
            if (diagramacion.getPagaDiagramacion(pagaPorAsistencia) > mayorPaga){
                mayorPaga = diagramacion.getPagaDiagramacion(pagaPorAsistencia);
                diagramacionMejorPaga = diagramacion;
            }
        }

        return diagramacionMejorPaga;
    }

    public void cargarRandomTodo(){
        Random random = new Random();
        for (Diagramacion diagramacion : diagramaciones){
            diagramacion.agregarAlumnos(random.nextInt(42));
        }
    }

    public void cargarAsistenciaRandom(){
        Random random = new Random();
        for (Diagramacion diagramacion : diagramaciones){
            for (Alumnos alumno : diagramacion.getAlumnos()){
                if (random.nextBoolean()){
                    diagramacion.tomarAsistencia(alumno);
                }
            }
        }
    }

    @Override
    public String toString() {
        String diagramacionesToString = "";
        for (Diagramacion diagramacion : diagramaciones){
            diagramacionesToString += diagramacion.toString() + "\n\n * ";
        }

        return "AcademiaDanza:  " + this.nombre + "\n * " + diagramacionesToString;
    }


}
