package actividades;

import java.util.Scanner;

public class Actividad2Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un nombre de usuario: ");
		String usuario = sc.next();
		
		System.out.println("Escribe una contraseña para el usuario introducido: ");
		String contrasena = sc.next();
		
		if (usuario.equals("vladi")) {
					
			 if (contrasena.equals("daw")) {
				System.out.println("Has entrado al sistema");
		}
	
		}
		else {
			System.out.println("Las credenciales no son correctas");
		}
	}

}
