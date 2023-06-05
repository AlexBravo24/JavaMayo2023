package com;

import java.util.Scanner;

public class Ciclos3_EAGG {
	
	public static boolean esPalindromo(String frase) {
		frase = frase.toLowerCase();
		frase = frase.replace(" ","");
		frase = frase.replace("�","a");
		frase = frase.replace("�","e");
		frase = frase.replace("�","i");
		frase = frase.replace("�","o");
		frase = frase.replace("�","u");
		
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
		// 3. Realiza un programa para determinar si un String es pal�ndromo.

	Scanner entrada = new Scanner(System.in);
	String frase;
	
			
	System.out.println("Introduce una frase");
	frase = entrada.nextLine();	
	
	if(esPalindromo(frase))
		System.out.println("La frase es pal�ndromo");
	else
		System.out.println("La frase NO es pal�ndromo");
	
	
	}
}
	


