import Clases.ListaEnlazada;
import Clases.Pila;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarElemento("Hola");
        listaEnlazada.agregarElemento(" Mundo");
        listaEnlazada.insertar(0, " Gigante");

        System.out.println(listaEnlazada.recuperar(0));
        System.out.println(listaEnlazada.recuperar(1));
        System.out.println(listaEnlazada.recuperar(2));

        System.out.println("Como andan ??");

        Pila pila = new Pila();

        pila.apilar("Hola");
        pila.apilar(" Mundo");

        System.out.println("Pila resultados");
        System.out.println(pila.recuperar());
        pila.desapilar();
        System.out.println(pila.recuperar());

    }
}

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        /*for (int i = 1; i <= 5; i++)

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

    }
}*/