/**
 * 
 */
package excepciones;

import java.text.ParseException;

/**
 * @author jalba
 *
 */
public class NoEsUnCorreoException extends ParseException {

	/**
	 * 
	 */
	public NoEsUnCorreoException() {
		this("", "");
	}

	/**
	 * @param arg0
	 */
	public NoEsUnCorreoException(String mail, String domain) {
		super(String.format("%s no es un correo valido para %s. lo siento.", mail, domain), 0);
		// TODO Auto-generated constructor stub
	}

}
