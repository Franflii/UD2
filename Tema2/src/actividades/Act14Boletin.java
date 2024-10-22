package actividades;

import java.util.Scanner;

public class Act14Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el pais del 1-5: ");
		int pais = sc.nextInt();
		
		System.out.println("Dime el peso en gramos: ");
		int peso = sc.nextInt();
		
		double kilos = peso/1000.0;
		if (kilos<=5) {
			switch(pais) {
			case 1:
				kilos = kilos*24;
				System.out.println("El precio de america del norte es" + kilos);
				break;
			case 2:
				kilos = kilos*20;
				System.out.println("El precio de america del norte es" + kilos);
				break;
			case 3:
				kilos = kilos*21;
				System.out.println("El precio de america del norte es" + kilos);
				break;
			case 4:
				kilos = kilos*10;
				System.out.println("El precio de america del norte es" + kilos);
				break;
			case 5:
				kilos = kilos*18;
				System.out.println("El precio de america del norte es" + kilos);
				break;
				
				default:
					break;
			}
		}
		else {
			System.out.println("No se transportan mas de 5 kilos");
		}

	}

}
