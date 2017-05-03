package mundo;

import java.util.*;

/**
 * 
 */
public class Materia {

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
    private ArrayList<Estudiante> listaEstudiantes;

    /**
     * Default constructor
     */
    private Materia(int pId, String pProfesor, String pNombreMateria, String pCodigoMateria, 
                    ArrayList<Horario> pHorario, ArrayList<Tarea> pTareas, Examen pExamenFinal, ArrayList<Estudiante> pListaEstudiantes) 
    {
    
    }

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
    public Tarea darTarea(int codigoTarea) {
        Tarea coincidencia = null;
        return coincidencia; 
    }

}
