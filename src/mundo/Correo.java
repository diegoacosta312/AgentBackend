package mundo;

import java.text.ParseException;
import java.util.EmptyStackException;
import java.util.regex.Pattern;

import excepciones.NoEsUnCorreoException;

/**
 * La clase Correo parsea el correo entrante en un nombre de usuario y un dominio
 * @author jalba
 */
public class Correo {	
	private String username;

	/**
	 * @param entrante
	 * 
	 */
	Correo(String entrante, String domain) throws EmptyStackException, ParseException {
		if (entrante.length()==0) {
	        throw new EmptyStackException();
	    } else {
	    	Pattern p = Pattern
	    			.compile("\\w(\\.|\\-)]+\\@" + domain, 
	    					Pattern.CASE_INSENSITIVE);
	    	if(p.matcher(entrante).find()){
	    		username = entrante.split("@")[0];
	    	} else {
	    		throw new ParseException("The username is invalid, or the domain name is not the specified one", 0);
	    	}
	    }
	}
	
	public String darUsername(){
		return username;
	}
	
}

