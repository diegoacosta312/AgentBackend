package crawlers;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import mundo.Correo;

public class Directorio {
	private static String URL_DIRECTORY = "https://directorio.uniandes.edu.co/index.php";
	
	private String phpSessionId, jSessionId;
	private String domain;
	
	public Directorio(String domain) {
		this.domain = domain;
	}
	
	
	public void login(String usuario, String password) throws IOException {		
		Connection.Response get = Jsoup.connect(URL_DIRECTORY)
				.method(Connection.Method.GET)
				.userAgent("Chrome/58.0.3029.81")
				.execute();
		
		phpSessionId = get.cookie("PHPSESSID");
		
		Connection.Response response = Jsoup.connect(URL_DIRECTORY)
				.method(Connection.Method.POST)
				.userAgent("Chrome/58.0.3029.81")
				.cookie("PHPSESSID", phpSessionId)
				.data("login", usuario, "password", password)
				.execute();
	}
	
	public List<Correo> buscar(String busqueda) throws IOException, ParseException, Exception {
		Document document = Jsoup.connect(URL_DIRECTORY)
				.userAgent("Chrome/58.0.3029.81")
				.cookie("PHPSESSID", phpSessionId)
				.data("criterio", busqueda)
				.post();
		
		List<Correo> resultados = new ArrayList<>();
	
		for(Element row : document.select("tr.par")) {
			String nombre = row.select("td").get(0).select("span > a").get(0).text();
			String mail = row.select("td").get(1).select("span > a").get(0).text();
			
			resultados.add(new Correo(mail, domain, nombre));
		}
	
		return resultados;
	}
}
