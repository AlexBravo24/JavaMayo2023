package com;

public class Array_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Los arrays o arreglos son una estructura 
		//de datos que nos permiten almacenar un tipo
		//de datos en com�n, una vez declarados 
		//su tama�o, este no puede cambiar 
		//o crecer en tiempo de ejecuci�n
		
		
		//Declarando un array con su tama�o 
		//declarando
		
		int [] numeros = new int [10]; // Un array 
		//declarado con su tama�o
		//[1][2][3][4][5][6][7][8][9][10]
		//Por indice, la primera posici�n donde
		//guardamos la posici�n, es la posici�n 0
		numeros[0]=1;
		numeros[1]=17;
		numeros[2]=18;
		numeros[3]=12;
		numeros[4]=10;
		numeros[5]=16;
		numeros[6]=15;
		numeros[7]=16;
		numeros[8]=15;
		numeros[9]=17;
		
		
		//Darle salida en consola a una determinada
		//posici�n del array para obtener un valor
		//determinado
		
		System.out.println(numeros[7]);
		
		//Otra manera de declarar e iniciar un array
		//incluso con sus valores
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(numeros2[9]);
		
		//Declarar un array de caracteres
		
		char [] letras = {'A','L','E','X'};
		String nombre = "ALEX";
		
		//imprimir todos los valores del array
		System.out.println(numeros);
		
		for (int i =0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Funciona tambi�n con un while
		
		int x = 0;
		
		while (x<numeros2.length) {
			System.out.println(numeros2[x]);
			x++;
		}

	}

}
