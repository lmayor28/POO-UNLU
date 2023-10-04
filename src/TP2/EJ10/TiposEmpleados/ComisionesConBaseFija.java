package TP2.EJ10.TiposEmpleados;

public class ComisionesConBaseFija extends Comisiones{

    private double baseFija;


    public ComisionesConBaseFija(double ventasBrutas, double comision, double baseFija){
        super(ventasBrutas, comision);
        this.baseFija = baseFija;
    }

    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + baseFija;
    }

    @Override
    protected TipoEmpleadoEnum setTipoEmpleado(){
        return TipoEmpleadoEnum.ComisionesConBaseFija;
    }

    @Override
    protected double calcularCumpleaniosBono(){
        if (!esCumpleanios){
            return 0;
        }

        return super.calcularCumpleaniosBono() + 1000;
    }

    @Override
    public String toString(){
        return super.toString() + " -> Base Fija: " + baseFija;
    }
}
