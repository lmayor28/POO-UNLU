package TP1.EJ9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendario {
    public LocalDate transforFechaFromString(String fecha) {
        fecha = fecha.replaceAll("/", "-");
        //DateTimeFormatter.ofPattern("fecha");
        DateTimeFormatter[] formats = {
                DateTimeFormatter.ofPattern("d-M-yyyy"),
                DateTimeFormatter.ofPattern("M-d-yyyy")
        };

        for (DateTimeFormatter format : formats){
            try {
                return LocalDate.parse(fecha, format);
            } catch (Exception e){
                // Ignora
            }
        }

        return null;
    }
        /*
        String[] fechaPartida = fecha.split("/");
        int d, m, y;

        switch (tipo) {
            case 1:
                d = Integer.parseInt( fechaPartida[0] );
                m = Integer.parseInt( fechaPartida[1] );
                y = Integer.parseInt( fechaPartida[2] );
                break;

            case 2:
                d = Integer.parseInt( fechaPartida[1] );
                m = Integer.parseInt( fechaPartida[0] );
                y = Integer.parseInt( fechaPartida[2] );
                break;
            default:
                return null;
        };

        return LocalDate.of(y, m, d);
         */


    public boolean estaFechaEntreDosFechas(LocalDate fecha, LocalDate fechaInicial, LocalDate fechaFinal){
        if(fecha == null){
            return false;
        }
        return fecha.isAfter(fechaInicial) && fecha.isBefore(fechaFinal);
    }

    public boolean fechaMayorQue(LocalDate fecha, LocalDate fechaInicial){
        if(fecha == null){
            return false;
        }
        return fecha.isAfter(fechaInicial);
    }

    public boolean fechaMenorQue(LocalDate fecha, LocalDate fechaInicial){
        if (fecha == null){
            return false;
        }
        return fecha.isBefore(fechaInicial);
    }
}
