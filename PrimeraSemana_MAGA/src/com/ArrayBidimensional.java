package com;


public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional es una estructura que tiene datos de un mismo
		// tipo pero. Pero se vuelve a cierto punto exponencial y pasamos de
		// una estrctura lineal a datos de forma de tabla
		
		// Declaracion de arreglos
		
		int [][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
		
		mostrar( numeros );

	}
	
	private static void mostrar(int arreglo [][]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				System.out.print(arreglo[i][j] + " ");
			}
			System.out.println();
		}
	}

}
