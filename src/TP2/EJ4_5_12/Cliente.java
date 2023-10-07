package TP2.EJ4_5_12;

import Util.NombreApellidoAleatorio;

public class Cliente {
    private final String nombre;
    private final String apellido;

    private final Credito cuentaCredito;
    private final Normal cuentaNormal;
    private final CajaAhorro cajaAhorro;

    public Cliente(){
        this(null, null, null);
    }

    public Cliente(Normal normal){
        this(null, normal, null);
    }

    public Cliente(CajaAhorro cajaAhorro){
        this(null, null, cajaAhorro);
    }

    public Cliente(Credito credito){
        this(credito, null, null);
    }

    public Cliente(Credito credito, Normal normal){
        this(credito, normal, null);
    }

    public Cliente(Credito credito, Normal normal, CajaAhorro cajaAhorro){
        this.nombre = NombreApellidoAleatorio.Nombre();
        this.apellido = NombreApellidoAleatorio.Apellido();
        this.cuentaCredito =  credito;
        this.cuentaNormal = normal;
        this.cajaAhorro = cajaAhorro;
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
                (this.cuentaCredito == null ? "" : "\n\n Cuenta de Credito: " + this.cuentaCredito) +
                (this.cuentaNormal == null ? "" :"\n\n Cuenta Normal: " + this.cuentaNormal) +
                (this.cajaAhorro == null ? "" : "\n\n Caja de Ahorro: " + this.cajaAhorro);

    }
}
