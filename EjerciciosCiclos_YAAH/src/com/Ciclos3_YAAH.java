package com;

import java.util.Scanner;

public class Ciclos3_YAAH {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo. 

		int tamano;
		String frase;
		String sefra;
		boolean pali = true;
		
		Scanner intro = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		frase = intro.nextLine();
		
		sefra = frase.replaceAll(" ", "").toLowerCase();
		tamano = sefra.length();
		
		for (int i = 0; i < tamano / 2 ; i++) {
			if (sefra.charAt(i) != sefra.charAt(tamano -1 -i)) {
				pali = false;
				break;
			}
			
		}
		
		if (pali) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
		
		
		
		
	}

}
