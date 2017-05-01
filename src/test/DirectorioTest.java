package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import crawlers.Directorio;
import mundo.Correo;

public class DirectorioTest {
	private static Directorio directorio;
	private static String domain, usuario, password, busqueda;
	private static Correo correo;

	@BeforeClass public static void setUpBeforeClass() throws Exception {
		domain = "uniandes\\.edu\\.co";
		correo = new Correo("j.alban@uniandes.edu.co", domain);
		usuario = "username";
		password = "password";
		busqueda = "busqueda";
		directorio = new Directorio(domain);
	}

	@Test public void testLogin() {
		try {
			directorio.login(usuario, password);
		} catch (Exception exception) {
			fail(exception.toString());
		}
	}

	@Test public void testBuscar() {
		try {
			List<Correo> resultados = directorio.buscar(busqueda);
			assert(resultados.size() == 9);
		} catch (Exception exception) {
			fail(exception.toString());
		}
	}

	

}
