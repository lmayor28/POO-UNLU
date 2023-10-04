package TP2.EJ11.TipoVehiculos;

import TP2.EJ11.Vehiculo;

public class AutoVIP extends Auto {
    public AutoVIP(String patente, short cantidadAsientos, double precioBase, double precioPorAsiento){
        super(patente, cantidadAsientos, precioBase, precioPorAsiento);
    }

    @Override
    protected TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo.AUTO_VIP;
    }

}
