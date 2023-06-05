package com;

import java.util.Scanner;

public class Array3_JAVC {

	public static void main(String[] args) {
		
		
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//     caracteres.
		      
		Scanner valor = new Scanner(System.in);
		      
		// Se solicita al usuario escriba una frase
		      
		System.out.println("Escribe una Frase ");
		
		String frase = valor.nextLine();
		
		// Se crea un Array de caracteres usando el metodo de String
		
		char caracteres [] = frase.toCharArray();
		
		// Recorremos la frase y tomamos cada caracter y lo metemos en el Array
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(caracteres [i]);
			
		}
 		


	}

}
