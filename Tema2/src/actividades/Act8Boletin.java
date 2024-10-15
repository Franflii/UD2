package actividades;

import java.util.Scanner;

public class Act8Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ac=new Scanner(System.in);

		System.out.println("Dime un dia:");

		int dia =ac.nextInt();

		System.out.println("Dime un mes:");

		int mes =ac.nextInt();

		System.out.println("Dime un año:");

		int ano =ac.nextInt();

		switch (mes) {

		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:

			if (dia>=1&&dia<=31) {

				System.out.println("El dia es valido");

			}else {

				System.out.println("El dia no es valido este mes tien 31 dias");

			}

			break;

		case 4:

		case 6:

		case 9:

		case 11:

			if (dia>=1&&dia<=30) {

				System.out.println("El dia es valido");

			}else {

				System.out.println("El dia no es valido este mes tien 30 dias");

			}

			break;

		case 2:

			if ((ano%4==0)&&(ano%100!=0)||(ano%400==0&&ano%100==0)&&(dia>=1&&dia<=29)) {

				System.out.println("El dia es valido");

				 				

			}else

				System.out.println("Ese año no es bisiesto febrero no puede tener 29 dias");



				if (dia>=1&&dia<=28) {

				System.out.println("El dia es valido");

			}

			break;

		default:

			System.out.println("El mes no es valido");

			break;

		}



	}



}