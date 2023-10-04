package Practica.ignore.TiendaDeRopa.Productos;

import Practica.ignore.TiendaDeRopa.Ropa;

public class CamisasMangaLarga extends Ropa {
    public CamisasMangaLarga(float precioLista){
        super(precioLista);
        //this.porcentajeGanancias = 1.1f;

        // Porcentaje adicional por temporada
        this.porcentajeGanancia += 0.05f;
    }

    @Override
    protected double calcularPrecioVenta(){
        System.out.println(this.porcentajeGanancia);
        return (this.precioLista * porcentajeGanancia);
    }

    @Override
    public String toString(){
        return "Camisa de manga larga:  " + super.toString();
    }
}
