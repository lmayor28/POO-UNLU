package TP2.EJ9;

import java.util.HashMap;
import java.util.Map;

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

    protected Tipo tipoFigura;
    protected final HashMap<String, Float> medidas;

    public Figura(Tipo tipoFigura){
        this.medidas = new HashMap<>();
        this.tipoFigura = tipoFigura;
    }

    protected void calcular(){
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

        Float value = medidas.get(key);
        if (value == null) {
            throw new IllegalArgumentException("La clave " + key + " no es una medida de un: " + this.getTipoFigura());
        }
        //return medidas.get(key);
        return value;
    }

    public Tipo getTipoFigura() {
        return tipoFigura;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Tipo de Figura: " + tipoFigura + "\n";
        resultado += "Medidas: \n";
        for (Map.Entry<String, Float> entry : medidas.entrySet()) {
            switch (entry.getKey()) {
                case "Area" -> resultado += "\tArea: " + entry.getValue() + " metros cuadrados\n";
                case "Volumen" -> resultado += "\tVolumen: " + entry.getValue() + " metros cubicos\n";
                default -> resultado += "\t" + entry.getKey() + ": " + entry.getValue() + "\n";
            }
        }

        return resultado;
    }
}
