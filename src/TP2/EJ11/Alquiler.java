package TP2.EJ11;

public class Alquiler {

    private Presupuesto presupuesto;

    private final double montoTotalDefinitivo;
    private int id;

    public Alquiler(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
        montoTotalDefinitivo = presupuesto.getPrecioPresupuestado();
    }

    public double getMontoTotalDefinitivo(){
        return montoTotalDefinitivo;
    }

    @Override
    public String toString() {
        return "ALQUILER: " + id + "\n -> " + presupuesto.getCliente() + "\n -> Vehiculo: " + presupuesto.getVehiculo() + "\n -> Dias: " + presupuesto.getDias() + "\n-> Monto Total: " + montoTotalDefinitivo;

    }
}
