package TP2.EJ9;

import java.util.HashMap;

public abstract class Figura {
    public enum Tipo {
        circulo,
        rectangulo,
        cuadrado,
        triangulo,
        esfera,
        paralelepipedo,
        cubo,
        tetraedro
    }

    private final Tipo tipoFigura;
    protected final HashMap<String, Float> medidas;

    public Figura(Tipo tipoFigura){
        this.medidas = new HashMap<>();
        this.tipoFigura = tipoFigura;
    }

    public void calcular(){
        this.medidas.put("Area", calcularArea());
        //this.medidas.put("Volumen", calcularVolumen());
    }

    protected abstract float calcularArea();
    // Lo que hace el atributo abstracto es que obliga a que las clases hijas implementen el metodo.
    // protected abstract float calcularVolumen();

    public void validar(){
        for(float dato : medidas.values()){
            if(dato <= 0){
                throw new IllegalArgumentException("Los datos no pueden ser negativos");
            }
        }

    }

    public float getArea() {
        return medidas.get("Area");
    }
    public float getVolumen(){
        return medidas.get("Volumen");
    }

    protected float m(String key){
        return medidas.get(key);
    }

    public Tipo getTipoFigura() {
        return tipoFigura;
    }
}
