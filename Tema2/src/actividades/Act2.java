package actividades;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner multiplo = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int num1 = multiplo.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		int num2 = multiplo.nextInt();
		
		boolean esMultiplo = num1 % num2 ==0;
		
		System.out.println(esMultiplo);

	}

}
