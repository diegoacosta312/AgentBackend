package mundo;

import java.util.*;

import Tarea;

/**
 * 
 */
public class Materia {

    /**
     * Default constructor
     */
    private Materia() {
    
    }

    /**
     * 
     */
    private int ID;

    /**
     * 
     */
    private String profesor;

    /**
     * 
     */
    private String nombreMateria;

    /**
     * 
     */
    private String codigoMateria;

     /**
      *  
      */
    private ArrayList<Horario> horario;

    /**
     * 
     */
    private ArrayList<Tarea> tareas;

    /**
     * 
     */
    private Examen eFinal;

    /**
     * 
     */
    private Estudiante listaEstudiantes;







    /**
     * @return
     */
    public String darProfesor() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String darNombreMateria() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String darCodigoMateria() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Tarea darTareas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Tarea darProximaTarea() {
        // TODO implement here
        return null;
    }

    /**
     * @param nombreTarea 
     * @return
     */
    public Tarea buscarTarea(String nombreTarea) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Horario darHorario() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Horario darProximaClase() {
        // TODO implement here
        return null;
    }

    /**
     * @param codigoTarea 
     * @return
     */
    public tarea darTarea(int codigoTarea) {
        // TODO implement here
        return null;
    }

}