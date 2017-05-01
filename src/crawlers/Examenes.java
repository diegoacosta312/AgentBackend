package crawlers;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import mundo.Evento;

public class Examenes {
	private static String URL_DIRECTORY = "https://registroapps.uniandes.edu.co/scripts/examenesFinales/admInfExaJoomla.php";
	public Examenes() {
	}
	
	
	public List<Evento> buscar(int codigo, int periodo) throws IOException, ParseException, Exception {
		Document document = Jsoup.connect(URL_DIRECTORY)
				.userAgent("Chrome/58.0.3029.81")
				.data("codigo", String.valueOf(codigo), "xCodigo", "S", "periodo", String.valueOf(periodo))
				.post();
		
		List<Evento> resultados = new ArrayList<Evento>();
	
		for(Element row : document.select("table table tr table tr[height]:not([align])")) {
			String 	codigoEvento = row.select("td").get(0).select("span").get(0).text();
			String 	nombre 		= row.select("td").get(2).select("span").get(0).text();
			String 	fecha 		= row.select("td").get(3).select("span").get(0).text();
			String 	hora 		= row.select("td").get(4).select("span").get(0).text();
			String 	lugar 		= row.select("td").get(6).select("span").get(0).text();
			int 	duracion	= Integer.parseInt(row.select("td").get(5).select("span").get(0).text());
			int 	seccion		= Integer.parseInt(row.select("td").get(1).select("span").get(0).text());
			
			resultados.add(new Evento(codigoEvento+"-"+seccion+"-evFin",nombre,fecha,hora,duracion,lugar));
		}
	
		return resultados;
	}
}
