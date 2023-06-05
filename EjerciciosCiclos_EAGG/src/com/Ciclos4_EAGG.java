package com;

import java.util.Scanner;

public class Ciclos4_EAGG {

	public static void main(String[] args) {
		// 4.Programa que reciba una frase y una letra por teclado. 
		// Deberá retornar como resultado cuántas veces existe esa 
		// letra dentro de la frase. Si no existe, imprimir un mensaje 
		// “Carácter no encontrado”.

		Scanner entrada = new Scanner(System.in);
		String frase1;
		char letra;
		
		
		System.out.println("Introduce la frase a evaluar");
		frase1 = entrada.nextLine();
		
		System.out.println("Introduce la letra a buscar");
		letra = entrada.next().charAt(0);
		
		int contador = 0;
		for (int i = 0; i < frase1.length (); i++) {
			if (frase1.charAt (i) == letra) {
				contador++;
			}
		}
		if (contador > 0) {
			System.out.println("La letra " + letra + " aparece " + contador + " veces en las que aparece ");
		} else {
			System.out.println("La letra ingresada no aparece en la frase."); 
		}
	

		
	}

}
