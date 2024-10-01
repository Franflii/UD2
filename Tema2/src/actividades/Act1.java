package actividades;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Dime el primer número entero: ");
		int num1 = numeros.nextInt();
		
		System.out.println("Dime el segundo número entero: ");
		int num2 = numeros.nextInt();
		
		
		boolean comprobar = (num1 != num2) || (num1== 0 || num2==0);
		
		System.out.println("El numero es: " + comprobar);
		
	}

}
 