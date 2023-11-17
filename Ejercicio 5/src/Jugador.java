class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public void disparar(Revolver revolver) {
        System.out.println(this.nombre + " se apunta y dispara...");
        if (revolver.disparar()) {
            System.out.println("¡BANG! " + this.nombre + ", descansa en paz. ");
            this.vivo = false;
        } else {
            System.out.println("¡POW!" + this.nombre + " sobrevivió, pongase pilas.");
        }
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public String getNombre() {
        return this.nombre;
    }
}