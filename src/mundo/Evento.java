package mundo;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;

public class Evento {
	
	public Evento(String codigoEvento, String nombreID, String fecha, String hora, int duracion, String lugar){
		ID = codigoEvento;
		nombre = nombreID;
		horaInicio = convertirHora(hora);		
		fechaEvento = convertirFecha(fecha);
		/**
		 * convierte la duracion a un tipo Duration de java.time
		 */
		
		
	};

	private String	 	ID;
	private String 		nombre;
	private LocalTime	horaInicio;
	private LocalDate 	fechaEvento;
	private Duration	duracion;
	private String 		lugar;

	
	/**
	 * Convierte el string en una fecha valida en formato DATE.
	 */	
	public LocalDate convertirFecha(String fechaIngresada){
		try{
			String string = fechaIngresada;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyyyyy", new Locale("es","CO"));
			LocalDate date = LocalDate.parse(string, formatter);
			String fecha = date.toString();
			System.out.println(fecha);
			return date;
		}catch (DateTimeException exc) {
		    System.out.printf("%s no puede ser formateado!%n", fechaIngresada);
		    throw exc;
		}
	}

	/**
	 * 
	 */
	public LocalTime convertirHora(String hora) {
		// TODO Auto-generated method stub
		try{
			String string = hora;
			LocalTime t = LocalTime.parse(string, DateTimeFormatter.ofPattern("H:m"));
			return t;
		} catch (DateTimeException exc) {
			System.out.printf("%s no puede ser formateado! %n", hora);
			return null;
		}
	}
	
	public LocalTime darHoraFin(Date horaInicio, Duration duracion){
		try{
			LocalTime horaFin = (LocalTime) duracion.addTo((Temporal)horaInicio);
			return horaFin;	
		} catch (DateTimeException exc){
			System.out.printf("%s no puede ser formateado! %n"+ horaInicio);
			return null;
		}
	}
}



