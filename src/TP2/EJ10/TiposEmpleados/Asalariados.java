package TP2.EJ10.TiposEmpleados;

import TP2.EJ10.Empleados;


public class Asalariados extends Empleados {

    private double sumaMensual;

    public Asalariados(double sumaMensual){
        super();
        this.sumaMensual = sumaMensual;
    }

    @Override
    protected double calcularCumpleaniosBono(){
        if (!this.esCumpleanios) {
            return 0;
        }

        this.cumpleaniosBono = super.calcularCumpleaniosBono() + 1000;
        return this.cumpleaniosBono;
    }

    @Override
    public double calcularSueldo() {

        return sumaMensual + calcularCumpleaniosBono();
    }

    @Override
    protected TipoEmpleadoEnum setTipoEmpleado(){
        return TipoEmpleadoEnum.Asalararios;
    }

//    @Override
//    public String toString(){
//        return super.toString() + " -> Sueldo: " + calcularSueldo();
//    }
}
