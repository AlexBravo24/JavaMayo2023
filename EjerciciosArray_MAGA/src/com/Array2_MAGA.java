package com;

public class Array2_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 1: Crea un array de n�meros de 100 posiciones, que contendr� 
		 * los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
		 * */
	
		
		int [] numeros = new int [100];
		int sum = 0;
		double media;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("--- PROGRAMA QUE VACIA LOS NUMEROS DE 1 AL 100 EN UN ARRAY -");
		System.out.println("--- OBTIENE LA SUMA Y LA MEDIA DE TODOS LOS NUMEROS -");
		System.out.println("-----------------------------------------------------------");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			System.out.print(numeros[i] + " ");
		}
		
		for (int i = 0; i < numeros.length; i++) {
			sum += numeros[i];
		}
		
		media = sum / 100;
		
		System.out.println("\n\nLa suma de todos los n�mero es: " + sum);
		System.out.println("La media de todos los n�mero es: " + media);
	}

}
