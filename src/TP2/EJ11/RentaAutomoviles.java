package TP2.EJ11;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class RentaAutomoviles {

    HashMap<String, Vehiculo> VEHICULOS = new HashMap<>();
    ArrayList<Cliente> CLIENTES = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        if(existeVehiculo(vehiculo.getPatente())){
            return;
        }

        VEHICULOS.put(vehiculo.getPatente(), vehiculo);
    }

    public double pedirPresupuestoParaVehiculo(Cliente cliente, String patente, LocalDate fInicio, LocalDate fFin){
        if (!esValidaRenta(patente, fInicio, fFin)){
            return 0;
        }

        return calcularPrecio(fInicio, fFin, VEHICULOS.get(patente).getPrecio());
    }

    private double calcularPrecio(LocalDate fInicio, LocalDate fFin, double precioDia){
        int dias = (int) (fFin.toEpochDay() - fInicio.toEpochDay());
        return dias * precioDia;
    }

    private boolean esValidaRenta(String patente, LocalDate fInicio, LocalDate fFin){
        if (fInicio == null || fFin == null){
            return false;
        }

        if (!existeVehiculo(patente)){
            return false;
        }

        if (fInicio.isAfter(fFin)){
            return false;
        }

        return true;
    }

    private boolean existeVehiculo(String patente){
        if (patente == null){
            return false;
        }
        if (VEHICULOS.containsKey(patente)){
            System.out.println("El vehiculo ya existe");
            return true;
        }

        return false;
    }
}
