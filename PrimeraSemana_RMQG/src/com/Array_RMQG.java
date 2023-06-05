package com;

public class Array_RMQG {

	public static void main(String[] args) {
		/* Los arrays son una estructura de datos que nos permiten
		 * guardar información, no pueden crecer en tiempo de ejecución
		 * 
		 */
		int [] numeros = new int[10];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 12;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		System.out.println(numeros[6]);
		
		/*Otra manera de declarar e iniciar un array
		* incluso con sus valores
		* 
		*/
		int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]);
		char[] letras = {'A','l','e','x'};
		String nombre = "Alex";
		
		//Mostrar mediante un ciclo for
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		int x = 0;
		//Mostrar mediante un ciclo while
		
		while(x<numeros.length) {
			System.out.println(numeros2[x]);
			x++;
		}
		
		}
		
	}//fin main

}//fin class
