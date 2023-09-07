package TP1.EJ8;

public class GeneradorContrasenias {

    private String caracteresDisponibles;
    private int longitudBase;



    // Funciones
    public GeneradorContrasenias(){
        this(8);
    }
    public GeneradorContrasenias(int longitud){
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
}
