import java.util.Random;

public class Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];

        // Inicializar los asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = new Asiento(i + 1, (char) ('A' + j));
            }
        }
    }

    public void mostrarMapaAsientos() {
        for (int i = asientos.length - 1; i >= 0; i--) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j].estaOcupado() ? "X" : asientos[i][j].mostrarEtiqueta());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean venderEntrada(Espectador espectador) {
        if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
            Random random = new Random();
            int fila = random.nextInt(asientos.length);
            int columna = random.nextInt(asientos[0].length);

            while (asientos[fila][columna].estaOcupado()) {
                fila = random.nextInt(asientos.length);
                columna = random.nextInt(asientos[0].length);
            }

            asientos[fila][columna].ocuparAsiento(espectador);
            espectador.pagarEntrada(precioEntrada);
            return true;
        } else {
            return false;
        }
    }
}
