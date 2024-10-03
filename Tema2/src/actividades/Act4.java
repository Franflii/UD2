package actividades;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner igual = new Scanner(System.in);
		
		System.out.println("Dime el primer número entero: ");
		int num1 = igual.nextInt();
		
		System.out.println("Dime el segundo número entero: ");
		int num2 = igual.nextInt();
		
		if(num1==num2) {
			
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}

}
