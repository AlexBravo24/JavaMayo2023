package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// Declarando un array de dos dimenciones
		
		
		int [] [] numeros= new int [3] [3]; // [filas] [columnas]
		
		// Al momento de almacenar datos en el arreglo de dos dimenciones
		
//		numeros [0][0] = 1;
//		numeros [0][1] = 2;
//		numeros [0][2] = 3;
//		
//		numeros [1][0] = 4;
//		numeros [1][1] = 5;
//		numeros [1][2] = 6;
//		
//		numeros [2][0] = 7;
//		numeros [2][1] = 8;
//		numeros [2][2] = 9;
//		
 		// Podemos asigmar valores a un array de dos dimenciones
		// con la declaracion por llaves
		
		int [][] numeros2 = {{1,2,3},
							 {4,5,6},
							 {7,8,9} };
		
		
		// Darle salida a estos datos en consola
		System.out.println("Los valores contenidos en Número son");
		for (int i = 0; i <3; i++) {
			System.out.println();
			for ( int j = 0; j < 3; j++) {
				System.out.print(numeros2[i][j] + " ");
			}
		}
		
		
		
		
		
		
		
	}

}
