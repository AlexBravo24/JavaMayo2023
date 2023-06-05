package com;

import java.util.Scanner;

public class Ejercicio8_JHC {

	public static void main(String[] args) {
//		// 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
//		“ERROR: número incorrecto”.
		
		
		int dado;
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos del usuario
		System.out.println("El programa muestra datos de las caras opuestas de un dado");
		System.out.println("Resultado de la cara obtenida: ");
		dado = entrada.nextInt();
		
		//Operaciones
		
		switch (dado) {
		case 1: 
			System.out.println("En la cara opuesta esta el \"seis\".");
			break;
		case 2: 
			System.out.println("En la cara opuesta esta el \"cinco\".");
			break;
		case 3: 
			System.out.println("En la cara opuesta esta el \"cuatro\".");
			break;
		case 4: 
			System.out.println("En la cara opuesta esta el \"tres\".");
			break;
		case 5: 
			System.out.println("En la cara opuesta esta el \"dos\".");
			break;
		case 6: 
			System.out.println("En la cara opuesta esta el \"uno\".");
			break;
		default:
			System.out.println("ERROR, Numero incorrecto");
			
			entrada.close();
		}
	}

}
