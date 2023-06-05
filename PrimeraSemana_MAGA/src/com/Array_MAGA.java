package com;

import java.util.Arrays;

public class Array_MAGA {

	public static void main(String[] args) {
		//Los array o arreglos son estructuras de datos que nos permite
		// almacenar un tipo de dato en común
		// Una vez declarado su tamaño, este no se puede cambiar en tiempo 
		// de ejecución
		
		//Declarando un array
		int [] numeros = new int[10];
		
		numeros[0] = 1;
		numeros[1] = 1;
		numeros[2] = 1;
		numeros[3] = 1;
		numeros[4] = 1;
		numeros[5] = 1;
		numeros[6] = 1;
		numeros[7] = 1;
		numeros[8] = 1;
		numeros[9] = 1;
		
		
		System.out.println(numeros[0]);
		
		
		int [] numeros2 = {1, 2, 4, 6};
		
		
		System.out.println(numeros2[2]);

		
		char [] letras = {'M', 'a', 'r', 'c', 'o'};
		String nombre = Arrays.toString(letras);
		
		System.out.println("Cadena = " + nombre);
	}

}
