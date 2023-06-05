package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		
		// una array bidimensional - Estructura que contiene mas datos igualemnte de un mismo tipo.
		//peor se vueleve "exponencial", y pasamos de una estructura que maneja datos lineales ({1,2,3,4,5,6})
		//a tener datos en forma de "tabla" 12345
		//									678910

		//Declarando un array de dos dimensiones 
		
		
		int[][]numeros = new int[3][3]; //[filas][Columnas]
		
		/// al momento de almacenar datos en el arreglo de dos dimensionales
		
		numeros [0][0] = 1;
		numeros [0][1] = 2;  //[1][2][3]
		numeros [0][2] = 3;
		
		
		numeros [1][0] = 4;
		numeros [1][1] = 5;  //[4][5][6]
		numeros [1][2] = 6;
		
		
		numeros [2][0] = 7;
		numeros [2][1] = 8;  //[7][8][9]
		numeros [2][2] = 9;
		
		//podemos asignar valores a un array de dos dimensiones con la declaracion 
		//por llaves
		
		int [][] nuemeros = {{1,2,3,},{4,5,6},{7,8,9},};
		
		//darle salida a estos datos en consola
		System.out.println("Los valores contenidos en numeros son:");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros[i][j]+" ");
			}

		}
		
		
		
		
		
		
		
		
	}
	

}
