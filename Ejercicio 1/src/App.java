public class App {
    public static void main(String[] args)  {
        Libro libro1 = new Libro("978-3140464079", "El Principito", "Antoine de Saint-Exupéry" , 67);
        Libro libro2 = new Libro("978-1573226127", "El señor de las moscas", "Willian Golding", 288);
    
        libro1.mostrar();
        libro2.mostrar();

        if (libro1.mostrarnPaginas() > libro2.mostrarnPaginas()) {
            System.out.println(" El libro " + libro1.mostrarTitulo() + " tienes mas paginas.");
        } else if (libro2.mostrarnPaginas() > libro1.mostrarnPaginas()) {
            System.out.println(" El libro " + libro2.mostrarTitulo() + " tienes mas paginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de paginas.");
        }
    
    }
}
