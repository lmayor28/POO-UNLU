import Clases.Cola;

import java.util.Random;

public class PruebasCola {
    public static void main(String[] args){
        System.out.println("Pruebas con Colas: Se carga la cola con numeros aleatorios");

        Cola cola = new Cola();
        for (int i = 0; i<10; i++){
            int randomNumber = new Random().nextInt(10,100);
            cola.encolar(randomNumber);
        }

        while (!cola.esVacia()){
            System.out.println("Objeto: " + cola.desencolar().toString());
        }

    }
}
