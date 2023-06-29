package com;

import java.util.Scanner;

public class Ejercicio11_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Una compañía de transporte internacional tiene servicio en algunos 
		países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por 
		servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida.*/
		
		int zona;
		int precio;
		int kilos;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Introduzca la zona a enviar el paquete, número del 1 al 5");
		
		zona=entrada.nextInt();
		
		System.out.println("Introduzca el peso del paquete");
		
		kilos=entrada.nextInt();
		
		switch (zona) {
		case 1:
			precio=kilos*24000;
			System.out.println("El total a pagar es: "+precio+" euros");
			break;
		case 2:
			precio=kilos*20000;
			System.out.println("El total a pagar es: "+precio+" euros");
			break;
		case 3:
			precio=kilos*21000;
			System.out.println("El total a pagar es: "+precio+" euros");
			break;
		case 4:
			precio=kilos*10000;
			System.out.println("El total a pagar es: "+precio+" euros");
			break;
		case 5:
			precio=kilos*18000;
			System.out.println("El total a pagar es: "+precio+" euros");
			break;

		default:
			System.out.println("Zona invalida");
			break;
		}

	}

}
