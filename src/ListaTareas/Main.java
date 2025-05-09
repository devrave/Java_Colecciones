package ListaTareas;

public class Main {
    public static void main(String[] args) {

        //Instanciar

        ListaTareas listaTareas = new ListaTareas();
        //Agregar tareas
        listaTareas.controlTareas("Barrer");
        listaTareas.controlTareas("Cocinar");
        listaTareas.controlTareas("Cocinar");
        listaTareas.controlTareas("Cocinar");
        //Vista
        listaTareas.mostrarTareas();
        //Eliminar
        listaTareas.controlTareas("barrer",true);
        listaTareas.mostrarTareas();





    }
}
