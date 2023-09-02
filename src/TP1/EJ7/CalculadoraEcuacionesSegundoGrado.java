package TP1.EJ7;

public class CalculadoraEcuacionesSegundoGrado {
    private double a;
    private double b;
    private double c;

    private String ecuacion;

    private double x1;
    private double x2;

    public CalculadoraEcuacionesSegundoGrado(String ecuacion){
        this.ecuacion = ecuacion;
        if (ecuacion.contains("y =") || ecuacion.contains("y=")){
            extraerCoehficientesDeString();
            raicesDeEcuacion();
        }
    }
    private void extraerCoehficientesDeString(){
        String ecuacionAux;
        // Se extraen los espacios del string que recibimos
        ecuacionAux = ecuacion.replaceAll(" ", "");
        // Se extraen el "y=" del string que recibimos
        ecuacionAux = ecuacionAux.replaceAll("y=", "");
        // Se extraen las x y las potencias que recibimos
        ecuacionAux = ecuacionAux.replaceAll("x", "");
        ecuacionAux = ecuacionAux.replaceAll("\\^2", "");
        ecuacionAux = ecuacionAux.replaceAll("\\^", "");

        if (ecuacionAux.contains("-")){
            ecuacionAux =  ecuacionAux.replaceAll("-", "+-");
        }

        // Se extraen los coeficientes usando los separados de "+" que tiene la ecuacion.
        String[] coeficientes = ecuacionAux.split("\\+");
        // Se extraen los coeficientes y se guardan en las variables correspondientes
        this.a = coeficientes[0].isEmpty() ? 0 : Double.parseDouble(coeficientes[0]);
        this.b = coeficientes[1].isEmpty() ? 0 : Double.parseDouble(coeficientes[1]);
        this.c = coeficientes[2].isEmpty() ? 0 : Double.parseDouble(coeficientes[2]);
    }

    private void raicesDeEcuacion(){
        double discriminante = b*b - 4*a*c;
        if (discriminante < 0){
            x1 = x2 = Double.NaN;
            return;
        }
        if (discriminante == 0){
            x1 = x2 = -b /(2*a);
        } else {
            x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            x2 = (-b - Math.sqrt(discriminante)) / (2*a);
        }
    }

    public void mostrarRaices(){
        if (Double.isNaN(x1)){
            System.out.println("No tiene soluciones reales");
            return;
        }
        if (x1 == x2){
            System.out.println("La ecuacion tiene una sola raiz que es: "+x1);
        } else {
            System.out.println("Las raices de la ecuacion son: X1 = "+x1+" y X2 ="+x2);
        }
    }
    public Double resolverEcuacion(Double x){
        return a*x*x + b*x + c;
    }

    // Se sobreescribe el metodo toString para que nos muestre la ecuacion completa.
    public String toString(){
        return ("Y = "+a+"x^2"+(b>0 ? " + " : " ")+b+"x"+(c>0 ? " + " : " ")+c);
        //return ("Los valores de la funcion son: A: "+ a +" B: "+b+" C: "+c);
    }
}
