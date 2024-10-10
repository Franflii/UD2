package actividades;

import java.util.Scanner;

public class Actividades3Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una letra: ");
		String letra = sc.next();
		
		if (letra.length() !=1) {
			System.out.println("No has introducido una letra");
		}
		else if (letra.equals(letra.toUpperCase())) {
			System.out.println("Es una letra mayuscula");
			
		}
		else {
			System.out.println("Es una letra minúscula");
		}
	}

}
