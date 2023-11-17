public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public int mostrarEdad() {
        return edad;
    }

    public char mostrarSexo() {
        return sexo;
    }

    public void presentar() {
        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años y soy "
                + ((sexo == 'M') ? "masculino" : "femenino"));
    }
}
