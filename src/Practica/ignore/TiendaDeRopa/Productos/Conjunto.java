package Practica.ignore.TiendaDeRopa.Productos;

import Practica.ignore.TiendaDeRopa.Ropa;

public class Conjunto{
    private Remera remera;
    private Ropa otraPrenda;

    public Conjunto(Remera remera, Ropa otraPrenda){
        this.remera = remera;
        this.otraPrenda = otraPrenda;
    }


//    INCOMPLETO
    public double getPreccioVenta(){
        return remera.calcularPrecioVenta();
    }

//    INCOMPLETO
    public double getPrecioVenta(Ropa.Tarjetas tarjeta){
        return 0;
    }

//    INCOMPLETO
    public double precioSuma(){
        return remera.calcularPrecioVenta() + otraPrenda.getPrecioVenta();
    }

//    INCOMPLETO
    public double precioSuma(Ropa.Tarjetas tarjera){
        return remera.getPrecioVenta(tarjera) + otraPrenda.getPrecioVenta(tarjera) ;
    }





}
