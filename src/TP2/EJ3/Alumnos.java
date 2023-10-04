package TP2.EJ3;

import Util.NombreApellidoAleatorio;
public class Alumnos {
    private String nombre;
    private String apellido;
    private int dni;
    private static int contadorAlumnos = 0;

    public Alumnos() {
        this(NombreApellidoAleatorio.Nombre(), NombreApellidoAleatorio.Apellido());
    }

    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = contadorAlumnos;
        contadorAlumnos++;
    }

    @Override
    public String toString() {
        return " --Alumno: " + this.nombre + " " + this.apellido + " DNI: " + this.dni;
    }
}
