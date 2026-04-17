public class EL_Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public EL_Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("Error: el libro ya esta prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto exitosamente.");
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        EL_Libro miLibro = new EL_Libro("El Senor de los Anillos", "J.R.R. Tolkien", "978-0345339683");

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}