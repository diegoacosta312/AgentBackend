package crawlers;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Horario 
{

	/**
	 * Página web de la que se recibe información.
	 */
	private static String URL_DIRECTORY = "https://directorio.uniandes.edu.co/index.php";

	public static void main(String[] args) throws Exception 
	{
		Connection.Response initial = Jsoup.connect("http://mibanner.uniandes.edu.co/")
				.method(Connection.Method.GET).execute();

		Connection.Response login = Jsoup.connect("http://mibanner.uniandes.edu.co/")
				.data("UserID", "jf.castaneda", "PIN", "clave")
				.cookies(initial.cookies())
				.method(Method.POST)
				.execute();

		String sessionId = login.cookie("SESSID");

		Document page = Jsoup.connect("https://mibanner.uniandes.edu.co/pls/prod/bwskfshd.P_CrseSchdDetl")
				.cookie("SESSID", sessionId) //use this with any page you parse. it will log you in
				.get();

		for (Element row : page.select("div.pagebodydiv")) 
		{  
			final String ddlabel = row.text();
			System.out.println(ddlabel);
		}
	}

}


