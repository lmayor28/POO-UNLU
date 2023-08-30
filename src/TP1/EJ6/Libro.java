package TP1.EJ6;

public class Libro {
    // Atributos basicos.
    private String titulo;
    private String autor;
    private String descripcion;
    private String isbn;
    private int anio;
    private int paginas;
    private int ejemplares;
    private int ejemploresPrestados = 0;


    //Constructor.
    public Libro(String titulo, String autor, int anio, String isbn, int paginas, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
        this.paginas = paginas;
        this.ejemplares = ejemplares;
        this.descripcion = "El libro " + titulo + " creado por el autor " +
                            autor + " tiene " + paginas + " paginas, quedan " +
                            ejemplares + " disponibles y se prestaron " + ejemploresPrestados + " ejemplares.";;
    }

    public void mostrarDescripcion(){
        System.out.println(descripcion);
    }
    public boolean prestarLibro(){
        if (ejemploresPrestados < ejemplares){
            ejemploresPrestados++;
            ejemplares--;
            return true;
        }
        return false;
    }
    public boolean devolverLibro(){
        if (ejemploresPrestados > 0){
            ejemploresPrestados--;
            ejemplares++;
            return true;
        }
        return false;
    }

    public void rellenarEjemplares(int ejemplares){
        this.ejemplares += ejemplares;
    }

    public int cantidadEjemplares(){
        return ejemplares;
    }

    public int cantidadEjemplaresPrestados(){
        return ejemploresPrestados;
    }

    public int cantidadEjemplaresTotales(){
        return ejemplares + ejemploresPrestados;
    }


    //Setters.
    public String getTitulo() {
        return titulo;
    }


    // SETTER INCORRECTOS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarNuevaDescripcion(){

        this.descripcion = "El libro " + titulo + " creado por el autor " +
                autor + " tiene " + paginas + " paginas, quedan " +
                ejemplares + " disponibles y se prestaron " + ejemploresPrestados + " ejemplares.";
        System.out.println(descripcion);
    }

    public int getAnio() {
        return anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }
}
