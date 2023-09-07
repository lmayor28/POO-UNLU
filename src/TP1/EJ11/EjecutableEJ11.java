package TP1.EJ11;

public class EjecutableEJ11 {
    public static void main(String[] args){
        Jugador[] jugadores = {
                new Jugador("Luis"),
                new Jugador("Alan"),
                new Jugador("Juan")
        };

        AdivinaLaPalabra adivinaPalabra = new AdivinaLaPalabra();
        adivinaPalabra.agregarPalabras("Fabuloso");
        adivinaPalabra.agregarPalabras("Excelente");
        adivinaPalabra.agregarPalabras("Perro");
        adivinaPalabra.agregarPalabras("Gato");

        adivinaPalabra.agregarPalabras("YYYYYY");

        adivinaPalabra.formarPalabra("Campestre", jugadores[0]);
        adivinaPalabra.formarPalabra("YYYYYY", jugadores[0]);
        adivinaPalabra.formarPalabra("Fabuloso", jugadores[1]);
        adivinaPalabra.formarPalabra("Terremoto", jugadores[1]);
        adivinaPalabra.formarPalabra("Perro", jugadores[2]);
        adivinaPalabra.formarPalabra("Matematicas", jugadores[2]);

        Jugador ganador = adivinaPalabra.ganador();
        System.out.println("El ganador del juego es: " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos.");

        System.out.printf(adivinaPalabra.listaJugadores());

    }
}
