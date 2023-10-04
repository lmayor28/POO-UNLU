package TP2.EJ3;

import Util.NombreApellidoAleatorio;

public class EjecutableEJ3 {
    public static void main(String[] args) {
        //System.out.println(NombreApellidoAleatorio.Nombre() + " " + NombreApellidoAleatorio.Apellido());

        AcademiaDanza academiaDanza = new AcademiaDanza("ACADEMIA RODIGREZ");

        academiaDanza.agregarDiagramacion();

        academiaDanza.agregarDiagramacion();
        academiaDanza.agregarDiagramacion();

        academiaDanza.cargarRandomTodo();
        academiaDanza.cargarAsistenciaRandom();

        System.out.println("\n\nLa diagramacion con mayor paga es la siguiente:");
        System.out.println(academiaDanza.DiagramacionMayorPaga());


        System.out.println("\n\nLa academia danza tiene la siguiente diagramaciones:");
        System.out.println(academiaDanza);



    }
}
