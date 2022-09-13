package Excepcion;

public class ForaRang extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor Excepcio
	 */
	public ForaRang () {
		//missatge que saltar� quan utilitzaem el catch
		super("El numero esta fuera del rango que se pide por lo tanto salta excepcion");
	}

}