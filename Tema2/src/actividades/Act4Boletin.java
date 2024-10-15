package actividades;

import java.util.Scanner;

public class Act4Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nota (0-10): ");
		double nota = sc.nextDouble();
		
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Matrícula (S/P): ");
		String matricula = sc.next();
		
		if (nota >= 5 && edad >=18 && matricula.equalsIgnoreCase("S")) {
			System.out.println("ACEPTADA");
		}
		else if (nota >= 5 && edad >=18 && matricula.equalsIgnoreCase("P")) {
			System.out.println("POSIBLE");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
	}

}
