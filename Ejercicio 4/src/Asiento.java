
class Asiento {
    private int fila;
    private char columna;
    private Espectador espectador;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public String mostrarEtiqueta() {
        return fila + String.valueOf(columna);
    }

    public boolean estaOcupado() {
        return espectador != null;
    }

    public void ocuparAsiento(Espectador espectador) {
        this.espectador = espectador;
        espectador.asignarAsiento(this);
    }

    public Espectador mostrarEspectador() {
        return espectador;
    }
}
