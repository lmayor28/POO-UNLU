package TP1.EJ7;

public class EjecutableEJ7 {
    public static void main(String[] args) {
        CalculadoraEcuacionesSegundoGrado calculadora = new CalculadoraEcuacionesSegundoGrado("y =23x^2 -52x -213");
        System.out.println(calculadora);
        System.out.println(calculadora.resolverEcuacion(2.0));
        calculadora.mostrarRaices();
    }
}
