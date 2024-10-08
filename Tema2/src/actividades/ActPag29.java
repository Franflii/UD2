package actividades;

import java.util.Scanner;

public class ActPag29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Inserta el primer numero: ");
		double numero1 = sca.nextDouble();
		
		System.out.println("Insertar el segundo numero: ");
		double numero2 = sca.nextDouble();
		
		System.out.println("Ingresar operador (-, +, *, /: ");
		String operador = sca.next();
		
		
		double resultado;
		
		switch(operador) {
		
		case "+":
			resultado = numero1 + numero2;
			System.out.println("Resultado: " + resultado);
			break;
			
		case "-":
			resultado = numero1 - numero2;
			System.out.println("Resultado: " + resultado);
			break;
			
		case "*":
			resultado = numero1 * numero2;
			System.out.println("Resultado: " + resultado);
			break;
			
		case "/":
			resultado = numero1 / numero2;
			System.out.println("Resultado: " + resultado);
			break;
		
		default:
			System.out.println("Operacion no permitida");
		}
		

	}

}
