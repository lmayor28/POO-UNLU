package Practica.ignore.TiendaDeRopa;

public abstract class Ropa {
    public enum Tarjetas {
        comun,
        dorada
    }

    protected float precioLista;
    protected float porcentajeGanancia;



    protected Ropa(float precioLista){
        this.precioLista = precioLista;
        this.porcentajeGanancia = 1.1f;
    }

    public void setPrecioLista(Float nuevoPrecio){
        this.precioLista = nuevoPrecio;
    }
    public float getPrecioVenta(){
        return calcularPrecioVenta();
    }

    protected abstract float calcularPrecioVenta();

    protected float calcularPrecioVenta(Tarjetas tarjeta){
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
