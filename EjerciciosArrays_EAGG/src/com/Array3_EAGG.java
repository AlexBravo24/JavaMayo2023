package com;

import java.util.Arrays;
import java.util.Scanner;

public class Array3_EAGG {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase 
		// y pasa sus caracteres a un array de caracteres.

		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduce una frase:");
		frase = entrada.nextLine();
			
		char [] letra = new char [frase.length()];
		
		for (int i=0; i < frase.length(); i++) {
			letra [i] = frase.charAt(i);
			}
		
		System.out.println(Arrays.toString(letra));
	}

}
