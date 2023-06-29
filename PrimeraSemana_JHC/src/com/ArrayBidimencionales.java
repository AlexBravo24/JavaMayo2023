package com;

import java.util.Arrays;

public class ArrayBidimencionales {

	public static void main(String[] args) {
		// Array Bidimencional - Estructura que contiene mas datos
		//igualmente de un mismo tipo
		//pero se vuelve "exponencial" y pasamos de una estructura
		//que maneja datos lineales ((1,2,3,4,5))
		//a tener datos en forma de "tabla" 12345
		//									678910
		
		//Declarar arrays bidimencional - dos dimensiones
		
		int [] [] numero = new int [3] [3]; //definicion para array bidimencionales para dos array, se 
		//convierte en 9 dimensiones
		//una dimension define filas y otra columnas
		
		//Al momento de almacenar datos en el arreglo de dos dimensiones
		
		numero [0] [0] = 1;
		numero [0] [1] = 2;				//[1], [2], [3]
		numero [0] [2] = 3;
		
		numero [1] [0] = 4;
		numero [1] [1] = 5;				//[4], [5], [6]
		numero [1] [2] = 6;
		
		numero [2] [0] = 7;
		numero [2] [1] = 8;				//[7], [8], [9]
		numero [2] [2] = 9;
		
		//se puede asignar valores  aun array de dos dimensiones
		//con la declaracion por llaves
		
	
		int [] [] numeros2 = {{1,2,3},{4,5,6},{7,8,9}};
	
		//Darle salida a estos datos en consola
		
		System.out.println("Primera fila: " + Arrays.toString(numero[0]));
		System.out.println("Segunda fila: " + Arrays.toString(numero[1]));
		System.out.println("Tercera fila: " + Arrays.toString(numero[2]));
	
		
//		System.out.println("Los valores contenidos en numeros son :");
////		for (int i = 0; i < 3; i++) {
//				System.out.println();
////			for (int j = 0; j < 3; j++) {
////				System.out.print(numero[i][j] + " ");
////			}
//		}
	
	}
}
