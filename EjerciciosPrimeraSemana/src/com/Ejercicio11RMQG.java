package com;
import java.util.Scanner;
public class Ejercicio11RMQG {
	    public static void main(String[] args) {
	    	
			/* Una compañía de transporte internacional tiene servicio en algunos países de
			 * América del Norte, América Central, América del Sur, Europa y Asia. El costo
			 * por servicio de transporte se basa en el peso del paquete yla zona a la que
			 * va dirigida. Lo anterior se muestra en la siguiente tabla: ZONA UBICACIÓN -
			 * COSTO/KILOGRAMO 1 América del Norte - 24,00 euros 2 América Central - 20, 00
			 * euros 3 América del Sur - 21,00 euros 4 Europa - 10,00 euros 5 Asia - 18,00
			 * euros Parte de su política implica que los paquetes con un peso superior a
			 * 5kg no son transportados, por cuestiones de logística y seguridad. Realiza un
			 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
			 * caso, el rechazo de la entrega.
			 */
	        Scanner scanner = new Scanner(System.in);
	        int zona;
	        double peso;
	        double costo;

	        System.out.print("Ingresa la zona a la que va dirigido el paquete (1-5): ");
	        zona = scanner.nextInt();

	        System.out.print("Ingresa el peso del paquete en kilogramos: ");
	        peso = scanner.nextDouble();
	        scanner.close();

	        if (peso > 5) {
	            System.out.println("Lo siento, no transportamos paquetes con un peso superior a 5 kg.");
	            return;
	        }

	        switch (zona) {
	            case 1:
	                costo = peso * 24.00;
	                break;
	            case 2:
	                costo = peso * 20.00;
	                break;
	            case 3:
	                costo = peso * 21.00;
	                break;
	            case 4:
	                costo = peso * 10.00;
	                break;
	            case 5:
	                costo = peso * 18.00;
	                break;
	            default:
	                System.out.println("ERROR: zona fuera de cobertura");
	                return;
	        }

	        System.out.println("El costo por la entrega del paquete es de " + costo + " euros.");
	    }
}	
