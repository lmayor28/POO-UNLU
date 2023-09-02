package TP1.EJ8;

public class GeneradoContrasenias {

    private String caracteresDisponibles;
    private int longitudBase;

    private int cantLetrasMinusParaFuerte = 1;
    private int cantLetrasMayusParaFuerte = 2;
    private int cantNumerosParaFuerte = 2;


    // SETTER CONTRA FUERTE
    public void setCantLetrasMayusParaFuerte(int cantLetrasMayusParaFuerte) {
        this.cantLetrasMayusParaFuerte = cantLetrasMayusParaFuerte;
    }

    public void setCantLetrasMinusParaFuerte(int cantLetrasMinusParaFuerte) {
        this.cantLetrasMinusParaFuerte = cantLetrasMinusParaFuerte;
    }

    public void setCantNumerosParaFuerte(int cantNumerosParaFuerte) {
        this.cantNumerosParaFuerte = cantNumerosParaFuerte;
    }

    // Funciones
    public GeneradoContrasenias(){
        this(8);
    }
    public GeneradoContrasenias(int longitud){
        this.caracteresDisponibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        if (longitud < 8){
            longitud = 8;
        }
        this.longitudBase = longitud;
    }

    public String generarContrasenia(){
        return this.generarContrasenia(longitudBase);
    }
    public String generarContrasenia(int longitud){
        if (longitud < 8){
            longitud = 8;
        }
        StringBuilder contrasenia = new StringBuilder();
        for (int i = 0; i < longitud; i++){
            contrasenia.append(caracteresDisponibles.charAt((int) (Math.random() * caracteresDisponibles.length())));
        }
        return contrasenia.toString();
    }

    public boolean esFuerte(String contrasenia){
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        for (int i = 0; i < contrasenia.length(); i++){
            char c = contrasenia.charAt(i);
            if (Character.isUpperCase(c)){
                contadorMayusculas++;
            } else if (Character.isLowerCase(c)){
                contadorMinusculas++;
            } else if (Character.isDigit(c)){
                contadorNumeros++;
            }
        }

        return (contadorMayusculas >= cantLetrasMayusParaFuerte &&
                contadorMinusculas >= cantLetrasMinusParaFuerte &&
                contadorNumeros >= cantNumerosParaFuerte);
    }

    public String generarContraseniaFuerte(){
        return this.generarContraseniaFuerte(longitudBase);
    }
    public String generarContraseniaFuerte(int longitud){
        if (longitud < 8){
            longitud = 8;
        }
        String contraseniaFuerte = generarContrasenia(longitud);
        while (!esFuerte(contraseniaFuerte)){
            contraseniaFuerte = generarContraseniaFuerte();
        }

        return contraseniaFuerte;
    }
}
