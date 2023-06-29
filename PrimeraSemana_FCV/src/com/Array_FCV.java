package com;

public class Array_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Los arrays o arreglos son una estructura 
		//de datos que nos permiten almacenar un tipo
		//de datos en común, una vez declarados 
		//su tamaño, este no puede cambiar 
		//o crecer en tiempo de ejecución
		
		
		//Declarando un array con su tamaño 
		//declarando
		
		int [] numeros = new int [10]; // Un array 
		//declarado con su tamaño
		//[1][2][3][4][5][6][7][8][9][10]
		//Por indice, la primera posición donde
		//guardamos la posición, es la posición 0
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
		//posición del array para obtener un valor
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
		
		//Funciona también con un while
		
		int x = 0;
		
		while (x<numeros2.length) {
			System.out.println(numeros2[x]);
			x++;
		}

	}

}
