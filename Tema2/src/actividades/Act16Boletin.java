package actividades;

import java.util.Scanner;

public class Act16Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero entre el 30-99: ");
		int num = sc.nextInt();
		
		int decenas = num / 10;
		int unidades = num % 10;
		
		if (num >=30 && num <=99) {
			switch (decenas) {
			case 3:
				System.out.println("Treinta");
				break;
			
			case 4:
				System.out.println("Cuarenta");
				break;
			case 5:
				System.out.println("Cincuenta");
				break;
			case 6:
				System.out.println("Sesenta");
				break;
			case 7:
				System.out.println("Setenta");
				break;
			case 8:
				System.out.println("Ochenta");
				break;
			case 9:
				System.out.println("Noventa");
				break;
			
			
			}
			switch (unidades) {
			case 1:
				System.out.println(" y uno");
				break;
			case 2:
				System.out.println(" y dos");
				break;
			case 3:
				System.out.println(" y tres");
				break;
			
			case 4:
				System.out.println("y cuatro");
				break;
			case 5:
				System.out.println("y cinco");
				break;
			case 6:
				System.out.println("y seis");
				break;
			case 7:
				System.out.println(" y siete");
				break;
			case 8:
				System.out.println("y ocho");
				break;
			case 9:
				System.out.println("y nueve");
				break;
			}
		}
		else {
			System.out.println("Dime un numero valido");
		}
		

	}

}
