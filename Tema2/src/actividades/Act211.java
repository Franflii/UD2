package actividades;

import java.util.Scanner;

public class Act211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Introduce un numerode 3 cifras: ");
		int numero= sca.nextInt();
		
		if (numero <0 || numero > 999) {
			System.out.println("Introduce un numero de 3 cifras");
		}
		else {
			int unidades = numero % 10; // para sacar el resto del primer numero
			int decenas = (numero / 10) % 10; // para sacar el segundo numero 
			int centenas = numero / 100; // para sacar el ultimo numero del numero introducido
		
		if (unidades == centenas){
			System.out.println("El numero es capicuo");
		
		}
		else {
			System.out.println("El número no es capicuo");
		}
			
		}
				
		
		
		
	}

}
