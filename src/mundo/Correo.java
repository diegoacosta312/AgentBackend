package mundo;

import java.util.EmptyStackException;

import excepciones.NoEsUnCorreoException;

/**
 * La clase Correo parsea el correo entrante en un nombre de usuario y un dominio
 * @author jalba
 */
public class Correo {
	
	/**
	 * @param entrante
	 * 
	 */
	Correo(String entrante) throws EmptyStackException {
		if (entrante.length()==0) {
	        throw new EmptyStackException();
	    } else {
	    	try {
	    		
	    	} catch (NoEsUnCorreoException ex) {
	    		
	    	} finally {
	    		
	    	}
	    }
	}
	String username;
	String dom;
}

