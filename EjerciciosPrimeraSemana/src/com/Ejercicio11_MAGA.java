package com;

import java.util.Scanner;

public class Ejercicio11_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 11: 
		 * Una compañía de transporte internacional tiene servicio en algunos países 
		 * de América del Norte, América Central, América del Sur, Europa y Asia. 
		 * El costo por servicio de transporte se basa en el peso del paquete 
		 * y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * */
		
		int peso, zona;
		Scanner e = new Scanner(System.in);
		
		System.out.println("Costo por servicio de transporte");
		System.out.println("--------------------------------");
		System.out.println("Zonas de envio");
		System.out.println("--------------------------------");
		System.out.println("1. America del Norte");
		System.out.println("2. America Central");
		System.out.println("3. America del Sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		System.out.println("Selecciona una zona de envio: ");
		zona = e.nextInt();
		System.out.println("Indica el peso de tu paquete: ");
		peso = e.nextInt();
		if (zona > 0 && zona < 6) {
			if (peso < 6) {
				switch ( zona ) {
				case 1:
					System.out.println("El precio del envio es de: " + (peso * 24));
					break;
				case 2:
					System.out.println("El precio del envio es de: " + (peso * 20));
					break;
				case 3:
					System.out.println("El precio del envio es de: " + (peso * 21));
					break;
				case 4:
					System.out.println("El precio del envio es de: " + (peso * 10));
					break;
				case 5:
					System.out.println("El precio del envio es de: " + (peso * 18));
					break;
				}
			}else {
				System.out.println("ERROR: su paquete no puede ser procesado");
			}
		}else {
			System.out.println("ERROR: zona incorrecta");
		}
	}

}
