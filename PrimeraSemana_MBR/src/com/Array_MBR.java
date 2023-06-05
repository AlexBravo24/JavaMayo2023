package com;

public class Array_MBR {

	public static void main(String[] args) {
		// los array o arreglos son una estructura de datos que 
		//nos permiten almacenar un tipo de datos en comun
		//Una vez declarado su tamaño, este no puede cambiar 
		//el tiempo de ejecicion
		
		int [] numeros = new int [11];
		// cunatos datos se pueden ingresar en el array, un arrray declarado con su tamaño
		//[1][2][3][4][5][6][7][8][9][10] 
		//Por indice , la primera posiscion donde guardamos el valor es la posision 0
		//como podemos guardar datos  en cadena posision del array
		
		
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=11;
		numeros[7]=12;
		numeros[8]=13;
		numeros[9]=14;
		numeros[10]=15;
		
		//Darle salida en consola a  una  determinada posision de array
		//para obtener un valor determinado
		
		System.out.println(numeros[10]);
		
		//otra manera de declarar e iniciar un array, incluso con sus valores
		
		int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numeros2[9]);
		//Declarar un array de caracteres
		
		char[] letras = {'A','l','e','x'};
		String nombre = "Alex";
		
		//imprimir todos los valors de un array en consola 
		//System.out.println(letras); // imprimir valores char  del array
		System.out.println(numeros2);//No se puede mandar imprimir datos numericos de un array por lo cual se debe hacer un ciclo para imprimir cada caracter del array 
//		for (int i = 2; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
		
			
		//}
			
			//Funciona tambien con while 
			int x = 0; /// tengo una variable que me va ayudar
				// a iterar conforme su valor cambie 
				while(x<numeros2.length) { // mientras x sea menos al tramaño
					//de mi array Voy a imprimir en pantalla
					//la posision de acuerdo a como 
					System.out.println(numeros2[x]); //Voy a imprimir en pantalla
					//la posision de acuerdo a como cambie x
					x++;// y realizo un incremento para que no tienda al infinito
					// y se impriman los otros valores
					
				}
		
	
	}

}
