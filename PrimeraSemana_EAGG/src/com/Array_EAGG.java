package com;

public class Array_EAGG {

	public static void main(String[] args) {
		// Los arrays o arreglos son una estructura
		// de datos que nos permiten almacenar un tipo
		// de datos en com�n, una vez declarado su
		// tama�o, este no puede cambiar o crecer
		// en tiempo de ejecuci�n.
		
		// Declarando un array con su tama�o declarado
		//igualmente.
		
		int [] numeros = new int [10]; //Un array declarado
		// con su tama�o o longitud. Es decir cu�ntos datos 
		// puedo almacenar en �l
		// [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] 
		// Por �ndice, la primera posici�n donde guardamos
		// es la posici�n 0
		
		// C�mo podemos guardar datos en cada posici�n del array
		
		
		//Aqu� se le da el valor de 1 a la posici�n
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
		// posici�n del array para obtener un valor determinado.
		
		System.out.println(numeros [7]); // Si pongo en la posici�n
		// 7 me arroja el n�mero 12, si agrego m�s posiciones sin
		// declararlo me manda un error, hasta que lo modifiques 
		// o declares desde el principio
		
		
		//Otra manera de declarar e iniciar un array, incluso
		// con sus valores, o dejarlo vac�o sin nada entre llaves
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]); //Te arroja 10 porque est�
		// en la posici�n 9
		
		// Declarar un array de caracteres
		
		//char [] letras = new char [10]; aqu� de uno en uno como
		// el primer ejemplo
		
		char [] letras = {'A','l','e','x'};
		// String nombre= "Alex"; aqu� en letras se imprime con un syso
		// y se imprime, pero en n�meros2 no te arroja un c�digo extra�o
		
		
		// Imprimir todos los valores de un array en consola
		
		System.out.println(numeros); //Aqu� es donde mda c�digos raros, 
		// por eso se hace el ciclo
		
		// La primera vez que se haga, i vale 0 entonces me va
		// a mostrar lo contenido en la posici�n 0, numero length es hasta
		// el largo
		// variable de control que automatiza el proceso de acuerdo 
		// a la condici�n que de ah� se va a incrementar

		
//		for (int i=0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//			}
		// Funciona tambi�n con un while
			
		int x= 0; // tengo una variable que me va a ayudar a 
		// iterar conforme su valor cambie
		
		while (x<numeros.length) { //mientras x sea menor al tama�o 
			//de mi array
			System.out.println(numeros[x]); // Voy a imprimir en consola
			//la posici�n de acuerdo a c�mo cambie x
			x++; // y realizo un incremento para que no tienda al infinito
			// y se impriman los otros valores
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
