public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }

    public String mostrarAsignatura() {
        return asignatura;
    }

    @Override
    public void presentar() {
        super.presentar();
        System.out.println("Imparto la asignatura de " + asignatura);
    }

    public boolean estaDisponible() {
        // El profesor tiene un 20% de no estar disponible
        return Math.random() > 0.2;
    }
}
