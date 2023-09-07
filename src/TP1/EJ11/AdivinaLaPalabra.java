package TP1.EJ11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Debemos resolver una pequeña parte de un juego donde cada jugador puede formar palabras, y cada palabra tendrá un puntaje. Por el momento, el puntaje de una palabra va a estar dado por:
//
//        la cantidad de letras de la palabra y
//        las letras k, z, x, y, w, q suman un punto más.
//
//        El puntaje de cada jugador se determina con base en las palabras que pudo “formar”, pero para que esa palabra sea válida tiene que existir en un diccionario.
//        Se requiere poder agregar nuevas palabras a cada jugador, siempre y cuando estas sean válidas. Finalmente, debo poder obtener el puntaje total de cada jugador y poder determinar cuál es el jugador con el puntaje más alto.
public class AdivinaLaPalabra {
    private ArrayList<String> diccionario;
    private ArrayList<Palabra> palabrasAdivinadas;
    private HashMap<Jugador, Integer> jugadoresHM;

    private String caracteresPuntosExtras;
    private int cantPuntosExtras;

    public AdivinaLaPalabra(){
        this.caracteresPuntosExtras = "kzxywqKZXYWQ";
        this.diccionario = new ArrayList<>();
        this.palabrasAdivinadas = new ArrayList<>();
        this.jugadoresHM = new HashMap<>();
        this.cantPuntosExtras = 1;
    }
    public void agregarPalabras(String palabra){
        if (diccionario.contains(palabra)){
            return;
        }
        diccionario.add(palabra);
    }

    private int cantidadPuntos( String palabra){
        if (!diccionario.contains(palabra)){
            return 0;
        }
        int puntos = palabra.length();
        for (char caracter : palabra.toCharArray()){
            if (caracteresPuntosExtras.contains(String.valueOf(caracter))){
                puntos += this.cantPuntosExtras;
            }
        }
        return puntos;
    }

    public void formarPalabra(String palabra, Jugador jugador){
        int puntosTotales = cantidadPuntos(palabra);
        Palabra palabra1 = new Palabra(palabra, puntosTotales,  jugador);
        jugador.agregarPuntos(puntosTotales);
        palabrasAdivinadas.add(palabra1);
    }

    public Jugador ganador(){

        //Recorre todas las palabras que se fueron formando
        for (Palabra palabra : palabrasAdivinadas){
            Jugador jugador = palabra.getJugador();

            // Compara si el jugador NO existe en el Hash Map.
            if (!jugadoresHM.containsKey(jugador)){
                // Crea una nueva instancia para el jugador
                jugadoresHM.put(jugador, palabra.getPuntaje());
            } else {
            // Si existe el jugador suma los puntos que ya tenia y le agrega los que ya tenia .
                int puntosAnti = jugadoresHM.get(jugador);
                jugadoresHM.put(jugador, puntosAnti + palabra.getPuntaje());
            }
        }


        Jugador ganardor = null;
        int mayorPuntos = 0;
        for (Map.Entry<Jugador, Integer> jugadorEntry : jugadoresHM.entrySet()){
            Jugador jugador = jugadorEntry.getKey();
            Integer puntos = jugadorEntry.getValue();
            if (mayorPuntos < puntos){
                mayorPuntos = puntos;
                ganardor = jugador;
            }
        }

        return ganardor;
    }

    public String listaJugadores(){
        String listaJugadores = "";
        for (Map.Entry<Jugador, Integer> entradas : jugadoresHM.entrySet()){
            listaJugadores += "| Jugador: " + entradas.getKey().getNombre() + " Puntos: " + entradas.getValue() + " |\n";
        }
        return listaJugadores;
    }
}
