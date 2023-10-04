package TP2.EJ10.TiposEmpleados;
import TP2.EJ10.Empleados;
public class PorHora extends Empleados{
    private double horasTrabajadas;
    private double valorHora;

    private double bonoExtra = 0;

    public PorHora(double horasTrabajadas, double valorHora) {
        super();
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public PorHora(){
        super();
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        if (horasTrabajadas < 40){
            return horasTrabajadas * valorHora;
        }

        this.bonoExtra = horasTrabajadas * valorHora * 0.2;

        return horasTrabajadas  * valorHora * 1.2;
    }

    @Override
    protected TipoEmpleadoEnum setTipoEmpleado(){
        return TipoEmpleadoEnum.PorHora;
    }


    @Override
    public String toString() {
        return super.toString() + " -> Horas Trabajadas:  " +
                horasTrabajadas + "\n" + " -> Valor Hora: " + valorHora +
                ((bonoExtra == 0) ? "" : "\n" + " -> Bono Extra: " + bonoExtra + "\n");
    }
}
