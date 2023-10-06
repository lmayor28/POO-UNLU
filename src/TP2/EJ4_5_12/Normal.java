package TP2.EJ4_5_12;

import org.jetbrains.annotations.TestOnly;

public class Normal extends Cuenta{

//    hora queremos agregar una nueva feature a las cuentas. La inversión realizada se puede cancelar en cualquier momento, pero el interés devuelto no va a ser del 40%, sino solo del 5% si al menos pasaron 30 días. Además, se puede activar la opción de precancelar automáticamente: cuando un usuario realiza un gasto mayor a su saldo, la inversión se precancela para que no gire en descubierto (o para que lo haga pero por un monto mucho menor).

    private double limiteGiroDescubierto;
    private double giroDescubiertoGastado;
    private boolean enInversion;
    private double montoInversion;

    private boolean autoCancelarIntereses;

    private int diasPasadosEnInversion;

    public Normal(double saldo, double limiteGiroDescubierto) {
        super(saldo);
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.enInversion = false;
        this.giroDescubiertoGastado = 0;
        this.diasPasadosEnInversion = 0;
        this.montoInversion = 0;
        this.autoCancelarIntereses = false;
    }


    @Override
    public boolean gastar(double montoAPagar) {
        if (!puedePagar(montoAPagar)) {
            if (autoCancelarIntereses){
                if (gastarConInversion(montoAPagar)){
                    return true;
                };
            }

            return gastarGiroDescubierto(montoAPagar);
        }

        saldoDisponible -= montoAPagar;
        return true;
    }

    private boolean gastarGiroDescubierto(double montoAPagar) {
        if (!puedePagarGiroDescubierto(montoAPagar)) {
            return false;
        }

        saldoDisponible -= montoAPagar;
        if (saldoDisponible < 0) {
            double saldoPositivo = saldoDisponible * -1;

            giroDescubiertoGastado += saldoPositivo;
            saldoDisponible = 0;
        }

        return true;
    }

    public boolean gastarConInversion(double montoAPagar){
        if (!puedePagarConInversion(montoAPagar)){
            return false;
        }

        return retirarInversion(INTERES_INVERSION_CANCELADA);
    }

    public boolean cargarCuenta(double montoCargar){

        if (giroDescubiertoGastado > 0){
            double nuevoMonto = giroDescubiertoGastado - montoCargar;

            if (nuevoMonto <= 0 ) {
                giroDescubiertoGastado = 0;
                montoCargar = (nuevoMonto * -1);
            } else {
                giroDescubiertoGastado  = nuevoMonto;
                return false;
            }

        }

        saldoDisponible += montoCargar;
        return true;
    }


    public boolean iniciarInversion(double montoInversion){
        if (enInversion){
            return false;
        }

        this.montoInversion = montoInversion;
        enInversion = true;
        return true;
    }

    public boolean retirarInversion(){
        if (!enInversion){
            return false;
        }

        if (PLAZO_DIAS_INVERSION > diasPasadosEnInversion){
            saldoDisponible += montoInversion + (montoInversion * INTERES_INVERSION);
            enInversion = false;
            return true;
        }

        return false;
    }

    public boolean retirarInversionCancelada(){
        if (!enInversion){
            return false;
        }

        if (PLAZO_DIAS_INVERSION > diasPasadosEnInversion){
            saldoDisponible += montoInversion + (montoInversion * INTERES_INVERSION_CANCELADA);
            enInversion = false;
            return true;
        }

        return false;
    }

    public boolean retirarInversion(double intereses){
        if (!enInversion){
            return false;
        }

        if (PLAZO_DIAS_INVERSION > diasPasadosEnInversion){
            saldoDisponible += montoInversion + (montoInversion * intereses);
            enInversion = false;
            return true;
        }

        return false;
    }

    public double getPronosticoGananciasInversion(){
        if (!enInversion){
            return 0;
        }

        double estimadoGanancias = 0;

        if (PLAZO_DIAS_INVERSION > diasPasadosEnInversion){
            estimadoGanancias = montoInversion + (montoInversion * INTERES_INVERSION_CANCELADA);
            return estimadoGanancias;
        }

        return 0;
    }


    @Override
    public boolean puedePagar(double montoAPagar) {
        return montoAPagar <= saldoDisponible;
    }

    public boolean puedePagarGiroDescubierto(double montoAPagar) {
        return montoAPagar <= ((limiteGiroDescubierto - giroDescubiertoGastado) + saldoDisponible);
    }

    public boolean puedePagarConInversion(double montoAPagar){
        return montoAPagar <= (saldoDisponible + getPronosticoGananciasInversion());
    }

    public void setAutoCancelarIntereses(boolean autoCancelarIntereses) {
        this.autoCancelarIntereses = autoCancelarIntereses;
    }

    public void setDiasPasadosEnInversion(int diasPasadosEnInversion) {
        this.diasPasadosEnInversion = diasPasadosEnInversion;
    }

    public void setEnInversion(boolean enInversion) {
        this.enInversion = enInversion;
    }

    @Override
    public String toString(){
        return "Cuenta: Normal\n" + super.toString() + "\n -> Limite Giro Descubierto: " + limiteGiroDescubierto + "\n -> Giro Descubierto Gastado: " + giroDescubiertoGastado + "\n -> En Inversion: " + enInversion +
    }


}
