package TP2.EJ3;

import java.time.LocalDate;
import java.util.Random;

public class Dia {
    public enum DiaSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    private final String horario;
    private final DiaSemana diaSemana;

    public Dia() {
        // Se genera un dia y un horario random
        Random random = new Random();
        String[] horarios = {"10:00 - 12:00", "12:00 - 14:00", "14:00 - 16:00", "16:00 - 18:00",  "18:00 - 20:00", "20:00 - 22:00",  "22:00 - 00:00"};

        this.horario = horarios[random.nextInt(horarios.length)];
        this.diaSemana = DiaSemana.values()[random.nextInt(6)];
    }

    public Dia(String horario, DiaSemana diaSemana) {
        this.horario = horario;
        this.diaSemana = diaSemana;
    }

    public String toString() {
        return "Dia " + diaSemana + " - " + horario;
    }




}
