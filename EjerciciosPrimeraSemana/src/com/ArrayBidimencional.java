package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array bidimensional-estructura que con tiene mas datos igualmente de un mismo  tipo
		//igualmente de un mismo tipo, maneja datos lineales con filas y columnas
		
		//Declara
		int [] [] numeros = new int [3][3]; // [Filas]
		
		numeros[0][0] = 1;
		numeros[0][1] = 2;  //[1][2][3]
		numeros[0][2] = 3;
		
		numeros[1][0] = 4;
		numeros[1][1] = 5;  //[4][5]6]
		numeros[1][2] = 6;
		
		numeros[2][0] = 7;
		numeros[2][1] = 8; //[7][8][9]
		numeros[2][2] = 9;
		
		//Podemos asignar valores a un  array de dos dimensiones
		//con la declaracion por llaves
		
		int [][] numeros2= {{1,2,3},
				            {1,2,3},
				            {1,2,3}};
		//Declarar valores  en la pantalla
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println();
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j]+" ");
			}
		}
	}

}
