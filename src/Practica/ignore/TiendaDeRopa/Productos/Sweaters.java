package Practica.ignore.TiendaDeRopa.Productos;

import Practica.ignore.TiendaDeRopa.Ropa;

public class Sweaters extends Ropa {

    public Sweaters(float precioLista){
        super(precioLista);
        this.porcentajeGanancia -=  0.02f;
    }


    @Override
    protected float calcularPrecioVenta(){
        return this.precioLista * porcentajeGanancia;
    }


    @Override
    public String toString(){
        return "Sweater: " + super.toString();
    }
}
