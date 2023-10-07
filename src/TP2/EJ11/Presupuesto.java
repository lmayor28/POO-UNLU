package TP2.EJ11;

import TP2.EJ11.TipoVehiculos.Camionetas;

public class Presupuesto {
    private int dias;
    private Cliente cliente;
    private Vehiculo vehiculo;

    private double precioPresupuestado;

    public Presupuesto(Cliente cliente, Vehiculo vehiculo, int dias){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;

        this.precioPresupuestado = calcularPresupuesto();
    }

    private double calcularPresupuesto(){
        switch (vehiculo.getTipoVehiculo()){
            case CAMION_CARGA -> {
                return vehiculo.getPrecio();
            }

            case CAMIONETA -> {
                Camionetas camioneta = (Camionetas) vehiculo;
                return ( vehiculo.getPrecioBase() * this.dias ) + camioneta.getPrecioPAT();
            }

            default -> {
                return vehiculo.getPrecio() * this.dias;
            }
        }
    }

    public double getPrecioPresupuestado() {
        return precioPresupuestado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getDias() {
        return dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
