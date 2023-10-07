package TP2.EJ11;

import Util.NombreApellidoAleatorio;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String apellido;

    private ArrayList<Alquiler> alquileres;

    public Cliente(){
        this.nombre = NombreApellidoAleatorio.Nombre();
        this.apellido = NombreApellidoAleatorio.Apellido();
    }

    public double getCantidadAlquiladaTotal(){
        double cantiadAlquilada = 0;
        for (Alquiler alquiler : alquileres) {
            cantiadAlquilada += alquiler.getMontoTotalDefinitivo();
        }

        return cantiadAlquilada;
    }

    @Override
    public String toString(){
        return "Cliente: " + nombre + " " + apellido;
    }

}
