package TP2.EJ4_5_12;

public class EjecutableEJ4 {
    public static void main(String[] args) {
        System.out.println("Se crea un nuevo cliente y se lo muestra");
        Normal cuentaNormal = new Normal(15000, 100000);
        Cliente cliente = new Cliente(cuentaNormal);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se gasta 20.000 de la billetera");


        cliente.getCuentaNormal().gastar(20000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se le cargan a la cuenta 10.000");

        cliente.getCuentaNormal().cargarCuenta(10000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se gasta mas de lo que puede gastar y se imprime un mensaje si no es posible realizar dicha operacion");

        if (!cliente.getCuentaNormal().gastar(105001)){
            System.out.println("No se pudo gastar, saldo insuficiente");
        }
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se inicia una inversion de 10.000");
        cliente.getCuentaNormal().iniciarInversion(10000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Pasan 40 dias desde que se inicio la inversion");

        cliente.getCuentaNormal().setDiasPasadosEnInversion(40);
        System.out.println(cliente);
        System.out.println("------------------------------------------------------------");
        System.out.println("Se retira la inversion");

        cliente.getCuentaNormal().retirarInversion();
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        Credito credito = new Credito(100000);
        cliente = new Cliente(credito);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se gasta 20.000 de la cuenta de credito");

        cliente.getCuentaCredito().gastar(20000);
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");

        System.out.println("Se gasta mas de lo que puede gastar y se imprime un mensaje si no es posible realizar dicha operación");

        if (!cliente.getCuentaCredito().gastar(105001)){
            System.out.println("No se pudo gastar, saldo insuficiente");
        }
        System.out.println(cliente);

        System.out.println("------------------------------------------------------------");
        System.out.println("Se paga un gasto de 7500");

        cliente.getCuentaCredito().pagarGastos(7500);
        System.out.println(cliente);

    }
}
