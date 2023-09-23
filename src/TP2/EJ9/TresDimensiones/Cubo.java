package TP2.EJ9.TresDimensiones;

import TP2.EJ9.Figura;
import TP2.EJ9.FiguraTresDimensiones;

public class Cubo extends FiguraTresDimensiones {

    // Para que los datos no sean negativos se los valida para que si son negativos no se crea el objeto.
    public Cubo(float base, float altura, float profundidad){
        super(Tipo.cubo);

        this.medidas.put("Base", base);
        this.medidas.put("Altura", altura);
        this.medidas.put("Profundidad", profundidad);
        validar();

        calcular();
    }
    public Cubo(float longitudArista){
        this(longitudArista, longitudArista, longitudArista);
    }


    @Override
    protected float calcularArea(){
        return m("Base") * m("Altura") * 6;
    }


    @Override
    protected float calcularVolumen(){
        return m("Base") * m("Altura") * m("Profundidad");
    }


//    @Override
//    public String toString(){
//        return "Cubo: " + "Base: " + m("Base") + " Altura: " + m("Altura") + " Profundidad: " +
//                m("Profundidad") + "\nArea: " + getArea() +
//                "m2 Volumen: " + getVolumen() + "m3\n";
//    }
}
