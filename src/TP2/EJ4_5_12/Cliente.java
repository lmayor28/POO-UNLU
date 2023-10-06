package TP2.EJ4_5_12;

import Util.NombreApellidoAleatorio;

public class Cliente {
    private String nombre;
    private String apellido;

    private Credito cuentaCredito;
    private Normal cuentaNormal;
    private CajaAhorro cajaAhorro;

    public Cliente(){
        this.nombre = NombreApellidoAleatorio.Nombre();
        this.apellido = NombreApellidoAleatorio.Apellido();
        this.cuentaCredito = new Credito(100000);
        this.cuentaNormal = new Normal(15000, 100000);
        this.cajaAhorro = new CajaAhorro();
    }

    public CajaAhorro getCajaAhorro() {
        return cajaAhorro;
    }

    public Normal getCuentaNormal() {
        return cuentaNormal;
    }

    public Credito getCuentaCredito() {
        return cuentaCredito;
    }

    @Override
    public String toString(){
        return "Cliente: " + this.nombre + " " + this.apellido +
                this.cuentaCredito + this.cuentaNormal + this.cajaAhorro;



    }
}
