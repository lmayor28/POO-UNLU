package TP2.EJ3;

import java.util.ArrayList;
import java.util.Random;

public class Diagramacion {
    private ArrayList<Dia> horarios;
    private AcademiaDanza.Niveles nivel;
    private String disciplina;
    private Profesor profesor;

    private int cantidadAsistencia;
    private ArrayList<Alumnos> alumnos;

    // Variable para guardar la cantidad de asistencia que tiene esta diagrmacion mes por mes.
    private int[] asistenciaPorMes;

    private double pagaDiagramacion;


// ------------------- CONSTRUCTORES -------------------
    public Diagramacion(){
        Random random = new Random();
        String[] diciplinas = {"Ballet", "Danza", "Tango", "Violin", "Canto", "Piano"};

        this.horarios = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        horarios.add(new Dia());
        horarios.add(new Dia());

        this.nivel = AcademiaDanza.Niveles.values()[random.nextInt(AcademiaDanza.Niveles.values().length + 1) - 1];
        this.disciplina = diciplinas[random.nextInt(diciplinas.length + 1) - 1];
        this.profesor = new Profesor();

    }

    public Diagramacion (AcademiaDanza.Niveles nivel, String disciplina, Profesor profesor) {
        this.horarios = new ArrayList<>();
        horarios.add(new Dia());
        horarios.add(new Dia());

        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
    }

    public Diagramacion(AcademiaDanza.Niveles nivel, String disciplina, Profesor profesor, Dia dia) {
        this.horarios = new ArrayList<>();
        horarios.add(dia);

        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
    }

    public Diagramacion(AcademiaDanza.Niveles nivel, String disciplina, Profesor profesor, ArrayList<Dia> horarios) {
        this.horarios = horarios;

        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
    }
// ------------------- FIN DE CONSTRUCTORES -------------------

    public void tomarAsistencia(Alumnos alumno){
        // Hacer validación de que el mismo alumno no se asistió más de una vez en el mismo día.
        System.out.println(alumno + " asistio a la clase de " + this.disciplina + ". Con un total de " + (this.cantidadAsistencia + 1) + " asistencias en el mes.");

        this.cantidadAsistencia++;
    }

    public AcademiaDanza.Niveles getNivel() {
        return nivel;
    }

    public void agregarAlumnos(int cantidadDeAlumnos){
        for (int i = 0; i < cantidadDeAlumnos; i++) {
            this.alumnos.add(new Alumnos());
        }
    }

    public void agregarAlumno(Alumnos alumno){
        this.alumnos.add(alumno);
    }

    public Profesor getProfesor(){
        return this.profesor;
    }

    public void agregarDia(Dia dia) {
        this.horarios.add(dia);
    }

    public ArrayList<Dia> getHorarios() {
        return horarios;
    }

    public void eliminarDia(int dia) {
        if (dia >= 0 && dia < this.horarios.size()){
            this.horarios.remove(dia);
        }
    }

    public void eliminarDia(Dia dia) {
        this.horarios.remove(dia);
    }

    public int getCantidadAsistencia() {
        return cantidadAsistencia;
    }

    public double getPagaDiagramacion(double pagaPorAsistencia){
        calcularPagaDiagramacion(pagaPorAsistencia);
        return this.pagaDiagramacion;
    }

    private void calcularPagaDiagramacion(double pagaPorAsistencia){
        this.pagaDiagramacion = this.cantidadAsistencia * pagaPorAsistencia;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        String horariosToString = "";
        for (Dia dia : this.horarios) {
            horariosToString +=  "\n   -> " + dia.toString();
        }
        return "Diagramacion:  " + this.disciplina +
                "\n -> Horarios: " + horariosToString +
                "\n -> Nivel: " + this.nivel +
                "\n -> Profesor: " + this.profesor +
                "\n -> Total pagado: " + this.pagaDiagramacion;
    }
}
