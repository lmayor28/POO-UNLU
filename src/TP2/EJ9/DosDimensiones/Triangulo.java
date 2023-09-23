package TP2.EJ9.DosDimensiones;

import TP2.EJ9.Figura;
import TP2.EJ9.FiguraDosDimensiones;
import TP2.EJ9.Util;

public class Triangulo extends FiguraDosDimensiones {

    public Triangulo(float lado1, float lado2, float lado3){
        super(Tipo.triangulo);
        this.medidas.put("Lado1", lado1);
        this.medidas.put("Lado2", lado2);
        this.medidas.put("Lado3", lado3);
        validar();

        calcularAltura();
        calcular();
    }

    private void calcularAltura(){

        float semiperimetro = (m("Lado1") + m("Lado2") + m("Lado3")) / 2;

        //System.out.println("Semiperimetro: " + semiperimetro);

//        float lado1 = m("Lado1");
//        float lado2 = m("Lado2");
//        float lado3 = m("Lado3");

        //System.out.println("Lado 1: " + lado1 + " Lado 2:  " + lado2 + " Lado 3: " + lado3);

        //System.out.println("CALCULO: " + (semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)));

        //double altura1 = Math.sqrt( (semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)) ) ;

        //System.out.println("Altura: " + altura1);

        float area = (float) Math.sqrt(semiperimetro * (semiperimetro - m("Lado1")) * (semiperimetro - m("Lado2")) * (semiperimetro - m("Lado3")));
        this.medidas.put("Area", area);

        //System.out.println(area);

        float altura = (area * 2) / Util.largest(m("Lado1"), m("Lado2"), m("Lado3"));
        this.medidas.put("Altura", altura);
        //System.out.println(altura);
    }

    @Override
    protected float calcularArea(){
        return m("Area");
    }

//    @Override
//    public String toString(){
//        return "Triangulo: " + "Lado1: " + m("Lado1") + "m Lado2: " + m("Lado2") + "m Lado3: " + m("Lado3") + "m\nArea: " + getArea() + "m2\n";
//    }

}
