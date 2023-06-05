package com;

public class ArrayBidimensional { // es una estructura con mas datos como en filas

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] numeros = new int [3] [3]; // parece indicar filas y columnas
		numeros [0] [0] = 1;
		numeros [0] [1] = 2;     // [1] [2] [3]
		numeros [0] [2] = 3;
		
		numeros [1] [0] = 4;
		numeros [1] [1] = 5;    // [4] [5] [6]
		numeros [1] [2] = 6;
		
		numeros [2] [0] = 7;
		numeros [2] [1] = 8;    // [7] [8] [9]
		numeros [2] [2] = 9;
		
		int [] [] numeros2 = {{1,2,3},{4,5,6},{7,8,9}};
		// darle salida a estos datos
		System.out.println("los valores de la tabla son:");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros [i] [j] + " ");
			}
		}
	}

}
