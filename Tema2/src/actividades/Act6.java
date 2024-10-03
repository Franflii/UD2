package actividades;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime el primer numero: ");
		int num1 = sca.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		int num2 = sca.nextInt();
		
		System.out.println("Dime el tercer numero: ");
		int num3 = sca.nextInt();
		
		if (num1>num2 && num1>num3) {
			if (num2>num3) {
				System.out.printf("%d > %d > %d",num1,num2,num3);
			}else {
				System.out.printf("%d > %d > %d",num1,num3,num2);
			
			}
			//B es el mayor
		}
		else if(num2>num1 && num2>num3) {
			if (num1>num3) {
				System.out.printf("%d > %d > %d",num2,num1,num3);
			}else {
				System.out.printf("%d > %d > %d",num2,num3,num1);
			}
		}//NUM3 ES EL MAYOR
		else if(num3>num1 && num3>num2) {
			if (num1>num2) {
				System.out.printf("%d > %d > %d",num3,num1,num2);
			}else {
				System.out.printf("%d > %d > %d",num3,num2,num1);
			}
		}
				
				
			}
			
		
			
			
		
			
	}


