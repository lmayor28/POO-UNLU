package TP1.EJ8;

import Clases.Iterador;
import Clases.ListaEnlazada;

public class AdministradorDeContrasenias {
    private ListaEnlazada contrasenias;
    private GeneradoContrasenias generadoContrasenias;

    // Contructor
    public AdministradorDeContrasenias(){
        generadoContrasenias = new GeneradoContrasenias();
        contrasenias = new ListaEnlazada();
    }

    public int cantidadContrasenias(){
        return contrasenias.longitud();
    }
    public void generarContrasenias(int cantContrasenias){
        for (int i = 0; i < cantContrasenias; i++){
            contrasenias.agregarElemento(generadoContrasenias.generarContrasenia());
        }
    }

    public boolean esFuerte(String contrasenia){
        return generadoContrasenias.esFuerte(contrasenia);
    }

    public String mostrarContrasenias(){
        Iterador iter = contrasenias.iterador();
        String resultado = "";
        while (iter != null){
            Object contrasenia = iter.siguiente();
            if (contrasenia == null) break;
            resultado += ("Contraseña: " + contrasenia + " - " +
                              (this.esFuerte(contrasenia.toString()) ? "Fuerte\n" : "Debil\n"));
        }
        return resultado;
    }
}
