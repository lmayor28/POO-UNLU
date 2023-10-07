package TP2.EJ4_5_12;

public class EjecutableEJ5 {
    public static void main(String[] args) {
        Normal normal = new Normal(11000, 0);
        Cliente cliente = new Cliente(normal);

        System.out.println("Se crea un nuevo cliente con cuenta normal.");

        System.out.println(cliente);
        System.out.println("------------------------------------------");
        System.out.println("El cliente incia una inversion de $9000.");
        System.out.println("------------------------------------------");

        cliente.getCuentaNormal().iniciarInversion(9000);
        System.out.println(cliente);
        System.out.println("------------------------------------------");
        System.out.println("Se quiere hacer una compra que es mas grande que el saldo de la cuenta normal ($12000). Y el modo de autocancelar no esta activo");
        System.out.println("------------------------------------------");

        //cliente.getCuentaNormal().setAutoCancelarIntereses(true);
        cliente.getCuentaNormal().setDiasPasadosEnInversion(55);

        if (!cliente.getCuentaNormal().gastar(12000)){
            System.out.println("No se ha podido realizar la compra, saldo insuficiente");
        }
        System.out.println(cliente);

        System.out.println("------------------------------------------");
        System.out.println("Se quiere hacer una compra que es mas grande que el saldo de la cuenta normal ($10000). Y el modo de autocancelar esta activo");
        System.out.println("------------------------------------------");

        cliente.getCuentaNormal().setAutoCancelarIntereses(true);
        cliente.getCuentaNormal().gastar(10000);

        System.out.println(cliente);
        System.out.println("------------------------------------------");








    }  // main()
}
