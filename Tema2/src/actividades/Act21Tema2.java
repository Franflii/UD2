package actividades;

import java.util.Scanner;

public class Act21Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Introduce el tipo de uva (A o B): ");
        char tipoUva = scanner.next().toUpperCase().charAt(0);

        System.out.print("Introduce el tamaño de la uva (1 o 2): ");
        int tamañoUva = scanner.nextInt();

        System.out.print("Introduce la cantidad de kilos entregados: ");
        double kilos = scanner.nextDouble();

        
        double precioFinal = precioInicial;

        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                precioFinal += 0.20;  
            } else if (tamañoUva == 2) {
                precioFinal += 0.30;  
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                precioFinal -= 0.30;  
            } else if (tamañoUva == 2) {
                precioFinal -= 0.50;  
            }
        } else {
            System.out.println("Tipo de uva no válido.");
        }

        double ganancia = precioFinal * kilos;

        // Mostrar el resultado
        System.out.println("El productor recibirá: " + ganancia + " euros por el embarque de uva.");
    }


	}


