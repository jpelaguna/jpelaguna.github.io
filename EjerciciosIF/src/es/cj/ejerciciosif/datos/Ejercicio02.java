package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Pedir al usuario dia, mes y a�o y comprobar que la fecha es correcta incluidos bisiestos.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca el d�a");
		int dia = sc.nextInt();
		System.out.println("Introduzca el mes");
		int mes = sc.nextInt();
		System.out.println("Introduzca el a�o");
		int anio = sc.nextInt();
		
		if (anio >= 0)
			if (mes >= 1 && mes <= 12)
				if (dia >=1 && <= 30)
		
	}

}
