package Parsers;

import java.text.ParseException;
import java.util.regex.Pattern;

import excepciones.NoEsUnCorreoException;

public class CorreoParser {
	private static String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]*";

	public static boolean verificarCorreo(String correo, String domain) throws ParseException {
		Pattern p = Pattern.compile(EMAIL_REGEX + domain, Pattern.CASE_INSENSITIVE);
    	
		if(p.matcher(correo).find())
    		return true;
    	
    	throw new NoEsUnCorreoException(correo, domain);
	}

}
