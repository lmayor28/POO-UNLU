package TP1.EJ4;

import TP1.EJ4.Cola;

public class PruebasCola {
    public static void main(String[] args){
        System.out.println("Pruebas con Colas: Se carga la cola con numeros aleatorios.");

        Cola cola = new Cola();
        for (int i = 1; i<=10; i++){
            //int randomNumber = new Random().nextInt(10,100);
            cola.encolar(i);
        }

        System.out.println("Se desencola los elemetnos y se los muestra por pantalla.");
        while (!cola.esVacia()){
            System.out.println("Objeto: " + cola.recuperar());
            cola.desencolar();

        }
        //System.out.println("Objeto:" + cola.recuperar());

        if(cola.esVacia()){
            System.out.println("La cola esta vacia");
        }
    }
}
