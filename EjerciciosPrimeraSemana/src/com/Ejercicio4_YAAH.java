package com;

import java.util.Scanner;

public class Ejercicio4_YAAH {

	public static void main(String[] args) {
		// Ejercicio 4. Realizar un programa que lea una cadena por teclado
		// y compruebe si es una lera mayuscula
		
		// Podriamos declarar u String donde guardar una cadena, que seria 
		// la cadena original

		
//		String original;
		// Vamos a declarar otro String donde vamos a convertir 
		// el valor de la cadena original a mayusculas o minusculas
		
//		String convertido;
//		 
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Introduce una cadena de texto");
//		
//		original = input.next();
//		convertido = original.toLowerCase(); // aqui se convierte la cadena
		// introducida 
		// Evaluamos si la cadena original es igual a la cadena convertida
		// si la cadena fuera igual, entonces imprimimos un msj
		// en el que diga que la cadena esta en minusculas
		// Si no es igual, entonces mandamos un mensaje de que esta en mayusculas.
		
//		if(original.contentEquals(convertido)) {
//			System.out.println("El texto esta en minusculas");
//		}else {
//			System.out.println("El texto contiene mayusculas");
//		}
		
		
		String uno;
		String dos;
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		uno = into.nextLine();
		
		dos = uno.toLowerCase();
		
		if ( dos == uno ) {
			System.out.println("Contiene letra minuscula");
		}else {
			System.out.println("Contiene letra mayuscula");
			
		}
		
		
	}

}
