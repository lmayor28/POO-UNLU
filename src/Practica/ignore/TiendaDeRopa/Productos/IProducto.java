package Practica.ignore.TiendaDeRopa.Productos;

import Practica.ignore.TiendaDeRopa.Ropa;

public interface IProducto {
    enum Tipo{
        REMERA,
        SWEATERS,
        CASIMA_MANGA_LARGA,
        CONJUNTO
    }
    double getPrecioVenta();
    double getPrecioVenta(Ropa.Tarjetas tarjeta);
}
