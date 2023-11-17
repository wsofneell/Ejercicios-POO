public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double mostrarDiscriminante(){
        return b * b - 4 * a * c;
    }

    public double obtenerRaiz1 () {
        double discriminante = mostrarDiscriminante();
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double obtenerRaiz2 () {
        double discriminante = mostrarDiscriminante();
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public double obtenerRaizUnica() {
        return -b / (2 * a);
    }

    public boolean tieneRaices() {
        return mostrarDiscriminante() > 0;
    }

    public boolean tieneRaizUnica() {
        return mostrarDiscriminante() == 0;
    }

    // calcular
}
