public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int nPaginas;

    public Libro(String ISBN, String Título, String Autor, int nPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nPaginas = nPaginas;
    }

    public String mostrarISBN() {
        return ISBN;
    }

    public void cambiarISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String mostrarTitulo() {
        return Titulo;
    }

    public void cambiarTitulo(String Título) {
        this.Titulo = Titulo;
    }

    public String mostrarAutor() {
        return Autor;
    }

    public void cambiarAutor(String Autor) {
        this.Autor = Autor;
    }

    public int mostrarnPaginas() {
        return nPaginas;
    }

    public void cambiarnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public void mostrar() {
        System.out.println("El libro " + Titulo + " con  ISBN " + ISBN + " creado por el autor " + Autor + " y tiene " + nPaginas + " paginas.");
    }
}

