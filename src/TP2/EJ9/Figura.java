package TP2.EJ9;

public class Figura {
    public enum Tipo {
        circulo,
        rectangulo,
        cuadrado,
        triangulo,
        esfera,
        paralelepipedo,
        cubo,
        tetraedro
    }

    private Tipo tipoFigura;
    private int area;

    private int calcularArea(){
        return 0;
    }

    public int getArea() {
        return area;
    }

    public Tipo getTipoFigura() {
        return tipoFigura;
    }
}
