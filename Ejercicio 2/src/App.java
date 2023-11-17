import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        Raices raices = new Raices(0, 0, 0);

        System.out.print("Ingrese el coeficiente a: ");
        double a = lector.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = lector.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = lector.nextDouble();

        if (raices.tieneRaices()) {
            System.out.println("Raíz 1: " + raices.obtenerRaiz1());
            System.out.println("Raíz 2: " + raices.obtenerRaiz2());
        } else if (raices.tieneRaizUnica()) {
            System.out.println("Única raíz: " + raices.obtenerRaizUnica());
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    
    }
}

/*

 2- Realizar una clase llamada Raices, donde se represente los valores de una
ecuación de segundo grado.
Habrá 3 coeficientes como atributos, llamados a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:
• obtenerRaices(): imprime las 2 posibles soluciones.
• obtenerRaiz(): imprime una única raíz, que será cuando solo tenga una sola solución
posible.
• mostrarDiscriminante(): devuelve el valor del discriminante (double), el discriminante
tiene la fórmula b2
-4ac.
• tieneRaices(): devuelve un booleano indicando si tiene 2 soluciones, para que esto
ocurra, el discriminante debe ser mayor que 0.
• tieneRaiz(): devuelve un booleano indicando si tiene una única soluciones, para que
esto ocurra, el discriminante debe ser igual que 0.

*Falta*
• calcular(): muestra por consola las posibles soluciones que tiene la ecuación, en
caso de no existir solución real, mostrarlo también.

 */