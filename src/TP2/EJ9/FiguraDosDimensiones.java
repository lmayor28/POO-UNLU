package TP2.EJ9;

public abstract class FiguraDosDimensiones extends Figura{

    public FiguraDosDimensiones(Tipo tipoFigura){
        super(tipoFigura);
    }

    @Override
    protected abstract float calcularArea();
}
