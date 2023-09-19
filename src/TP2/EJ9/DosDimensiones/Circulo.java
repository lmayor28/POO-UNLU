package TP2.EJ9.DosDimensiones;

import TP2.EJ9.Figura;

public class Circulo extends Figura
{
    public Circulo(float radio) {
        super(Tipo.circulo);
        this.medidas.put("Radio", radio);
        validar();

        calcular();
    }


    @Override
    protected float calcularArea() {
        return (float) (Math.PI * Math.pow(m("Radio"), 2));
    }


    @Override
    protected float calcularVolumen() {
        return 0;
    }


    @Override
    public String toString() {
        return "Circulo: " + "Radio: " + m("Radio") + "\nArea: " + getArea() + "\n";
    }
}
