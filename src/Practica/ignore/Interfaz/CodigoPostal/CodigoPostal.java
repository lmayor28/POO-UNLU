package Practica.ignore.Interfaz.CodigoPostal;

public abstract class CodigoPostal {
    private String codigoPostal;
    private final ICodigoTostalValidator validador;


    public CodigoPostal(ICodigoTostalValidator validador){
        this.validador = validador;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        if (validador.validar(this)){
            return;
        }

        return;
    }
}
