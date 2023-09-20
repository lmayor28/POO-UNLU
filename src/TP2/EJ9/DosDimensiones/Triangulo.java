package TP2.EJ9.DosDimensiones;

import TP2.EJ9.Figura;
import TP2.EJ9.FiguraDosDimensiones;

public class Triangulo extends FiguraDosDimensiones {

    public Triangulo(float lado1, float lado2, float lado3){
        super(Tipo.triangulo);
        this.medidas.put("Lado1", lado1);
        this.medidas.put("Lado2", lado2);
        this.medidas.put("Lado3", lado3);
        validar();

        calcular();
    }

    private void calcularAltura(){

        float semiperimetro = (m("Lado1") + m("Lado2") + m("Lado3")) / 2;
        float altura = (float) Math.sqrt(semiperimetro * (semiperimetro - m("Lado1")) * (semiperimetro - m("Lado2")) * (semiperimetro - m("Lado3")));

        this.medidas.put("Altura", altura);
    }

    @Override
    protected float calcularArea(){
        return (m("Lado1") * m("Altura")) / 2;
    }

    @Override
    public String toString(){
        return "Triangulo: " + "Lado1: " + m("Lado1") + " Lado2: " + m("Lado2") + " Lado3: " + m("Lado3") + "\nArea: " + getArea() + "\n";
    }

}
