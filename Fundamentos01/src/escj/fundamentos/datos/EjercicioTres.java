package escj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioTres {

	// Pedir el radio de un c�rculo y calcular su �rea y su longitud
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca el radio del c�rculo: ");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("Area: " + area);
		System.out.println("Longitud: " + longitud);
		
		sc.close();
	}

}
