package com;

public class Array_EAGG {

	public static void main(String[] args) {
		// Los arrays o arreglos son una estructura
		// de datos que nos permiten almacenar un tipo
		// de datos en común, una vez declarado su
		// tamaño, este no puede cambiar o crecer
		// en tiempo de ejecución.
		
		// Declarando un array con su tamaño declarado
		//igualmente.
		
		int [] numeros = new int [10]; //Un array declarado
		// con su tamaño o longitud. Es decir cuántos datos 
		// puedo almacenar en él
		// [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] 
		// Por índice, la primera posición donde guardamos
		// es la posición 0
		
		// Cómo podemos guardar datos en cada posición del array
		
		
		//Aquí se le da el valor de 1 a la posición
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		numeros [5] = 6;
		numeros [6] = 11;
		numeros [7] = 12;
		numeros [8] = 13;
		numeros [9] = 14;
		
		// Darle salida en consola a una determinada 
		// posición del array para obtener un valor determinado.
		
		System.out.println(numeros [7]); // Si pongo en la posición
		// 7 me arroja el número 12, si agrego más posiciones sin
		// declararlo me manda un error, hasta que lo modifiques 
		// o declares desde el principio
		
		
		//Otra manera de declarar e iniciar un array, incluso
		// con sus valores, o dejarlo vacío sin nada entre llaves
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]); //Te arroja 10 porque está
		// en la posición 9
		
		// Declarar un array de caracteres
		
		//char [] letras = new char [10]; aquí de uno en uno como
		// el primer ejemplo
		
		char [] letras = {'A','l','e','x'};
		// String nombre= "Alex"; aquí en letras se imprime con un syso
		// y se imprime, pero en números2 no te arroja un código extraño
		
		
		// Imprimir todos los valores de un array en consola
		
		System.out.println(numeros); //Aquí es donde mda códigos raros, 
		// por eso se hace el ciclo
		
		// La primera vez que se haga, i vale 0 entonces me va
		// a mostrar lo contenido en la posición 0, numero length es hasta
		// el largo
		// variable de control que automatiza el proceso de acuerdo 
		// a la condición que de ahí se va a incrementar

		
//		for (int i=0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//			}
		// Funciona también con un while
			
		int x= 0; // tengo una variable que me va a ayudar a 
		// iterar conforme su valor cambie
		
		while (x<numeros.length) { //mientras x sea menor al tamaño 
			//de mi array
			System.out.println(numeros[x]); // Voy a imprimir en consola
			//la posición de acuerdo a cómo cambie x
			x++; // y realizo un incremento para que no tienda al infinito
			// y se impriman los otros valores
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
