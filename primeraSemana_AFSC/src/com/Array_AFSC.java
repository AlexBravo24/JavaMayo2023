package com;

public class Array_AFSC {

	public static void main(String[] args) {
		// Los arrays o arreglos con una estructura de datos que
		//nos permiten almacenar un tipo de datos en comun
		//en tiempo de ejecución.
		
		//Declarando un array con su tamaño declarando
		//igualmete
		
		int [] numeros=new int [10];//array declarado con tamaño
		//[1][2][3][4][5][6][7][8][9][10]
		//Por indice, la primera posicion donde guardammos es 0
		
		//Como podemos guardar datos en cada posicion del array
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
		//Darle salida en consola a una determinada posicion
		//Del array para obtener un valor determinado
		
		System.out.println(numeros[7]);
		//Otra forma de declarar e iniciar un array, incluso con
		//sus valores
		int[] numeros2 = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(numeros2[9]);
		
		//declaracion de caracteres
		
		char[] letras= {'a','l','e','x'};
		String nombre = "Alex";
		
		//Imprimir todos los valores de un array en consola
		System.out.println(numeros2);//da un valor extraño
		
		System.out.println(numeros);
		for (int i=0; i< numeros.length; i++){
			System.out.println(numeros[i]);
		}
		
		//funciona tambien con un while
		
		int x=0;//variable que ayuda a iterar conforme su valor cambie
		while(x<numeros2.length) {//mientras x sea menor que el valor del array
			System.out.println(numeros2[x]);
			x++;//realizo un incremento para que no tienda al
		}
	

	}//main

}
