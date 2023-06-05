package com;

import java.util.Scanner;

public class Ejercicio8_EIMD {

	public static void main(String[] args) {
		/*
		 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al 
		 lanzar un dado de
seis caras y muestre por pantalla 
el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
“ERROR: número incorrecto”.
		 */
		
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime en numero la cara del dado");
		numero=sc.nextInt();
	switch (numero) {
	case 1:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Seis");
		break;
	case 2:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Cinco");
		break;
	case 3:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Cuatro");
		break;
	case 4:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Tres");
		break;
	case 5:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Dos");
		break;
	case 6:
		System.out.println("El numero que cayó es: "+numero+" La cara opuesta del dado es: Uno");
		break;
		
	default:
		System.out.println("ERROR: número incorrecto");
		break;
	}	
	sc.close();	
	}

}
