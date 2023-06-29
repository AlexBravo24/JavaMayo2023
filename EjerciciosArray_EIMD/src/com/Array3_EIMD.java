package com;


import java.util.Scanner;

public class Array3_EIMD {

	public static void main(String[] args) {
		/*
		 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
caracteres.

		 */
		
		
		String letras;
		Scanner cadena = new Scanner(System.in);
		System.out.println("Introduce una horacion");
		letras = cadena.nextLine();
		
		char[] caracteres = letras.toCharArray();
		for (int i = 0; i < letras.length(); i++) {
			
			System.out.println(caracteres[i]);	
		}
		
		
		cadena.close();
	}


	}


