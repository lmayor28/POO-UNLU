package TP1.EJ12;

import Clases.ListaEnlazada;
import TP1.EJ10.Tarea2;
import TP1.EJ5.Tarea;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AdministradorDeTareas {
    ListaEnlazada TAREAS;

    public AdministradorDeTareas(){
        TAREAS = new ListaEnlazada();
    }


    public void nuevaTarea( String descripcion, String titutlo, int prioridad){
        Tarea2 newTarea = new Tarea2(descripcion, titutlo, prioridad);
        this.tareaALista(newTarea);
    }
    public void nuevaTarea( String descripcion, String titulo, int prioridad, LocalDate fechaLimite){
        Tarea2 newTarea = new Tarea2(descripcion, titulo, prioridad, fechaLimite);
        this.tareaALista(newTarea);
    }
    public void nuevaTarea(String descripcion, String titulo, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        Tarea2 newTarea = new Tarea2(descripcion, titulo, prioridad, fechaLimite, fechaRecordatorio);
        this.tareaALista(newTarea);
    }

    public void tareaALista(Tarea2 tarea){
        TAREAS.agregarElemento(tarea);
    }

    public ListaEnlazada tareasActivasPrioridad() {
        // Lista que retorna la función.
        ListaEnlazada tareasPrioridad = new ListaEnlazada();

        // Se crea un TreeMap para poder ordenar las tareas
        TreeMap<Integer, ListaEnlazada> tareasPrioridadHM = new TreeMap<>(Collections.reverseOrder());

        // Bucle que recorre la lista con Tareas
        for (Object tareaObj : TAREAS){
            Tarea2 tarea = (Tarea2) tareaObj;

            if (tarea.getEstado() == Tarea.Estado.completa || tarea.getEstado() == Tarea.Estado.vencida){
                continue;
            }

            if (tareasPrioridadHM.containsKey(tarea.getPrioridad())){
                tareasPrioridadHM.get(tarea.getPrioridad()).agregarElemento(tarea);
            } else {
                tareasPrioridadHM.put(tarea.getPrioridad(), new ListaEnlazada());
            }

        } // Fin del bucle for

        for (Map.Entry<Integer, ListaEnlazada> elemento : tareasPrioridadHM.entrySet()){
            Integer prioridad = elemento.getKey();
            ListaEnlazada tareas = elemento.getValue();

            for (Object tareaObj : tareas){
                Tarea2 tarea = (Tarea2) tareaObj;
                tareasPrioridad.agregarElemento(tarea);
            }
        }

        return  tareasPrioridad;
    }

    public ListaEnlazada tareasActivaPorProximidad(){

    }
}
