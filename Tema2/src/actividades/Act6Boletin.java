package actividades;

import java.util.Scanner;

public class Act6Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Dime el valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Dime el valor de C: ");
		int c = sc.nextInt();
		
		
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			System.out.println("Es un triángulo rectángulo");
		}
		else if (Math.pow(b, 2) + Math.pow(a, 2) == Math.pow(c, 2)) {
			System.out.println("Es un triángulo rectángulo");
			
		}
		else if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
			System.out.println("Es un triángulo rectángulo");
		}
		else if (a == b && a != c) {
			System.out.println("Es un triángulo isoceles");
		}
		else if (a == c && a != b) {
			System.out.println("Es un triángulo isoceles");
		}
		else if (c == b && c != a) {
			System.out.println("Es un triángulo isoceles");
		}
		else if (a == b && a == c) {
			System.out.println("Es un triángulo equilátero");
		}
		else {
			System.out.println("Es un triángulo escaleno");
		}
		
	}

}
