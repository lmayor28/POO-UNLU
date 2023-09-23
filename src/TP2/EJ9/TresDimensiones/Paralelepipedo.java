package TP2.EJ9.TresDimensiones;

import TP2.EJ9.FiguraTresDimensiones;

public class Paralelepipedo extends FiguraTresDimensiones {

    public Paralelepipedo(float longitud, float ancho, float profundidad){
        super(Tipo.paralelepipedo);
        this.medidas.put("Longitud", longitud);
        this.medidas.put("Ancho", ancho);
        this.medidas.put("Profundidad", profundidad);
        validar();
        calcular();
    }


    @Override
    protected float calcularArea() {
        return 2 * (m("Longitud") * m("Ancho") + m("Longitud") * m("Profundidad") + m("Ancho") * m("Profundidad"));
    }


    @Override
    protected float calcularVolumen() {
        return m("Longitud") * m("Ancho") * m("Profundidad");
    }
}
