package Sentencias;

public class SentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes=7;
		String estacion;
		
		if (mes==3) {
			estacion = "Primavera";
			System.out.println("El mes es: "+mes+" La estacion es: "+estacion);
		}else if (mes==7) {
			estacion = "Invierno";
			System.out.println("El mes es: "+mes+" La estacion es: "+estacion);
		}else {
			System.out.println("El mes es incorrecto");
		}

	}

}
