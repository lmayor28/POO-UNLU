package Practica.ignore.TiendaDeRopa;

import Practica.ignore.TiendaDeRopa.Productos.IProducto;

public abstract class Ropa implements IProducto {
    public enum Tarjetas {
        comun,
        dorada
    }

    protected double precioLista;
    protected float porcentajeGanancia;



    protected Ropa(float precioLista){
        this.precioLista = precioLista;
        this.porcentajeGanancia = 1.1f;
    }

    public void setPrecioLista(double nuevoPrecio) {
        this.precioLista = nuevoPrecio;
    }

    public void setPrecioLista(Float nuevoPrecio){
        this.precioLista = nuevoPrecio;
    }
    public double getPrecioVenta(){
        return calcularPrecioVenta();
    }
    public double getPrecioVenta(Tarjetas tarjeta){
        return  calcularPrecioVenta(tarjeta);
    }

    protected abstract double calcularPrecioVenta();

    protected double calcularPrecioVenta(Tarjetas tarjeta){
        return switch (tarjeta) {
            case comun -> (getPrecioVenta() * 0.99f);
            case dorada -> (getPrecioVenta() * 0.985f - 100);
            default -> calcularPrecioVenta();
        };
    }


    @Override
    public String toString(){
        return  "\n Precio lista: " + precioLista +
                "\n Precio venta: " + getPrecioVenta() +
                "\n Precio venta tarjeta comun: " + calcularPrecioVenta(Tarjetas.comun) +
                "\n Precio venta tarjeta dorada: " + calcularPrecioVenta(Tarjetas.dorada);
    }
}
