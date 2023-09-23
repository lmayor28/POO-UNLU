package TP2.EJ9;

public abstract class FiguraTresDimensiones extends Figura {

    public FiguraTresDimensiones(Tipo tipoFigura){
        super(tipoFigura);
    }

    protected abstract float calcularVolumen();

    @Override
    protected void calcular() {
        super.calcular();
        this.medidas.put("Volumen", calcularVolumen());
    }
}
