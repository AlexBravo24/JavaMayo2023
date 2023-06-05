package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional-Estructura que contine mas datos 
		//Igual de un mismo tipo
		//Pero se vuelve "exponencial" y pasamos de una estructura
		//que maneja datos lineasles ({1,2,3,4,5}) a tener datos en forma de tabla 12345
		//                                                                         678910
		//
		int [][] numeros = new int [3] [3];
		//Al momento de almacenar datos en el arreglo de dos dimensiones
		
		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;          //[1][2][3]
		
		numeros[1][0] = 4;
		numeros[1][2] = 5;
		numeros[1][2] = 6;           //[4][5][6]
		
		numeros[2][0] = 7;
		numeros[2][1] = 8;
		numeros[2][2] = 9;           //[7]85]96]

		//podemos asignar valors a un array de dos dmenciones con la declaracion por llaves 
		
		int [][] numeros2 ={ {1,2,3},{4,5,6},{7,8,9}};
		
		//Darle salida  a estos datos en consola
		for (int i = 0; i < 3; i++) {// salto de linea
			System.out.println();
			for (int j = 0; j < 3; j++) {// msotrar datos en la linea
				System.out.print(numeros[i][j]+" ");
				
			}
			
		}

	}

}
