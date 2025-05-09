package ListaTareas;

import java.util.ArrayList;

public class ListaTareas {


    private ArrayList<String> tareas;
    private String estudiante;
    private int id;

    //Constructores
    public ListaTareas(){
        this.tareas = new ArrayList<>();
        this.estudiante = "";
        this.id = 0;

    }

    public ListaTareas(String estudiante){
        this();
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void controlTareas(String tarea){
        this.tareas.add(tarea.toLowerCase());
        this.id++;

    }
    public void controlTareas(String tarea, boolean completada){
        if(completada && this.tareas.contains(tarea.toLowerCase())){
            this.tareas.remove(tarea);
            this.id--;
            System.out.println("Hola");
        }else{
            System.out.println("La tarea"+ getTareas()+ "todavía esta en desarrollo");
        }
    }

    public void mostrarTareas(){
        System.out.println("----------------------------");
        System.out.println("Tareas: " );
        for(String tarea: getTareas()){
            System.out.println("- " + tarea);
        }
        System.out.println("Tareas pendientes : " + getId());
        System.out.println("-----------------------------");
    }


}
