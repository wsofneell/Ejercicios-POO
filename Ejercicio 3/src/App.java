public class App {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Danilo Noguera", 35, 'M', "Introducción a la Programación");
        Aula aula = new Aula(1, 30, "Introducción a la Programación", profesor);

        Estudiante estudiante1 = new Estudiante("Roma Simplina", 17, 'F', 8.5);
        Estudiante estudiante2 = new Estudiante("Andrea Ramirez", 17, 'F', 7.0);
        Estudiante estudiante3 = new Estudiante("Sherly Escoto", 16, 'F', 9.0);

        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);
        aula.agregarEstudiante(estudiante3);

        System.out.println("Profesor:");
        profesor.presentar();
        System.out.println("\nEstudiantes:");
        estudiante1.presentar();
        estudiante2.presentar();
        estudiante3.presentar();

        if (aula.puedeDarseClase()) {
            System.out.println("\nSe puede dar clase en el aula #" + aula.mostrarIdAula());
            aula.mostrarAprobados();
        } else {
            System.out.println("\nNo se puede dar clase en el aula #" + aula.mostrarIdAula());
        }
    }
}
