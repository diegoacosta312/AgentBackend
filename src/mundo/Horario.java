package mundo;

public class Horario 
{

	/**
	 * Días en los que se dicta la materia.
	 */
	private String dias;

	/**
	 * Rango de hora en que se dicta la materia.
	 */
	private String hora;

	/**
	 * Rango de fecha en que se dicta la materia.
	 */
	private String fecha;

	/**
	 * Constructor del horario
	 * @param pDias Días en los que se dicta la materia según banner.
	 * @param pHora Rango de hora en que se dicta la materia según banner.
	 * @param pFecha Rango de fecha en que se dicta la materia según banner.
	 */
	public Horario(String pDias, String pHora, String pFecha)
	{
		dias = pDias;
		hora = pHora;
		fecha = pFecha;
	}

	/**
	 * Método que retorna los días en los que se dicta la materia.
	 * @return Días en los que se dicta la materia.
	 */
	public String darDias()
	{
		return dias;
	}

	/**
	 * Método que retorna el rango de hora en que se dicta la materia.
	 * @return Rango de hora en que se dicta la materia.
	 */
	public String darHora()
	{
		return hora;
	}

	/**
	 * Método que retorna el rango de fecha en que se dicta la materia.
	 * @return Rango de fecha en que se dicta la materia.
	 */
	public String darFecha()
	{
		return fecha;
	}

}
