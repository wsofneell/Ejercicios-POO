class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
