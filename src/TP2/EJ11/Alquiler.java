package TP2.EJ11;

public class Alquiler {
    private int dias;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double montoTotal;
    private int id;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, int dias,  double montoTotal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "ALQUILER: " + id + "\n -> Cliente: " + cliente + "\n -> Vehiculo: " + vehiculo + "\n -> Dias: " + dias + "\n-> Monto Total: " + montoTotal;

    }
}
