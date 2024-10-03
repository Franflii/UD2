package actividades;

import java.util.Scanner;

public class Act7Pag20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		int a = sca.nextInt();
		
		if (a < 10) {
			System.out.println("El numero tiene 1 cifra");
			
		}
		else if(a < 100) {
			System.out.println("El numero tiene 2 cifras");
		}
		else if(a < 1000) {
			System.out.println("El numero tiene 3 cifras");
		}
		else if(a < 10000) {
			System.out.println("El numero tiene 4 cifras");
		}
		else {
			System.out.println("El numero tiene 5 cifras o más.");
		}

	}

}
