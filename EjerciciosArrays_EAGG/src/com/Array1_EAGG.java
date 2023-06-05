package com;

import java.util.Scanner;

public class Array1_EAGG {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores 
		// pedidos por teclado. Muestra por consola el índice y 
		// el valor al que corresponde.

		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int [10];
				
		
		System.out.println("Ingrese los números:");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			numeros [i] = entrada.nextInt();
		}	
					
		for (int i = 0; i <= 9; i++) {
			System.out.println("En el índice " + i + " está el valor " + numeros[i]);
		}	
		
	}

}
