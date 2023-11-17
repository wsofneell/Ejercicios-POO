package ActasNotas;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ActasNotas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        do {
            ArrayList<Estudiante> estudiantes = DatosGene();
            // DatosEst(estudiantes);
            MosAc(estudiantes);
            MosEsta(estudiantes);

            System.out.print("¿Desea utilizar la aplicación de nuevo? (Si/No): ");
        } while (lector.nextLine().equalsIgnoreCase("Si"));

        System.out.println("Gracias por utilizar ActasDeNotas.");

        lector.close();
    }

    // inicio 1
    public static ArrayList<Estudiante> DatosGene() {
        Scanner lector = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.print("Curso:\t\t ");
        String nombreCurso = lector.nextLine();
        System.out.print("Período lectivo: ");
        String periodoLectivo = lector.nextLine();
        System.out.print("Carrera: ");
        String Carrera = lector.nextLine();
        System.out.print("Modalidad: ");
        String Modalidad = lector.nextLine();
        System.out.print("Cod. Curso: ");
        String codigoCurso = lector.nextLine();
        System.out.print("Grupo: ");
        String Grupo = lector.nextLine();
        System.out.print("Cod. Asignatura: ");
        String codigoAsig = lector.nextLine();
        System.out.print("Cod. Prog: ");
        String codigoProg = lector.nextLine();

        System.out.print("Cantidad de estudiantes: ");
        int cantidadEstudiantes = Integer.parseInt(lector.nextLine());

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Datos del estudiante #" + (i + 1));
            System.out.print("Número de carnet: ");
            String carnet = lector.nextLine();
            System.out.print("Nombres y Apellidos: ");
            String nombre = lector.nextLine();
            Estudiante estudiante = new Estudiante(nombre, carnet);

            do {
                System.out.print("Primer parcial (máximo 35.00): ");
                estudiante.PriParcial = Double.parseDouble(lector.nextLine());

                if (estudiante.PriParcial < 0.00 || estudiante.PriParcial > 35.00) {
                    System.out.println("Por favor, ingrese un valor válido entre 0.00 y 35.00.");
                }

            } while (estudiante.PriParcial < 0.00 || estudiante.PriParcial > 35.00);
            System.out.print("¿La asignatura lleva proyecto de curso? (Si/No): ");
            String proyectoCurso = lector.nextLine();

            if (proyectoCurso.equalsIgnoreCase("Si")) {
                do {
                    System.out.print("Nota de Proyecto (máximo 35.00): ");
                    estudiante.Proyec = Double.parseDouble(lector.nextLine());
                    if (estudiante.Proyec < 0.00 || estudiante.Proyec > 35.00) {
                        System.out.println("Por favor, ingrese un valor válido entre 0.00 y 35.00.");
                    }
                } while (estudiante.Proyec < 0.00 || estudiante.Proyec > 35.00);

                do {
                    System.out.print("Sistemáticos (máximo 30.00): ");
                    estudiante.Sist = Double.parseDouble(lector.nextLine());
                    if (estudiante.Sist < 0.00 || estudiante.Sist > 35.00) {
                        System.out.println("Por favor, ingrese un valor válido entre 0.00 y 35.00.");
                    }
                } while (estudiante.Sist < 0.00 || estudiante.Sist > 35.00);

                estudiante.NF = estudiante.PriParcial + estudiante.Sist + estudiante.Proyec;
            } else {
                System.out.print("Segundo parcial (máximo 35.00): ");
                estudiante.SeParcial = Double.parseDouble(lector.nextLine());
                System.out.print("Sistemáticos (máximo 30.00): ");
                estudiante.Sist = Double.parseDouble(lector.nextLine());

                estudiante.NF = estudiante.PriParcial + estudiante.Sist + estudiante.SeParcial;
            } // FF

            // yapp
            if (estudiante.NF < 60.00) {
                System.out.print("Examen de primera convocatoria (máximo 70.00): ");
                estudiante.examenConvo1 = Double.parseDouble(lector.nextLine());
                estudiante.NFC1 = estudiante.Sist + estudiante.examenConvo1;

                if (estudiante.NFC1 < 60.00) {
                    System.out.print("Examen de segunda convocatoria (máximo 100.00): ");
                    estudiante.examenConvo2 = Double.parseDouble(lector.nextLine());
                    estudiante.NFC2 = estudiante.examenConvo2;
                }

            }

            estudiante.Apro = estudiante.NF >= 60.00 || estudiante.NFC1 >= 60.00 || estudiante.NFC2 >= 60;

            do {
                System.out.print("¿Desertó el curso? (S/N): ");
                char desercion = lector.next().charAt(0);
            } while ((desercion != 's' || desercion != 'S') || (desercion != 'N' || desercion != 'n'));

            estudiantes.add(estudiante);

            lector.close();
        }
        return estudiantes;
    }
    // final 1

    public static void ordenarYMostrarActa(ArrayList<Estudiante> estudiantes) {
        Collections.sort(estudiantes, (e1, e2) -> e1.nombre.compareTo(e2.nombre));
        MosAc(estudiantes);
    }

    public static void MosAc(ArrayList<Estudiante> estudiantes) {
        System.out.println(
                "Nº Carnet\tNombres y Apellidos\t1er Parcial\t2do Parcial\tSistematicos\tProyecto\tNota Final\tConvo I\tNota Final Convo I\tConvo II\tNota Final Convo II\tAprobado\tDeserción");
        for (Estudiante estudiante : estudiantes) {

            System.out
                    .println(estudiante.carnet + " \t\t" + estudiante.nombre + "\t\t\t" + estudiante.PriParcial + "\t\t"
                            + estudiante.SeParcial + "\t\t" + estudiante.Sist + "\t\t" + estudiante.Proyec + "\t\t"
                            + estudiante.NF
                            + "\t\t" + estudiante.examenConvo1 + "\t\t" + estudiante.NFC1 + "\t\t"
                            + estudiante.examenConvo2 + "\t\t" + estudiante.NFC2 + "\t\t"
                            + (estudiante.Apro ? "Si" : "No") + "\t\t" + (estudiante.Desercion ? "Si" : "No"));
        }
    }

    public static void MosEsta(ArrayList<Estudiante> estudiantes) {
        int matriculaInicial = estudiantes.size();
        int matriculaEfectiva = (int) estudiantes.stream().filter(e -> !e.Desercion).count();
        int numDeserciones = matriculaInicial - matriculaEfectiva;
        int numAprobados = (int) estudiantes.stream().filter(e -> e.Apro).count();
        int numReprobados = matriculaEfectiva - numAprobados;
        double porcentajeAprobados = (double) numAprobados / matriculaEfectiva * 100;
        double porcentajeReprobados = (double) numReprobados / matriculaEfectiva * 100;
        double notaMinima = estudiantes.stream().mapToDouble(e -> e.NF).min().orElse(0);
        double notaMaxima = estudiantes.stream().mapToDouble(e -> e.NF).max().orElse(0);
        double promedioNotas = estudiantes.stream().mapToDouble(e -> e.NF).average().orElse(0);

        System.out.println("Reporte de Datos Estadísticos del Curso:");
        System.out.println("Matrícula Inicial: " + matriculaInicial);
        System.out.println("Matrícula Efectiva: " + matriculaEfectiva);
        System.out.println("Número de Deserciones: " + numDeserciones);
        System.out.println("Cantidad de Aprobados: " + numAprobados);
        System.out.println("% de Aprobados: " + porcentajeAprobados + "%");
        System.out.println("Cantidad de Reprobados: " + numReprobados);
        System.out.println("% de Reprobados: " + porcentajeReprobados + "%");
        System.out.println("Nota Mínima: " + notaMinima);
        System.out.println("Nota Máxima: " + notaMaxima);
        System.out.println("Promedio de Notas: " + promedioNotas);
    }
}