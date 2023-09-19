package TP2.EJ9;

public class Util {
    public static float largest(float... numeros){
        float largest = numeros[0];
        for (float numero : numeros){
            if (numero <= largest){
                continue;
            }

            largest = numero;

        }

        return largest;
    }
}
