package com;

import java.util.Scanner;

public class Ejercicio11_EAGG {

	public static void main(String[] args) {
		// 11. Una compañía de transporte internacional tiene servicio en algunos países
		// de América del Norte, América Central, América del Sur, Europa y Asia. 
		// El costo por servicio de transporte se basa en el peso del paquete y la zona
		// a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		// Parte de su política implica que los paquetes con un peso superior a 5kg
		// no son transportados, por cuestiones de logística y seguridad. 
		// Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,
		// en su caso, el rechazo de la entrega.

		
		Scanner entrada = new Scanner(System.in);
		
		double peso; 
		int zona;
						
		System.out.println("Introduce con número, a qué zona te gustaría enviar tu paquete, 1= América del Norte, 2= América Central, 3= América del Sur, 4= Europa y 5=Asia");
		zona = entrada.nextInt();
				
		System.out.println("Introduce el peso en kg de tu paquete");
		peso = entrada.nextDouble();
		
					
		if (peso > 5) {
			System.out.println("No pueden ser transportados por cuestión de logística y seguridad");
				} else {
				
				switch (zona) {
					
				case 1:
				System.out.println("El costo por servicio de transporte de América del Norte es de " + (24 * peso) + " euros");
				break;
				
				case 2:
				System.out.println ("El costo por servicio de transporte de América Central es de " + (20 * peso) + " euros");
				break;

				case 3:
					System.out.println ("El costo por servicio de transporte de América del Sur es de " + (21 * peso) + " euros");
					break;
					
				case 4:
					System.out.println ("El costo por servicio de transporte de Europa es de " + (10 * peso) + " euros");
					break;
				
				case 5:
					System.out.println ("El costo por servicio de transporte de Asia es de " + (18 * peso) + " euros");
					break;
				
				default:
					System.out.println("Desconocido");
					break;
				}
		
		
		}
	}
}