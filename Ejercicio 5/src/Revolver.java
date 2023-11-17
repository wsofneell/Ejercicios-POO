class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        this.posicionActual = 1;
        this.posicionBala = (int) (Math.random() * 6) + 1;
    }

    public boolean disparar() {
        return this.posicionActual == this.posicionBala;
    }

    public void siguienteBala() {
        this.posicionActual = (this.posicionActual % 6) + 1;
    }

    public void mostrar() {
        System.out.println("Posición actual del tambor: " + this.posicionActual);
        System.out.println("Posición de la bala: " + this.posicionBala);
    }
}
