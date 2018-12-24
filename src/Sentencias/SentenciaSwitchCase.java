package Sentencias;

public class SentenciaSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes=7;
		String estacion;
		switch(mes) {
		case 5:
			estacion="Invierno";
			System.out.println("El mes es: "+mes+" La estacion es: "+estacion);
			break;
		case 7:
			estacion="Primavera";
			System.out.println("El mes es: "+mes+" La estacion es: "+estacion);
			break;
			
			default: System.out.println("No existe ese dato");
		}		
	}
}