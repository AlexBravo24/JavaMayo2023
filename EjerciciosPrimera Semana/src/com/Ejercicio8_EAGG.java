package com;

import java.util.Scanner;

public class Ejercicio8_EAGG {

	public static void main(String[] args) {
		// 8. Realiza un programa que pida por teclado el resultado (dato entero)
		// obtenido al lanzar un dado de seis caras y muestre por pantalla el
		// número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		// Nota 1: En las caras opuestas de un dado de seis caras están los números:
		// 1-6, 2-5 y 3-4. 
		// Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
		// se mostrará el mensaje: “ERROR: número incorrecto”.

	int resultado;
	Scanner entrada1= new Scanner(System.in);
	
	System.out.println("Indica el resultado al lanzar un dado al azar:");
	resultado=entrada1.nextInt();
	
	switch (resultado) {
	case 1:
		System.out.println("El número contrario es: SEIS");
		break;
	case 2:
		System.out.println("El número contrario es: CINCO");
		break;
	case 3:
		System.out.println("El número contrario es: CUATRO");
		break;
	case 4:
		System.out.println("El número contrario es: TRES");
		break;
	case 5:
		System.out.println("El número contrario es: DOS");
		break;
	case 6:
		System.out.println("El número contrario es: UNO");
		break;
	default:
		System.out.println("ERROR: Número incorrecto");
	
	}
		
	
		
	}

}
