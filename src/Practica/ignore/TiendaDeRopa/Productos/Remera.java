package Practica.ignore.TiendaDeRopa.Productos;

import Practica.ignore.TiendaDeRopa.Ropa;

public class Remera extends Ropa {

    public Remera(float precioLista){
        super(precioLista);
    }

    @Override
    protected double calcularPrecioVenta() {
        return (this.precioLista + 100) * porcentajeGanancia;
    }


    @Override
    public String toString() {
        return "Remera: " + super.toString();
    }
}
