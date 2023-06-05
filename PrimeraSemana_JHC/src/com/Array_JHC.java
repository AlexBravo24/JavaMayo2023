package com;

public class Array_JHC {

	public static void main(String[] args) {
		// Los array o arregles son una estrcutura de datos que
		//nos permiten almacenar un tipo de datos en comun 
		//Una vez declaro su tamaño, este no puede cambiar 
		//en tiempo de ejecucion
		
		//Declarando un array con su tamaño declarado iguales
		
		int [] numeros = new int [10] ; //Un array declarado 
		//con su tamaño
		//[1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
		//Por indice, la primera posicion donde guardamos el 1
		//es la posicion 0
		
		//como guardar datos en cada posicion del array
		
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		numeros [5] = 6;
		numeros [6] = 7;
		numeros [7] = 8;
		numeros [8] = 9;
		numeros [9] = 10;
		
		//Darle salida en consola a una determinada posicion del array 
		//para obteener un valor determinado
		
		System.out.println(numeros[7]);
		
		//otra manera de declarar array, incluso con
		//sus valores
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]);
		
//		char [] letras = new char [10];
//		or	valores con letras
//		char [] letras = {};
		
		char [] letras = {'A','L','E','X'};
		String nombre;
		
		//Imprimir todos los valores del array 
		
//		System.out.println(numeros);
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		//Funciona tambien con while
		int x = 0;	//tengo una variable que me va ayudar 
					//a actualizar los datos conforme su valor cambie
		
		while (x<numeros.length) {	//mientras x sea menor al tamaño de mi array
			System.out.println(numeros2[x]); //voy a imprimir en pantalla la posicion de acuerdo a como cambie x
			x++;	// y realizo un incremento para que no tienda al infinito
			//y se impriman los otros valores
			
		}
		
		
		
	}

}
