package TP1.EJ13;

import TP1.EJ1.ListaEnlazada;
import TP1.EJ10.Tarea2;
import TP1.EJ5.Tarea;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class AdministradorDeTareasColaboradores {
    private ListaEnlazada TAREAS;

    private ListaEnlazada COLABORADORES;

    public AdministradorDeTareasColaboradores(){
        TAREAS = new ListaEnlazada();
    }


    // Constructores
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
                tareasPrioridadHM.get(tarea.getPrioridad()).agregarElemento(tarea);
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
        ListaEnlazada tareasFechaProximidad = new ListaEnlazada();

        // Se crea un TreeMap para poder ordenar las tareas
        TreeMap<LocalDate, ListaEnlazada> tareasFechaProximaTM = new TreeMap<>();


        for (Object tareaObj : TAREAS){
            Tarea2 tarea = (Tarea2) tareaObj;

            if (tarea.getEstado() == Tarea.Estado.completa ||
                tarea.getEstado() == Tarea.Estado.vencida ||
                tarea.getFechaLimite() == null){
                continue;
            }

            if (tareasFechaProximaTM.containsKey(tarea.getFechaLimite())){
                tareasFechaProximaTM.get(tarea.getFechaLimite()).agregarElemento(tarea);
            } else {
                tareasFechaProximaTM.put(tarea.getFechaLimite(), new ListaEnlazada());
                tareasFechaProximaTM.get(tarea.getFechaLimite()).agregarElemento(tarea);
            }

        } // Fin del bucle for

        for (Map.Entry<LocalDate, ListaEnlazada> elemento : tareasFechaProximaTM.entrySet()){
            LocalDate fechaLimite = elemento.getKey();
            ListaEnlazada tareas = elemento.getValue();

            for (Object tareaObj : tareas){
                Tarea2 tarea = (Tarea2) tareaObj;
                tareasFechaProximidad.agregarElemento(tarea);
            }
        }

        return  tareasFechaProximidad;
    }

    public Tarea2 buscarPorTitulo(String titulo){
        for (Object tareaObj : TAREAS){
            Tarea2 tarea = (Tarea2) tareaObj;
            if ( tarea.getTitulo().equals(titulo)){
                return  tarea;
            }
        }
        return null;
    }

    public void marcarTerminada(Tarea2 tarea){
        if (tarea == null){
            return;
        }
        tarea.completarTarea();
    }

    @Override
    public String toString(){
        String resultado = "";
        for (Object tareaObj : TAREAS){
            Tarea2 tarea = (Tarea2) tareaObj;
            resultado += tarea.toString();
            resultado += "\n\n";
        }

        return resultado;
    }
}
