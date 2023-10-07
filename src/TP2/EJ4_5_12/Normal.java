package TP2.EJ4_5_12;


public class Normal extends Cuenta{

//    hora queremos agregar una nueva feature a las cuentas. La inversión realizada se puede cancelar en cualquier momento, pero el interés devuelto no va a ser del 40%, sino solo del 5% si al menos pasaron 30 días. Además, se puede activar la opción de precancelar automáticamente: cuando un usuario realiza un gasto mayor a su saldo, la inversión se precancela para que no gire en descubierto (o para que lo haga pero por un monto mucho menor).

    private final double limiteGiroDescubierto;
    private double giroDescubiertoGastado;
    protected boolean enInversion;
    protected double montoInversion;

    protected boolean autoCancelarIntereses;

    protected int diasPasadosEnInversion;

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
                }
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

        retirarInversion(INTERES_INVERSION_CANCELADA);

        return gastar(montoAPagar);
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

        if (montoInversion > saldoDisponible){
            return false;
        }

        this.montoInversion = montoInversion;
        enInversion = true;
        diasPasadosEnInversion = 0;
        saldoDisponible -= montoInversion;

        return true;
    }

    public boolean retirarInversion(){
        if (!enInversion){
            return false;
        }

        if (PLAZO_DIAS_INVERSION < diasPasadosEnInversion){
            saldoDisponible += montoInversion + (montoInversion * INTERES_INVERSION);
            enInversion = false;
            diasPasadosEnInversion = 0;
            montoInversion = 0;
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

        if (PLAZO_DIAS_INVERSION < diasPasadosEnInversion){
            saldoDisponible += montoInversion + (montoInversion * intereses);
            enInversion = false;
            montoInversion = 0;
            diasPasadosEnInversion = 0;

            return true;
        }

        return false;
    }

    public double getPronosticoGananciasInversion(){
        if (!enInversion){
            return 0;
        }

        double estimadoGanancias = 0;

        if (PLAZO_DIAS_INVERSION < diasPasadosEnInversion){
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
        return
                super.toString() +
                "\n -> Limite Giro en Descubierto: " + limiteGiroDescubierto +
                "\n -> Giro en Descubierto Gastado: " + giroDescubiertoGastado +
                "\n -> En Inversion: " + enInversion +
                "\n -> Dias en inversion: " + this.diasPasadosEnInversion +
                "\n -> Total invertido: " + this.montoInversion +
                "\n -> Auto Cancelar Intereses: " + this.autoCancelarIntereses ;

    }


}
