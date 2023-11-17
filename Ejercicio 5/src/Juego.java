import java.util.Scanner;

public class Juego {
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        int numJugadoresValido = (numJugadores >= 1 && numJugadores <= 6) ? numJugadores : 6;
        jugadores = new Jugador[numJugadoresValido];
        for (int i = 0; i < numJugadoresValido; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
        revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.estaVivo()) {
                System.out.println("Turno de " + jugador.nombre);
                jugador.disparar(revolver);
                revolver.siguienteBala();
                if (finJuego()) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();
        Juego juego = new Juego(numJugadores);

        while (!juego.finJuego()) {
            juego.ronda();
            System.out.println("--------");
        }

        System.out.println("El juego ha terminado.");
        scanner.close();
    }
}
