package com;

import java.util.Scanner;

public class Array1_JAVC {

	public static void main(String[] args) {
		
		//1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//   Muestra por consola el índice y el valor al que corresponde.

		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int [10];
		
		System.out.println("Ingresa los numeros : ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Numero " + (i+1) + " : ");
			numeros [i] = entrada.nextInt();
			
		}
 		
		for (int i = 0; i <= 9; i++) {
			System.out.println("En el indice " + i + " esta el valor " + numeros[i]);
			
		}
	

		
	}

}
