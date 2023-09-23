package TP2.EJ9.DosDimensiones;

import TP2.EJ9.Figura;
import TP2.EJ9.FiguraDosDimensiones;

public class Rectangulo extends FiguraDosDimensiones {

    // Para que los datos no sean negativos se los valida para que si son negativos no se crea el objeto.
    public Rectangulo(float base, float altura){
        super(Tipo.cuadrado);
        if (base != altura){
            this.tipoFigura = Tipo.rectangulo;
        }
        this.medidas.put("Base", base);
        this.medidas.put("Altura", altura);
        validar();

        calcular();
    }
    public Rectangulo(float longitudAristaCuadrado){
        this(longitudAristaCuadrado, longitudAristaCuadrado);
    }


    @Override
    protected float calcularArea(){
        return m("Base") * m("Altura");
    }


//    @Override
//    public String toString(){
//        return "Cuadrado: " + "Base: " + m("Base") + "m Altura: " + m("Altura") + "m\nArea: " + getArea() + "m2\n";
//    }


}
