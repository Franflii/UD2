package actividades;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner igual = new Scanner(System.in);
		
		System.out.println("Dime el primer número entero: ");
		int num1 = igual.nextInt();
		
		System.out.println("Dime el segundo número entero: ");
		int num2 = igual.nextInt();
		
		if(num1>num2) {
			
			System.out.println("El mayor es: " + num1);
		}else {
			System.out.println("El mayor es: " + num2);
		}
	}



	}

