package com;

import java.util.Scanner;

public class Ciclos3_EAGG {
	
	public static boolean esPalindromo(String frase) {
		frase = frase.toLowerCase();
		frase = frase.replace(" ","");
		frase = frase.replace("á","a");
		frase = frase.replace("é","e");
		frase = frase.replace("í","i");
		frase = frase.replace("ó","o");
		frase = frase.replace("ú","u");
		
	int a = 0;
	int b = frase.length() - 1;
	
	for (int i=0; i<frase.length();i++) {
		if(frase.charAt(a) == frase.charAt(b)) {
			a++;
			b--;
		}
		else
			return false;
	}
	
	return true;
	}
	
	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.

	Scanner entrada = new Scanner(System.in);
	String frase;
	
			
	System.out.println("Introduce una frase");
	frase = entrada.nextLine();	
	
	if(esPalindromo(frase))
		System.out.println("La frase es palíndromo");
	else
		System.out.println("La frase NO es palíndromo");
	
	
	}
}
	


