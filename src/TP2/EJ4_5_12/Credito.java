package TP2.EJ4_5_12;

public class Credito extends Cuenta{

    public static final double INTERES = 0.05;
    private final double limiteCredito;

    private double interesaAPagar;

    public Credito(double limiteCredito) {
        super(0);
        this.limiteCredito = limiteCredito;
    }


    public boolean pagarGastos(double montoAPagar) {
        if (montoAPagar <= 0) {
            return false;
        }

        this.saldoDisponible -= montoAPagar;

        if (saldoDisponible < 0) {
            saldoDisponible = 0;
        }

        return true;
    }

    public boolean pagarInteres(double interesaAPagar) {
        if (interesaAPagar <= 0) {
            return false;
        }

        this.interesaAPagar -= interesaAPagar;

        if (this.interesaAPagar < 0) {
            this.interesaAPagar = 0;
        }

        return true;
    }



    @Override
    public boolean gastar(double montoAPagar) {
        if (!puedePagar(montoAPagar)) {
            return false;
        }

        saldoDisponible += (montoAPagar);
        interesaAPagar +=  (montoAPagar * INTERES);
        return true;
    }

    @Override
    public boolean puedePagar(double montoAPagar) {
        return (montoAPagar + saldoDisponible + interesaAPagar) <= limiteCredito;
    }

    @Override
    public String toString() {
        return  " -> Limite Credito: " + limiteCredito +
                "\n -> Interes a Pagar: " + interesaAPagar +
                "\n -> Credito a pagar: " + saldoDisponible +
                "\n -> Credito Disponible: " + (limiteCredito - (saldoDisponible ));

    }


}
