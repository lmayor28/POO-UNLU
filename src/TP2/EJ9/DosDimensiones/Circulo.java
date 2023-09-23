package TP2.EJ9.DosDimensiones;

import TP2.EJ9.Figura;
import TP2.EJ9.FiguraDosDimensiones;

public class Circulo extends FiguraDosDimensiones{
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


//    @Override
//    public String toString() {
//        return "Circulo: " + "Radio: " + m("Radio") + "m\nArea: " + getArea() + "\n";
//    }
}
