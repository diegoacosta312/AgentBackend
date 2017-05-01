package mundo;

import java.text.ParseException;
import java.util.EmptyStackException;
import java.util.regex.Pattern;

import Parsers.CorreoParser;

import excepciones.NoEsUnCorreoException;

/**
 * La clase Correo parsea el correo entrante en un nombre de usuario y un dominio
 * @author jalba
 */
public class Correo {
	private String correo, nombre, domain, username;

	/**
	 * @param entrante
	 * 
	 */
	public Correo(String correo, String domain) throws Exception, ParseException {
		if (correo.length() == 0) {
	        throw new Exception();
	    } else {
	    	if(CorreoParser.verificarCorreo(correo, domain)){
	    		this.correo = correo;
	    		username = correo.split("@")[0];
	    	} else {
	    		throw new ParseException("El nombre de usuario no es valido o el dominio no es el correcto", 0);
	    	}
	    }
	}
	
	public Correo(String correo, String domain, String nombre) throws ParseException, Exception {
		this(correo, domain);
		this.nombre = nombre;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public String darUsername(){
		return username;
	}
	
	public String darCorreo(){
		return correo;
	}
	
	@Override public String toString() {
		return nombre + ": " + correo;
	}
	
}