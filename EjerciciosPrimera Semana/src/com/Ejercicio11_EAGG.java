package com;

import java.util.Scanner;

public class Ejercicio11_EAGG {

	public static void main(String[] args) {
		// 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses
		// de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. 
		// El costo por servicio de transporte se basa en el peso del paquete y la zona
		// a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		// Parte de su pol�tica implica que los paquetes con un peso superior a 5kg
		// no son transportados, por cuestiones de log�stica y seguridad. 
		// Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,
		// en su caso, el rechazo de la entrega.

		
		Scanner entrada = new Scanner(System.in);
		
		double peso; 
		int zona;
						
		System.out.println("Introduce con n�mero, a qu� zona te gustar�a enviar tu paquete, 1= Am�rica del Norte, 2= Am�rica Central, 3= Am�rica del Sur, 4= Europa y 5=Asia");
		zona = entrada.nextInt();
				
		System.out.println("Introduce el peso en kg de tu paquete");
		peso = entrada.nextDouble();
		
					
		if (peso > 5) {
			System.out.println("No pueden ser transportados por cuesti�n de log�stica y seguridad");
				} else {
				
				switch (zona) {
					
				case 1:
				System.out.println("El costo por servicio de transporte de Am�rica del Norte es de " + (24 * peso) + " euros");
				break;
				
				case 2:
				System.out.println ("El costo por servicio de transporte de Am�rica Central es de " + (20 * peso) + " euros");
				break;

				case 3:
					System.out.println ("El costo por servicio de transporte de Am�rica del Sur es de " + (21 * peso) + " euros");
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