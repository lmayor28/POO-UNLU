package TP2.EJ9.TresDimensiones;

import TP2.EJ9.FiguraTresDimensiones;


public class Esfera extends FiguraTresDimensiones {

    public Esfera(float radio) {
        super(Tipo.esfera);
        this.medidas.put("Radio", radio);
        this.validar();
        this.calcular();
    }

    @Override
    protected float calcularArea() {
        return (float) (4 * Math.PI * Math.pow(this.medidas.get("Radio"), 2));
    }

    @Override
    protected float calcularVolumen() {
        return (float) (4 * Math.PI * Math.pow(this.medidas.get("Radio"), 3)) / 3;
    }

//    @Override
//    public String toString() {
//        return "Esfera{" +
//                "medidas=" + this.medidas +
//                '}';
//    }

//    @Test
//    public void testToString() {
//        Esfera esfera = new Esfera(2, Tipo.CIRCULO);
//        assertEquals("Esfera{medidas={Radio=2.0, Volumen=0.0, Area=0.0}}", esfera.toString());
//    }
//
//    @Test
//    public void testCalcularVolumen() {
//        Esfera esfera = new Esfera(2, Tipo.CIRCULO);
//    }
}
