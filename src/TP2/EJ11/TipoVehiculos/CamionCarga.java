package TP2.EJ11.TipoVehiculos;

import TP2.EJ11.Vehiculo;

public class CamionCarga extends Vehiculo {

    public CamionCarga(String patente, double precioBase){
        super(patente, precioBase);
    }

    @Override
    public void calcularPrecio(){
        this.setPrecio(this.getPrecioBase());
    }

    @Override
    protected TipoVehiculo getTipoVehiculo(){
        return TipoVehiculo.CAMION_CARGA;
    }
}
