package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array bidimensional es una estructura que contiene
		// más datos igualmente de un mismo tipo.
		// Pero se vuelve "exponencial", y pasamos de una 
		// estructura que maneja datos lineales ({1,2,3,4,5})
		// a tener datos en forma de "tabla" 12345 (fila1)
		//                                   67890 (fila 2)
		
		// Declarando un array de dos dimensiones
		
		// int [] numeros= new int [3]; Así lo poníamos de una fila
		
		int[][] numeros = new int [3][3]; // [Filas][Columnas] ; Los primeros
		// dos corchetes, es la representación de que son 2 dimensiones
		// entonces si es [3][3] son 9 datos
		
		// Al momento de almacenar datos en el arreglo de dos 
		// dimensiones
		
		numeros [0][0] = 1; // [1][2][3]
		numeros [0][1] = 2; 
		numeros [0][2] = 3;
		
		numeros [1][0] = 4;
		numeros [1][1] = 5; // [4][5][6]
		numeros [1][2] = 6;
		
		numeros [2][0] = 7;
		numeros [2][1] = 8;
		numeros [2][2] = 9; // [7][8][9]
	
		// Podemos asignar valores a un array de dos dimensiones
		// con la declaración por llaves
		
		int[][] numeros2 = {{1,2,3},{4,5,6},{7,8,9}}; //Tendríamos fila por fila
		
		// es decir:   int[][] numeros2 = {{1,2,3},
		//                                 {4,5,6},
		//                                 {7,8,9}};  
		
		
		// Darle salida a estos datos en consola:
		
		System.out.println("Los valores contenidos en NÚMEROS son:");
		for (int i = 0; i<3; i++) {
			System.out.println();
			for (int j = 0; j <3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
		}
		
		
		
		
		
		
	}

}
