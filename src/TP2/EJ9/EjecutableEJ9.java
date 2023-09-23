package TP2.EJ9;

import TP2.EJ9.DosDimensiones.Circulo;
import TP2.EJ9.DosDimensiones.Rectangulo;
import TP2.EJ9.DosDimensiones.Triangulo;
import TP2.EJ9.TresDimensiones.Cubo;
import TP2.EJ9.TresDimensiones.Esfera;
import TP2.EJ9.TresDimensiones.Paralelepipedo;
import TP2.EJ9.TresDimensiones.Tetraedro;

public class EjecutableEJ9 {
    public static void main(String[] args){
//        Cubo  cubo = new Cubo(2, 2, 2);
//        System.out.println(cubo);
//
//        Cubo cubo2 = new Cubo(-2, 0, 1);
//        System.out.println(cubo2);

        Cubo cubo3 = new Cubo(2, 2, 2);
        System.out.println(cubo3);

        Triangulo triangulo = new Triangulo(2, 3, 4);
        System.out.println(triangulo);

        Circulo circulo = new Circulo(2);
        System.out.println(circulo);

        Rectangulo rectangulo = new Rectangulo(2, 6);
        System.out.println(rectangulo);

        Rectangulo cuadrado = new Rectangulo(2);
        System.out.println(cuadrado);

        Esfera esfera = new Esfera(2);
        System.out.println(esfera);

        Paralelepipedo paralelepipedo = new Paralelepipedo(2, 3, 4);
        System.out.println(paralelepipedo);

        Tetraedro tetraedro = new Tetraedro(2);
        System.out.println(tetraedro);

    }
}
