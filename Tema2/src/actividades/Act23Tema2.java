package actividades;

import java.util.Scanner;

public class Act23Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el número de alumnos que irán al viaje: ");
	        int numeroAlumnos = scanner.nextInt();

	        double costoPorAlumno = 0;
	        double pagoTotal = 0;

	        if (numeroAlumnos >= 100) {
	            costoPorAlumno = 65;
	            pagoTotal = numeroAlumnos * costoPorAlumno;
	        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
	            costoPorAlumno = 70;
	            pagoTotal = numeroAlumnos * costoPorAlumno;
	        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
	            costoPorAlumno = 95;
	            pagoTotal = numeroAlumnos * costoPorAlumno;
	        } else {
	            costoPorAlumno = 4000.0 / numeroAlumnos;
	            pagoTotal = 4000;  
	        }

	        System.out.println("Cada alumno debe pagar: " + costoPorAlumno + " euros.");
	        System.out.println("El total a pagar a la compañía es: " + pagoTotal + " euros.");
	    }
	

	}


