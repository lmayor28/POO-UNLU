package TP1.EJ11;

import java.util.ArrayList;

//Debemos resolver una pequeña parte de un juego donde cada jugador puede formar palabras, y cada palabra tendrá un puntaje. Por el momento, el puntaje de una palabra va a estar dado por:
//
//        la cantidad de letras de la palabra y
//        las letras k, z, x, y, w, q suman un punto más.
//
//        El puntaje de cada jugador se determina con base en las palabras que pudo “formar”, pero para que esa palabra sea válida tiene que existir en un diccionario.
//        Se requiere poder agregar nuevas palabras a cada jugador, siempre y cuando estas sean válidas. Finalmente, debo poder obtener el puntaje total de cada jugador y poder determinar cuál es el jugador con el puntaje más alto.
public class AdivinaLaPalabra {
    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<String> diccionario;

    private String caracteresPuntosExtras;
    private int cantPuntosExtras;

    public AdivinaLaPalabra(){
        this.caracteresPuntosExtras = "kzxywq";
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
    }
    public void agregarPalabras(String palabra){
        if (diccionario.contains(palabra)){
            return;
        }
        diccionario.add(palabra);
    }

    public void formarPalabra(Jugador jugador, String palabra){
        if (!diccionario.contains(palabra)){
            return;
        }
        int puntos = 0;
        for (char caracter : palabra.toCharArray()){
            if (caracteresPuntosExtras.contains(String.valueOf(caracter))){
                puntos += this.cantPuntosExtras;
            }
        }



    }

}
