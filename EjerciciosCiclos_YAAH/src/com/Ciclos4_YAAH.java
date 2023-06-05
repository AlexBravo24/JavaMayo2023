package com;

import java.util.Scanner;

public class Ciclos4_YAAH {

	public static void main(String[] args) {
		// 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”. 
		
		String frase;
		int contado = 0;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		frase = enter.nextLine();
		
		System.out.println("Introduce una letra: ");
		char letra = enter.nextLine().charAt(0);
		
		for ( int i = 0; i < frase.length(); i++) {
			if ( frase.charAt(i) == letra) {
				contado++;
			}
		}
		
		if ( contado > 0) {
			System.out.println("la letra " + letra + " aparece " + contado + " veces en la frase.");
		}else {
			System.out.println("Caracter no encontrado");
		}

	}

}
