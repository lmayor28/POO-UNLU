package TP1.EJ7;

public class EjecutableEJ7 {
    public static void main(String[] args) {
        System.out.println("La funcion recibe como parametro un string y saca los coheficientes y obtiene las raices de dicha funcion. ");
        CalculadoraEcuacionesSegundoGrado calculadora = new CalculadoraEcuacionesSegundoGrado("y =23x^2 -52x -213");

        System.out.println(calculadora);
        System.out.println(" ");
        calculadora.mostrarRaices();
        System.out.println(" ");

        System.out.println( "El resultado de la ecuacion en X = 2 es: " + calculadora.resolverEcuacion(2.0));
        System.out.println( "El resultado de la ecuacion en X = -2 es: " + calculadora.resolverEcuacion(-2.0));

        System.out.println( "El resultado de la ecuacion en X = 4.376779 es: " + calculadora.resolverEcuacion(4.376779));
        System.out.println( "El resultado de la ecuacion en X = -2.1159096789 es: " + calculadora.resolverEcuacion(-2.1159096789));

    }
}
