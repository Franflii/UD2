package actividades;

import java.util.Scanner;

public class Act5Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el valor de x1: ");
		int x1 = sc.nextInt();
		
		System.out.println("Dime el valor de y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Dime el valor de x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Dime el valor de y2: ");
		int y2 = sc.nextInt();
		
		System.out.println("Dime el valor de r1: ");
		int r1 = sc.nextInt();
		
		System.out.println("Dime el valor de r2: ");
		int r2 = sc.nextInt();
		
		double xyCuadrado = Math.pow((x1-y1),2);
		double xy2Cuadrado = Math.pow((x2-y2),2);
		
		
		
		double distancia = Math.sqrt(xyCuadrado + xy2Cuadrado);
		
		if(distancia>r1+r2) {
			System.out.println("Exteriores");
		}
		else if (distancia == r1+r2) {
			System.out.println("Tangentes exteriores");
		}
		else if (distancia < r1+r2 && distancia>(Math.abs(r1-r2))) {
			System.out.println("Secantes");
		}
		else if (distancia == (Math.abs(r1-r2))) {
			System.out.println("Tangentes interiores");
		}
		else if (distancia>0 && distancia<(Math.abs(r1-r2))) {
			System.out.println("Interiores");
		}
		else if (distancia == 0) {
			System.out.println("Concéntricas");
		}
		else {
			System.out.println("Los datos no son validos");
		}
	}

}
