package mundo;
import java.util.*;
import Grupo;
import Materia;
import Tarea;

/**
 * @param <Grupo>
 * 
 */
public class Estudiante<Grupo> {

    /**
     * @pre El usuario debe tener un nombre de usuario y un codigo de estudiante
     * </br> Hasta este punto, y sin la contraseña el usuario solo tiene acceso a grupos a los que ha sido invitado.
     * y a los horarios no academicos del usuario.
     */
    public Estudiante(int codigo, String nombre, String usrName) {
    	CODIGO = codigo;
    	username = usrName;
    	
    	ArrayList<Materia> materias = new ArrayList<Materia>();
    	ArrayList<Estudiante> amigos = new ArrayList<Estudiante>();
    	ArrayList<Grupo> grupos = new ArrayList<Grupo>();    	
    }
    
    /**
     * Guarda el nombre del usuario. a este nombre se accede mediante 
     */
    private String nombre;

    /**
     * 
     */
    private int CODIGO;

    /**
     * 
     */
    private ArrayList<Materia> materias;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private Horario[][] horario;

    /**
     * 
     */
    private ArrayList<Estudiante> amigos;

    /**
     * 
     */
    private ArrayList<Grupo> grupos;

    /**
     * 
     */
    private Materia listaEstudiantes;


    /**
     * @param materia 
     * @return
     */
    public Materia buscarMateria(String mat) {
        // TODO implement here
    	return (new Materia);
    }

    /**
     * @return
     */
    public Horario darHorariosDisponibles() {
        // TODO implement here
    }

    /**
     * @param horario 
     * @return
     */
    public boolean comprobarDisponibilidadHorario(Horario horario) {
        // TODO implement here
        return false;
    }

    /**
     * @param materia 
     * @return
     */
    public Grupo buscarGrupo(Materia materia) {
        // TODO implement here
        return null;
    }

    /**
     * @param estudiante 
     * @return
     */
    public Grupo buscarGrupo(Estudiante estudiante) {
        // TODO implement here
        return null;
    }

    /**
     * @param tarea 
     * @return
     */
    public Grupo buscarGrupo(Tarea tarea) {
        // TODO implement here
        return null;
    }

    /**
     * @param usuario 
     * @return
     */
    public Horario<> darDisponibilidadComun(Estudiante usuario) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void crearGrupo() {
        // TODO implement here
        return null;
    }

}