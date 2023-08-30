package Practica.ignore;

import java.util.ArrayList;
import java.util.Objects;

public class TrabajoClase {

    public String enLista(String texto, ArrayList<String> array){

        /*for (int i = 0; i < array.size(); i++){
            if (Objects.equals(texto, array.get(i)) ){
                return array.get(i);
            }
        }*/

        if (array.contains(texto)){
            return texto;
        } else {
            return null;
        }
    }
    public int cantString(String texto, ArrayList<String> array){
        int cantRep = 0;
        for (String s : array) {
            if (Objects.equals(texto, s)) {
                cantRep += 1;
            }

        }
        return cantRep;
    }

    public void mostrarListaConBucleFor(ArrayList<String> array){
        for (String s: array){
            System.out.println(s);
        }
    }
}
