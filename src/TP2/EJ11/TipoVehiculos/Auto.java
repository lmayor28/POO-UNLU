package TP2.EJ11.TipoVehiculos;

import TP2.EJ11.Vehiculo;

public class Auto extends Vehiculo {

    private double precioPorAsiento;
    private short cantidadAsientos;

    public Auto(String patente, short cantidadAsientos, double precioBase, double precioPorAsiento){
        super(patente, precioBase);
        this.precioPorAsiento = precioPorAsiento;
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    protected TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo.AUTO;
    }

    @Override
    protected void calcularPrecio() {
        double precioCalculado = this.getPrecioBase() + (this.getCantidadAsientos() * this.precioPorAsiento);
        this.setPrecio(precioCalculado);
    }
}
