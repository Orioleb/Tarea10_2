package Aplicacion;



import Excepcion.ForaRang;

public class Main {
	

	public static void main(String[] args) {
		try {
			int numero=16; //Asignamos 16 para forzae excepcion
			System.out.println("Queremos un numero del 1 al 15 en la variable opcio. Le asignaremos el 16 para que salte la opción de fuera del rango");
			if((numero<1)||(numero>15)) {
				throw new ForaRang();
			}
			} catch(ForaRang e) {
				System.out.println(e);
				
			}finally {
				System.out.println("Programa terminado");
	}

	}

}
