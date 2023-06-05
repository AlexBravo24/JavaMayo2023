package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TArray Bidimensional  Estructura que contiene más datos
		//igualmente de un mismo tipo.
		//Pero se vuelve exponencial y pasamos de una estructura
		//lineal ({1,2,3,4,5,}) a tener datos en forma de tabla
		// 12345
		// 678910
		int [] [] numeros = new int [3] [3];
		
		//Para almacenar datos hacemos lo siguiente
		numeros[0] [0] = 1;
		numeros[0] [1] = 2;
		numeros[0] [2] = 3;		

		numeros[1] [0] = 4;
		numeros[1] [1] = 5;
		numeros[1] [2] = 6;		

		numeros[2] [0] = 7;
		numeros[2] [1] = 8;
		numeros[2] [2] = 9;		
		
		//También podemos declara de la siguiente forma
		
		int [] [] numeros2 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Los valores de la matríz son:");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j<3; j++) {
				System.out.print(numeros[i] [j] + " ");
			}
		}

	}

}
