class Espectador {
    private String nombre;
    private int edad;
    private double dinero;
    private Asiento asiento;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void pagarEntrada(double precio) {
        dinero -= precio;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void asignarAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}
