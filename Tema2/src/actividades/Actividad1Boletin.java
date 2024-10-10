package actividades;

import java.util.Scanner;

public class Actividad1Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		if (num2 > 0) {
			double division =num1 / num2;
			System.out.println("El resultado de la división es: " + division);
		}
		else {
			System.out.println("Escribe un número distinto de 0 ");
		}
			
		

	}

}
