package ListaBiblioteca;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Instanciar
        ListaBiblioteca listaBiblioteca = new ListaBiblioteca();
        listaBiblioteca.agregarLibro("La meta");
        listaBiblioteca.agregarLibro("La monja");
        listaBiblioteca.agregarLibro("La mica");
        listaBiblioteca.agregarLibro("La mica");
        listaBiblioteca.mostrarLibros();

        // Verificar si un libro específico está disponible
        String libroABuscar = "La mica";
        if (listaBiblioteca.verificarLibro(libroABuscar)) {
            System.out.println("El libro " + libroABuscar + "\" está disponible en la biblioteca.");
        } else {
            System.out.println("El libro " + libroABuscar + "\" no está disponible.");
        }
    }

}

