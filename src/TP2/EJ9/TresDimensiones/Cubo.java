package TP2.EJ9.TresDimensiones;

import TP2.EJ9.Figura;

public class Cubo extends Figura {

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


    @Override
    public String toString(){
        return "Cubo: " + "Base: " + m("Base") + " Altura: " + m("Altura") + " Profundidad: " +
                m("Profundidad") + "\nArea: " + getArea() +
                " Volumen: " + getVolumen() + "\n";
    }
}
