package TP1.EJ8;

import Clases.Iterador;
import Clases.ListaEnlazada;

public class AdministradorDeContrasenias {
    private ListaEnlazada contrasenias;
    private GeneradorContrasenias generadorContrasenias;

    private int longitudBase;

    private int cantLetrasMinusParaFuerte = 1;
    private int cantLetrasMayusParaFuerte = 2;
    private int cantNumerosParaFuerte = 2;

    // Contructor
    public AdministradorDeContrasenias(){
        this(8);
    }
    public AdministradorDeContrasenias(int longitud){
        generadorContrasenias = new GeneradorContrasenias();
        contrasenias = new ListaEnlazada();
        if (longitud < 8){
            longitud = 8;
        }
        this.longitudBase = longitud;
    }

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

    public int cantidadContrasenias(){
        return contrasenias.longitud();
    }
    public void generarContrasenias(int cantContrasenias){
        for (int i = 0; i < cantContrasenias; i++){
            contrasenias.agregarElemento(generadorContrasenias.generarContrasenia());
        }
    }
    public String generarContraseniaFuerte(){
        return this.generarContraseniaFuerte(longitudBase);
    }
    public String generarContraseniaFuerte(int longitud){
        if (longitud < 8){
            longitud = 8;
        }
        String contraseniaFuerte = generadorContrasenias.generarContrasenia(longitud);
        while (!esFuerte(contraseniaFuerte)){
            contraseniaFuerte = generadorContrasenias.generarContrasenia(longitud);
        }
        contrasenias.agregarElemento(contraseniaFuerte);
        return contraseniaFuerte;
    }

    public void vaciarContrasenias(){
        this.contrasenias = new ListaEnlazada();
    }

    public String toString(){
        /*
        Iterador iter = contrasenias.iterator();
        while (iter.hasNext()){
            Object contrasenia = iter.next();
            resultado += ("Contraseña: " + contrasenia + " - " +
                    (this.esFuerte(contrasenia.toString()) ? "Fuerte\n" : "Débil\n"));
        } */
        String resultado = "";

        int contador = 1;

        for (Object contraseniaObj : this.contrasenias){
            String contrasenia = (String) contraseniaObj;
            resultado += ("Contraseña " + contador + ": " + contrasenia + " - " +
                    (this.esFuerte(contrasenia) ? "Fuerte\n" : "Débil\n"));
            contador++;
        }

        return resultado;
    }
}
