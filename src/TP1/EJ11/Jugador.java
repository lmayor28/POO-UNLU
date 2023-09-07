package TP1.EJ11;

public class Jugador {
    private int puntos;
    private String nombre;
    public Jugador(String nombre){
        this.puntos = 0;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPuntos(){
        return puntos;
    }

    public void agregarPuntos(int puntos){
        this.puntos += puntos;
    }
}
