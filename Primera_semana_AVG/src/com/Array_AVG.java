package com;

public class Array_AVG {

	public static void main(String[] args) {
		// 
		//los ARRAY O Arreglos es una estructura de datos que nos permite almacenar 
		//u tipo de datos comun una vez declarado su tamaño este no puede cambiar o crecer en tiempo
		//de ejecucion.
		
		//Declarando un array con su tamaño delacrando igual

		
		int	[] numeros = new int[10]; // array declarado con su tamaño. Es decir cuantos datos pueden
		
		
		//[] [] [] [] [] [] [] [] []
		//por indice, la primera posicion deonde guardamos el valor en la posicion 0
		// como podemos guardar datos en cada posicion del array
		
		
		numeros[0] =1;
		numeros[1] =2;
		numeros[2] =3;
		numeros[3] =4;
		numeros[4] =5;
		numeros[5] =6;
		numeros[6] =7;
		numeros[7] =8;
		numeros[8] =9;
		numeros[9] =10;
		
		//Darle salida- en cosola a una determinada posicion del array para obtener un valor determinada
		
		System.out.println(numeros[7]);
		// otra manera de declarar un array,incluso con uso valores
		
		int[] numero2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(numero2[9]);
		
		
		//declarar un array de caracteristicas
		
		char [] letras ={'A','L','E','R','C','F'};
		String nombre;
		
		//Imprimir todos los valores de un array en consola
		
//		System.out.println(numero2);
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
			
			//funciona tambien con un while
			
			
	//		}
	int x=0; ///tengo una variable que me ayuda a iterar conforme su valor cambie
	while(x<numero2.length) { /// mientras x sea menor al tamaño de mi array
		System.out.println(numero2[x]);// voy a imprimir en pantalla la posicion de acuerdo a como cambie 
		x++; //x y realizo un incremnto para que no tienda al infinito y se imprima los otros valores
			
		}
		
	
	
	}

}
