package TP1.EJ11;

import java.util.ArrayList;
import java.util.HashMap;

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
        this.caracteresPuntosExtras = "kzxywq";

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
        int puntos = 0;
        for (char caracter : palabra.toCharArray()){
            if (caracteresPuntosExtras.contains(String.valueOf(caracter))){
              puntos += this.cantPuntosExtras;
            }
        }
        return puntos;
    }

    public void formarPalabra(String palabra, Jugador jugador){
        Palabra palabra1 = new Palabra(palabra, cantidadPuntos(palabra),  jugador);
        palabrasAdivinadas.add(palabra1);
    }

    public Jugador ganador(){

        for (Palabra palabra : palabrasAdivinadas){
            Jugador jugador = palabra.getJugador();
            if (!jugadoresHM.containsKey(jugador)){
                jugadoresHM.put(jugador, palabra.getPuntaje());
            } else {
                int puntosAnti = jugadoresHM.get(jugador);
                jugadoresHM.put(jugador, puntosAnti + palabra.getPuntaje());
            }

        }
    }


}
