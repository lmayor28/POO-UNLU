package TP2.EJ1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorDeSocios {
    private class SocioInfo{
        private boolean pagoMes = false;
        private LocalDate fechaDePagoMes;
        private LocalDate fechaDeIngreso;
        private Suscripcion TipoSuscripcion;

        public Suscripcion getTipoSuscripcion() {
            return TipoSuscripcion;
        }
    }
    public enum Suscripcion {
        basica,
        intermedia,
        destacada
    }


    private HashMap<Socio, SocioInfo> socioHM;
    private ArrayList<Socio> socios;

    public boolean agregarSocio (Socio socio){
        if (socios.contains(socio)){
            return false;
        }

        socios.add(socio);
        socioHM.put(socio, new SocioInfo());

        return true;
    }

    public String reporteDdeNuevosSocios(){
       String resultado = "Los nuevos socios que se agregaron este mes: ";

       int cantSocioNuevos = 0;
       for (Map.Entry<Socio, SocioInfo> entry: socioHM.entrySet()){
           Socio socio = entry.getKey();
           SocioInfo info = entry.getValue();

           if (LocalDate.now().minusMonths(1).isEqual(info.fechaDeIngreso)){
               cantSocioNuevos++;
               resultado += " --> Socio nro " + cantSocioNuevos + ":\n     " + socio.getNombre() +
                       " se ha unido el " + info.fechaDeIngreso +
                       " con una suscripcion de tipo: " + info.getTipoSuscripcion();

           }
       }

       return resultado;
    }

    public ArrayList<>






}
