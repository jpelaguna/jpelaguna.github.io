package escj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioDos {

	// Defina 2 variables de tipo entero para describir las longitudes de los lados 
	// de un rect�ngulo. El programa debe calcular y mostrar las longitudes de 
	// los lados, el per�metro y el �rea del rect�ngulo.
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ancho: ");
		int ancho = sc.nextInt();
		System.out.println("Alto: ");
		int alto = sc.nextInt();
		int perimetro = (ancho * 2) + (alto * 2);
		int area = (ancho * alto);
		System.out.println("Ancho: " + ancho);
		System.out.println("Alto: " + alto);
		System.out.println("Per�metro:" + perimetro);
		System.out.println("�rea:" + area);

		sc.close();
	}

}