package TP2.EJ11.TipoVehiculos;

import TP2.EJ11.Vehiculo;

public class Camionetas extends Vehiculo {
    private double PAT;
    private final double precioPorPAT;

    public Camionetas(String patente, double precioBase, double precioPorPAT) {
        super(patente, precioBase);
        this.PAT = PAT;
        this.precioPorPAT = precioPorPAT;
    }

    @Override
    protected TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo.CAMIONETA;
    }

    @Override
    protected void calcularPrecio() {
        double precio = this.getPrecioBase() + (this.precioPorPAT * this.PAT);
        this.setPrecio(precio);
    }
}
