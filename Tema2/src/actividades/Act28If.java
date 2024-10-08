package actividades;

import java.util.Scanner;

public class Act28If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una nota entera entre 0 y 10: ");
		int nota = sca.nextInt();
		
		if (nota >=0 && nota <5){
			System.out.println("Es insuficiente");
		}else if (nota >= 5 && nota <6) {
			System.out.println("Suficiente");
		
		}else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
			
		}else if (nota >= 7 && nota <9) {
			System.out.println("Notable");
			
		}else if (nota >=9 && nota <=10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.printf("Introduce una nota valida entre (0-10)");
		}
	}

}
