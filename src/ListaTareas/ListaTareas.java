package ListaTareas;

import java.util.ArrayList;

public class ListaTareas {

    private ArrayList<String> tarea;
    private String estudiante;

    //Constructores
    public ListaTareas(){
        this.tarea = new ArrayList<>();
        this.estudiante = "";
    }

    public ListaTareas(String estudiante){
        this();
        this.estudiante = estudiante;
    }





}
