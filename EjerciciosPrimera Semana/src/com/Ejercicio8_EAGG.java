package com;

import java.util.Scanner;

public class Ejercicio8_EAGG {

	public static void main(String[] args) {
		// 8. Realiza un programa que pida por teclado el resultado (dato entero)
		// obtenido al lanzar un dado de seis caras y muestre por pantalla el
		// n�mero en letras (dato cadena) de la cara opuesta al resultado obtenido.
		// Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros:
		// 1-6, 2-5 y 3-4. 
		// Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, 
		// se mostrar� el mensaje: �ERROR: n�mero incorrecto�.

	int resultado;
	Scanner entrada1= new Scanner(System.in);
	
	System.out.println("Indica el resultado al lanzar un dado al azar:");
	resultado=entrada1.nextInt();
	
	switch (resultado) {
	case 1:
		System.out.println("El n�mero contrario es: SEIS");
		break;
	case 2:
		System.out.println("El n�mero contrario es: CINCO");
		break;
	case 3:
		System.out.println("El n�mero contrario es: CUATRO");
		break;
	case 4:
		System.out.println("El n�mero contrario es: TRES");
		break;
	case 5:
		System.out.println("El n�mero contrario es: DOS");
		break;
	case 6:
		System.out.println("El n�mero contrario es: UNO");
		break;
	default:
		System.out.println("ERROR: N�mero incorrecto");
	
	}
		
	
		
	}

}
