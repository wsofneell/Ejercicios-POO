public class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    public double mostrarCalificacion() {
        return calificacion;
    }

    public void cambiarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void presentar() {
        super.presentar();
        System.out.println("Mi calificación actual es: " + calificacion);
    }

    public boolean puedeAsistir() {
        // Los estudiantes pueden faltar hasta un 50%
        return Math.random() > 0.5;
    }
}
