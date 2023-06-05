package com;

public class Array_YAAH {

	public static void main(String[] args) {
		// Los Arrays o arreglos son una estructura de datos en común 
		// una vez declarado su tamaño, este no puede cambiar o crecer
		// en tiempo de ejecucion.
		
		// Declarando un array con su tamaño declarado igualmente
		int [] numeros = new int  [11]; // Un array declarado con su tamaño
		
		// con su tamaño [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] 
		// la primera posicion donde guarmaos el valor es la posicion 0
		
		// Como podemos guardar datos en cada posicion del array
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 11;
		numeros[7] = 12;
		numeros[8] = 13;
		numeros[9] = 14;
		numeros[10] = 15;
		
		// Darle salida en consola a una determinada posicion del array
		// para obtener un valor determinado.
		System.out.println(numeros [10]);
	
		// Otra manera de declarar e iniciar un array, incluso con sus valores
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]);
		
		// Declarar un array de caracteres
		char[] letras = {'a', 'l', 'e', 'x'};
		String nombre = "Alets";
		
		// Imprimir todos los valores de una array en consola
		System.out.println(nombre);
		
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
//		for (int i = 0; i < 8; i++) {
//			System.out.println(numeros[i]);
//		}
//		
//		Funciona tambien con un while
		
		int x = 0; // Tengo una variable que me va a ayudar a iterar conforme su valor cambie
		
		while (x <numeros2.length) {// Mientras x sea menor al tamaño del array
			System.out.println(numeros2[x]); // Se va a imprimir en pantalla la posicion deacuerdo
			x++; // como cambie x
			// Y por ultimo se realizo un incremento para que no tienda a el infinito
			// y se impriman los otros valores.
		}
		
		
		
		
		
		
		
		
	}

}
