package TP2.EJ4_5_12;

public class EjecutableEJ12 {
    public static void main(String[] args) {
        CajaAhorro cajaAhorro = new CajaAhorro(100000);
        Cliente cliente = new Cliente(cajaAhorro);

        System.out.println("Se crea un nuevo cliente y se lo muestra");
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se gasta 20.000 de la billetera");
        System.out.println("------------------------------------------------------------");


        cliente.getCajaAhorro().gastar(20000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se le cargan a la cuenta 10.000");
        System.out.println("------------------------------------------------------------");

        cliente.getCajaAhorro().cargarCuenta(10000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se gasta mas de lo que puede gastar y se imprime un mensaje si no es posible realizar dicha operacion");
        System.out.println("------------------------------------------------------------");

        if (!cliente.getCajaAhorro().gastar(105001)){
            System.out.println("No se pudo gastar, saldo insuficiente");
        }
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se inicia una inversion de 10.000");
        System.out.println("------------------------------------------------------------");

        cliente.getCajaAhorro().iniciarInversion(10000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Pasan 40 dias desde que se inicio la inversion");
        System.out.println("------------------------------------------------------------");

        cliente.getCajaAhorro().setDiasPasadosEnInversion(40);
        System.out.println(cliente);
        System.out.println("------------------------------------------------------------");
        System.out.println("Se retira la inversion");
        System.out.println("------------------------------------------------------------");

        cliente.getCajaAhorro().retirarInversion();
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");


    }  //main())
}
