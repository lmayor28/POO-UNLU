package TP1.EJ11;

public class Palabra {
    private String palabra;
    private int puntaje;
    private Jugador jugador;

    public Palabra(String palabra, int puntaje, Jugador jugador) {
        this.palabra = palabra;
        this.puntaje = puntaje;
        this.jugador = jugador;
    }

    public int getPuntaje() {
        return puntaje;
    }
    public String getPalabra() {
        return palabra;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
