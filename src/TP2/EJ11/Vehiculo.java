package TP2.EJ11;

public abstract class Vehiculo {

    public enum TipoVehiculo {
        AUTO, AUTO_VIP, COMBI, CAMIONETA, CAMION_CARGA
    }

    private TipoVehiculo tipoVehiculo;
    private double precio;
    private double precioBase;
    private String patente;
    private short cantidadAsientos;

    private boolean disponible;

    public Vehiculo(String patente, double precioBase) {
        this.patente = patente;
        this.precioBase = precioBase;
        this.tipoVehiculo = getTipoVehiculo();
        this.disponible = true;
    }

    protected void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    protected abstract TipoVehiculo getTipoVehiculo();

    protected short getCantidadAsientos() {
        return cantidadAsientos;
    }

    protected double getPrecioBase() {
        return precioBase;
    }

    protected void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        calcularPrecio();
        return this.precio;
    }


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    protected abstract void calcularPrecio();

    public String getPatente() {
        return patente;
    }
}
