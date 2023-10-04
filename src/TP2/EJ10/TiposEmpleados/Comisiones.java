package TP2.EJ10.TiposEmpleados;
import TP2.EJ10.Empleados;

public class Comisiones extends Empleados{

    protected double cantidadVentas;
    protected double porcentajeComision;

    public Comisiones(){
        super();
    }

    public Comisiones(double cantidadVentas, double porcentajeComision){
        super();
        this.cantidadVentas = cantidadVentas;
        this.porcentajeComision = porcentajeComision;
    }

    public void setCantidadVentas(double cantidadVentas){
        this.cantidadVentas = cantidadVentas;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSueldo(){
        return cantidadVentas * porcentajeComision + calcularCumpleaniosBono();
    }

    private double calcularSueldoSinCumpleanios(){
        return cantidadVentas * porcentajeComision;
    }

    @Override
    protected TipoEmpleadoEnum setTipoEmpleado(){
        return TipoEmpleadoEnum.Comisiones;
    }

    @Override
    protected double calcularCumpleaniosBono(){
        if (!this.esCumpleanios){
            return 0;
        }

        return calcularSueldoSinCumpleanios() * 0.05;
    }

    @Override
    public String toString(){
        return super.toString() + " -> Cantidad Ventas: " + cantidadVentas + "\n -> Porcentaje Comision: " + porcentajeComision + "\n";
    }
}
