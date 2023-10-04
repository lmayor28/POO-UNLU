package TP2.EJ2;

import java.util.ArrayList;

public class Paquete {
    private Destino destino;
    private Transporte transporte;
    private Hospedaje hospedaje;
    private ArrayList<Excursion> excursiones;

    private double precio;

    public Paquete(Destino destino, Transporte transporte, Hospedaje hospedaje, double precio, ArrayList<Excursion> excursiones) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones = excursiones;
        this.precio = precio;
    }



}
