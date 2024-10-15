package actividades;

import java.util.Scanner;

public class Act7Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un año: ");
		int year = sc.nextInt();
		
		
		if (year % 4 == 0) {
			System.out.println("Es un año bisiesto");
		}
		else if (year % 100 !=0) {
			System.out.println("No es un año bisiesto");
		}
		else if (year % 400 == 0) {
			System.out.println("Es un año biciesto");
		}
		else {
			System.out.println("No has introducido un año valido");
		}
	}

}
