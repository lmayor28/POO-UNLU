package TP2.EJ3;

import Util.NombreApellidoAleatorio;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;

    private static Integer contadorProfesores = 0;

    public Profesor() {
        this(NombreApellidoAleatorio.Nombre(), NombreApellidoAleatorio.Apellido());
    }

    public Profesor(String nombre, String apellido) {
        this(nombre, apellido, contadorProfesores.toString());
    }

    public Profesor(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        contadorProfesores++;
    }

    @Override

    public String toString() {
        return "Profesor: " + this.nombre + " " + this.apellido + " DNI: " + this.dni;
    }
}
