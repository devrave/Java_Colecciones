package ListaBiblioteca;

import java.util.HashSet;
import java.util.Set;

public class ListaBiblioteca {

    private boolean disponible = true;
    private Set<String> libros;

    public ListaBiblioteca() {
        this.libros = new HashSet<>();
    }

    public ListaBiblioteca(boolean disponible) {
        this.disponible = disponible;
        this.libros = new HashSet<>();

    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Set<String> getLibros() {
        return libros;
    }

    public void setLibros(Set<String> libros) {
        this.libros = libros;
    }

    public void agregarLibro(String libro){
        this.libros.add(libro);

    }

    public boolean verificarLibro(String libro) {
        return this.libros.contains(libro);
    }

    public int totalLibros() {
        return this.libros.size();
    }

    public void mostrarLibros() {
        System.out.println("----------------------------");
        System.out.println("Libros disponibles: " + isDisponible());

        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (String libro : libros) {
                System.out.println("- " + libro);
            }
            System.out.println("Total de libros únicos: " + libros.size());
        }

        System.out.println("----------------------------");




    }
}
