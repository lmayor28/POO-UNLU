package TP2.EJ11.TipoVehiculos;

public class Combi extends Auto{
    public Combi(String patente, short cantidadAsientos, double precioBase, double precioPorAsiento){
        super(patente, cantidadAsientos, precioBase, precioPorAsiento);
    }

    @Override
    protected TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo.COMBI;
    }
}
