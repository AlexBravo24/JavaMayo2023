package com;

import java.util.Scanner;

public class Ejercicio8_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 8: 
		 * Realiza un programa que pida por teclado el resultado (dato entero)
		 *  obtenido al lanzar un dado de seis caras y muestre por pantalla el 
		 *  número en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		 *  Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		 *  Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
		 *  se mostrará el mensaje: “ERROR: número incorrecto”.
		 * */
		
		int res;
		Scanner e = new Scanner(System.in);
		System.out.println("Indica el resultado de lanzar un dado al azar: ");
		res = e.nextInt();


			switch (res) {
			case 1:
				System.out.println("El numero contrario es: SEIS");
				break;
			case 2:
				System.out.println("El numero contrario es: CINCO");
				break;
			case 3:
				System.out.println("El numero contrario es: CUATRO");
				break;
			case 4:
				System.out.println("El numero contrario es: TRES");
				break;
			case 5:
				System.out.println("El numero contrario es: DOS");
				break;
			case 6:
				System.out.println("El numero contrario es: UNO");
				break;
			default:
				System.out.println("ERROR: número incorrecto");
			}
			
		
	}

}
