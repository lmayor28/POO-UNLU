package TP2.EJ2;

import java.util.ArrayList;
import java.util.HashMap;

//La agencia SunBeach decide contratar un equipo de profesionales en sistemas para encarar una solución a sus problemas de gestión a través del desarrollo de un software a medida.
//        SunBeach tiene proveedores en todo el mundo (compañías aéreas, marítimas y terrestres (medios de transporte), cadenas de hoteles, hosterías, búngalos (hospedajes), y guías de turismo que ofrecen distintas excursiones). Continuamente se comunica con los mismos y de acuerdo a las distintas ofertas disponibles diseña y arma paquetes de turismo.
//        Cada paquete de turismo está compuesto por 1 (un) destino, 1 (un) medio de transporte, 1 (un) hospedaje y varias (1 o más) excursiones.
//        Los clientes que se acercan a la agencia pueden elegir entre los distintos paquetes de turismo vigentes, los cuales abonan en efectivo.
//        El sistema debe permitir llevar un registro de los distintos proveedores y su clasificación (medios de transporte, hospedajes o excursiones), los paquetes de turismo y cómo están compuestos, los clientes de la agencia y las compras que realiza cada cliente.
//        A fin de mes el administrador de SunBeach necesita un informe que contenga un listado de todas las ventas realizadas, organizadas por destino. También quiere conocer cuál es el destino favorito por sus clientes.
public class SunBrach {
    private ArrayList<Paquete> paquetes;
    private ArrayList<Paquete> paquetesDisponibles;
    private ArrayList<Cliente> clientes;
    private HashMap<Proveedor, ArrayList<Servicio>> proveedores;
    private Destino destinoFavorito;

    public SunBrach(){
        this.paquetes = new ArrayList<>();
        this.paquetesDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.proveedores = new HashMap<>();
    }

    public void crearPaqueteAleatorio(){

    }



    public void agregarProveedor(Proveedor proveedor, ArrayList<Servicio> servicios){
        this.proveedores.put(proveedor, servicios);
    }

    public void agregarPaquete(Destino destino, Transporte transporte, Hospedaje hospedaje, ArrayList<Excursion> excursiones, double precio){
        Paquete paquete = new Paquete(destino, transporte, hospedaje, precio, excursiones);
        this.agregarPaquete(paquete);
    }
    public void agregarPaquete(Paquete paquete){
        this.paquetes.add(paquete);
    }

    public void habilitarTodosLosPaquetes(){
        paquetesDisponibles = paquetes;
    }




}
