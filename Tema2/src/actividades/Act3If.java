package actividades;

import java.util.Scanner;

public class Act3If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		
		System.out.println("Dime un número:");
		int num1 = numero.nextInt();
		
		String resultado="Es impar";
		
		if (num1 % 2 ==0) {
			resultado="Es par";
			System.out.println("El número es par");
		
		}
		
			System.out.println(resultado);
	}

}
