package com;

import java.util.Scanner;

public class Ejercicio8_YAAH {
	public static void main(String[]args) {
		// 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
//		�ERROR: n�mero incorrecto�.
		
//		int resultado = 6;
		int numero;
		
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduzca un n�mero del 1 al 6: ");
		numero = intro.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("N�mero opuesto: Seis");
			break;
		case 2:
			System.out.println("N�mero opuesto: Cinco");
			break;
		case 3:
			System.out.println("N�mero opuesto: Cuatro");
			break;
		case 4:
			System.out.println("N�mero opuesto: Tres");
			break;
		case 5:
			System.out.println("N�mero opuesto: Dos");
			break;
		case 6:
			System.out.println("N�mero opuesto: Uno");
			break;
		default:
			System.out.println("Error: n�mero incorrecto");
			break;
		}
		
		
		
	}
}
