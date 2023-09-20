package Practica.ignore.TiendaDeRopa;

import Practica.ignore.TiendaDeRopa.Productos.CamisasMangaLarga;
import Practica.ignore.TiendaDeRopa.Productos.Remera;
import Practica.ignore.TiendaDeRopa.Productos.Sweaters;

public class Ejecutable {
    public static void main(String[] args) {
        CamisasMangaLarga camisasMangaLarga = new CamisasMangaLarga(1000f);
        Remera remera = new Remera(500f);
        Sweaters sweaters = new Sweaters(2000f);

        System.out.println(camisasMangaLarga);
        System.out.println(remera);
        System.out.println(sweaters);

    }
}
