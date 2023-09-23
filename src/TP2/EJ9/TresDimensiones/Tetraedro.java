package TP2.EJ9.TresDimensiones;

import TP2.EJ9.FiguraTresDimensiones;

public class Tetraedro extends FiguraTresDimensiones {

    public Tetraedro(float arista) {
        super(Tipo.tetraedro);
        this.medidas.put("Arista", arista);
        this.validar();
        this.calcular();
    }

    @Override
    protected float calcularArea() {
        return (float) (Math.pow(m("Arista"), 2) * Math.sqrt(3));
    }

    @Override
    protected float calcularVolumen() {
        return (float) (Math.pow(m("Arista"), 3) * Math.sqrt(2) / 12);
    }
}
