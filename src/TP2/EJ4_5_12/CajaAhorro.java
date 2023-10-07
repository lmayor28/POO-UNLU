package TP2.EJ4_5_12;

public class CajaAhorro extends Normal {

    public CajaAhorro(double saldo){
        super(saldo, 0);
    }
    /*@Override
    public boolean gastar(double montoAPagar) {
        if (!puedePagar(montoAPagar)) {
            if (autoCancelarIntereses){
                if (gastarConInversion(montoAPagar)){
                    return true;
                }
            }
        }

        saldoDisponible -= montoAPagar;
        return true;
    }*/

    @Override
    public String toString(){
        return
                        "\n -> Saldo disponible: " + saldoDisponible +
                        "\n -> En Inversion: " + enInversion +
                        "\n -> Dias en inversion: " + this.diasPasadosEnInversion +
                        "\n -> Total invertido: " + this.montoInversion +
                        "\n -> Auto Cancelar Intereses: " + this.autoCancelarIntereses ;

    }


}
