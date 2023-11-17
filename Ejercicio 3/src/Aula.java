public class Aula {
    private int idAula;
    private int capacidadMaxima;
    private String asignatura;
    private Profesor profesor;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Aula(int idAula, int capacidadMaxima, String asignatura, Profesor profesor) {
        this.idAula = idAula;
        this.capacidadMaxima = capacidadMaxima;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.estudiantes = new Estudiante[capacidadMaxima];
        this.cantidadEstudiantes = 0;
    }

    public int mostrarIdAula() {
        return idAula;
    }

    public int mostrarCapacidadMaxima() {
        return capacidadMaxima;
    }

    public String mostrarAsignatura() {
        return asignatura;
    }

    public Profesor mostrarProfesor() {
        return profesor;
    }

    public Estudiante[] mostrarEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < capacidadMaxima) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("No se pueden agregar más estudiantes, la capacidad máxima se ha alcanzado.");
        }
    }

    public boolean puedeDarseClase() {
        int contadorAsistentes = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].puedeAsistir()) {
                contadorAsistentes++;
            }
        }

        return profesor.estaDisponible() && asignatura.equals(profesor.mostrarAsignatura())
                && (contadorAsistentes > capacidadMaxima / 2);
    }

    public void mostrarAprobados() {
        int aprobadosMasculinos = 0;
        int aprobadosFemeninos = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].mostrarCalificacion() >= 5.0) {
                if (estudiantes[i].mostrarSexo() == 'M') {
                    aprobadosMasculinos++;
                } else {
                    aprobadosFemeninos++;
                }
            }
        }

        System.out.println("Aprobados en el aula #" + idAula);
        System.out.println("Aprobados Masculinos: " + aprobadosMasculinos);
        System.out.println("Aprobados Femeninos: " + aprobadosFemeninos);
    }
}
