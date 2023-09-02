package Ejecutable;

import Clases.Pila;

import java.util.Random;

public class Pruebas_Pila {
    public static void main(String[] args){
        System.out.println("Pruebas con Pilas: Se carga la con numeros de 1 a 10");

        Pila pila = new Pila();
        Pila pila2 = new Pila();
        for (int i = 1; i<11; i++){
            //int randomNumber = new Random().nextInt(10,100);
            pila.apilar(i);
            pila2.apilar(i);
        }

        System.out.println("Se desapila la pila 1.");
        while(!pila.esVacia()){
            System.out.println(pila.recuperar());
            pila.desapilar();
            //se pierde la pila 1
        }
        if(pila.esVacia()){
            System.out.println("pila vacia.");
        }
        System.out.println(pila.recuperar());

        System.out.println("-------------------------------------------------------------");
    }
}
