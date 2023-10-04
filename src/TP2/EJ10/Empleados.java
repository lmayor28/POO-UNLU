package TP2.EJ10;
import Util.NombreApellidoAleatorio;
public abstract class Empleados {

    public enum TipoEmpleadoEnum {
        PorHora, Comisiones, ComisionesConBaseFija, Asalararios, EMPLEADO_NO_DEFINIDO;

        @Override
        public String toString() {
            return switch (this) {
                case PorHora -> "Por Hora";
                case Comisiones -> "Comisiones";
                case ComisionesConBaseFija -> "Comisiones con base fija";
                case Asalararios -> "Asalararios";
                default -> "Empleado no definido";
            }; // Fin del switch

        }
    }

    protected TipoEmpleadoEnum tipoEmpleado;

    protected TipoEmpleadoEnum getTipoEmpleado() {
        return tipoEmpleado;
    }

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cuit;

    protected boolean esCumpleanios = false;
    protected double cumpleaniosBono = 0;



    protected Empleados(){
        this(NombreApellidoAleatorio.Nombre(), NombreApellidoAleatorio.Apellido(), "02423-648392", "0000045867395");
    }
    protected Empleados(String nombre, String apellido, String telefono, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
        this.tipoEmpleado = setTipoEmpleado();
    }

    public void setEsCumpleanios(boolean esCumpleanios) {
        this.esCumpleanios = esCumpleanios;
    }

    public abstract double calcularSueldo();

    protected double calcularCumpleaniosBono(){
        return 2000;
    }

    protected abstract TipoEmpleadoEnum setTipoEmpleado();

    @Override

    public String toString() {
        return "Empleado: " + this.nombre + " " + this.apellido+ "\n -> Tipo de empleado: " + this.tipoEmpleado + "\n -> CUIT: " + this.cuit + "\n -> Sueldo Mensual: " + this.calcularSueldo() + "\n" +
                ((esCumpleanios) ? " -> Cumpleaños Bono: " + calcularCumpleaniosBono() : "") + "\n";
    }
}
