package mundo;
import java.util.*;

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
    public Estudiante() {
    	CODIGO = (Integer) null;
    	username = null;
    	contrasegna = null;
    	ArrayList<Materia> materias = new ArrayList<Materia>();
    	ArrayList<Estudiante> amigos = new ArrayList<Estudiante>();
    	ArrayList<Grupo> grupos = new ArrayList<Grupo>();    	
    }
    
    /**
	 * El codigo del usuario se obtiene mediante consulta a la base de datos de Banner.
	 */
	private int CODIGO;

	/**
     * Guarda el nombre de usuario del usuario. a este nombre se accede pidiendolo mediante facebook chat 
     */

    private String username;

     /**
     * contrasegna, se debe guardar de forma no-plana pero reversible (PGP)
     */
    private String contrasegna;
    /**
     * Guarda el nombre de pila del usuario. a este dato se accede comparando el nombre del usuario con la base de datos de la universidad. 
     */

    
    private String nombre;

    /**
     * Lista de materias generada a partir de los datos de Banner.
     */
    private ArrayList<Materia> materias;

    /**
     * Horario construido a partir de los datos obtenidos de Banner
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
     * @param materia 
     * @return
     */
    public Materia buscarMateria(String mat) {
        // TODO implement here
    	Materia coincidencia = null;
    	return coincidencia;
    }

    /**
     * @return
     */
    public Evento darHorariosDisponibles() {
        // TODO implement here
    	Evento horariodisponible = null;
    	return horariodisponible;
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
    public ArrayList<Horario> darDisponibilidadComun(Estudiante usuario) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void crearGrupo() {
        // TODO implement here
    }

}