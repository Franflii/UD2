package actividades;

import java.util.Scanner;

public class ActPag29If {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Inserta el primer numero: ");
		int numero1 = sca.nextInt();
		
		System.out.println("Inserta el segundo numero: ");
		int numero2 = sca.nextInt();
		
		System.out.println("Ingresar operador (-, +, *, /: ");
		String operador = sca.next();
		
		if (operador.equals("+")) {
			System.out.println(numero1 + numero2);
		}
		else if (operador.equals("-")) {
			System.out.println(numero1 - numero2);
		}
		else if (operador.equals("*")) {
			System.out.println(numero1 * numero2);
		}
		else if (operador.equals("/")) {
			System.out.println(numero1 / numero2);
		}
		else {
			System.out.println("Operación no permitida");
		}
				

	}

}
