package TP1.EJ6;

import java.util.ArrayList;

public class Bibloteca {
    private ArrayList<Libro> libros;

    public Bibloteca(Libro[] libros) {

    }
    public void agregarLibro(String titulo, String autor, int anio, String isbn, int paginas, int ejemplares){
        Libro libro = new Libro(titulo, autor, anio, isbn, paginas, ejemplares);
        libros.add(libro);;
    }

    public ArrayList<Libro> buscarLibroTitulo(String titulo){
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro: libros){
            if (libro.getTitulo().equals(titulo)){
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
}
