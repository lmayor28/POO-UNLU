package TP2.EJ4_5_12;

public abstract class Cuenta {

    public static double INTERES_INVERSION = 0.4;
    public static double INTERES_INVERSION_CANCELADA = 0.05;
    public static double PLAZO_DIAS_INVERSION = 30;

    protected double saldoDisponible;

    protected Cuenta(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public abstract boolean gastar(double montoAPagar);

    protected abstract boolean puedePagar(double montoAPagar);

    @Override
    public String toString() {
        return "\n -> Saldo disponible: " + saldoDisponible;
    }


}
