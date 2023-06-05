package com;

public class Array_JAVC {
	
	
	public static void main(String[] args) {
		 
		
	// ARRAYS -- SON CONOCIDOS TAMBIEN COMO ARREGLES SON UNA ESTRUCTURA DE DATOS QUE NOS PERMITEN ALMACENAR UN TIPO DE DATOS EN COMUN
	// UNA VES DECLARADO SU TAMAÑO, ESTE NO SE PUEDE CAMBIAR O CRECER EN TIEMPO DE EJECUCION
		
	// DECLARANDO UN ARRAY CON SU TAMAÑO DECLARANDO IGUALDAD
		
	int [] numeros = new int [10];              // UN ARRAY DECLARADO CON SU TAMAÑO
	
	
	// [1] [2] [3] [4]  TAMAÑO DECLARADO DEL ALRRAY
	
	// POR INDICE LA PRIMERA POSICION DONDE GUARDAMOS EL VALOR ES LA POSICION 0
	
	//
	
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
	
	
	
	// DARLE SALIDA EN CONSOLA A UNA DETERMINADA POSICION DELL ALRRAY PARA OBTENER EL VALOR DETERMINADO
	
	System.out.println(numeros[5]);
	
	
	// OTRA MANERA DE DECLARAR E INICIAR UN ARRAY INCLUSO CON SUS VALORES
	
	int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println(numeros2[5]);
	
	
	// DECLARAR UN ARRAY DE CARACTERES
	
	char [] letras = {'A','l','e','x'};
	
	String nombre = "Alex";
	
	// IMPRIMIR TODOS LOS VALORES DE UN ARRAY EN CONSOLA
	
	System.out.println(numeros2);
	
//	for (int i = 0; i < numeros.length; i++) {
//		
//		System.out.println(numeros[i]);
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
			
	// FUNCION TAMBIEN CON WHILE
			
	int x = 0;                                     // TENEMOS UNA VARIABLE QUE ME VA A AYUDAR CONFORME A SU VALOR CAMBIE
	
	while (x<numeros2.length) {                    // MIENTRAS X SEA MENOR AL TAMAÑO DE MI ARRAY
		
		System.out.println(numeros2[x]);           // VOY IMPRIMIR EN PANTALLA LA POSICION DE ACUERDO A COMO CAMBIE X
		x++;                                       // SE REALIZA UN INCREMENTO PARA QUE NO TIENDA A INFINITO Y SE IMPRIMAR LOS
		                                           // OTROS VALORES
		
		
		
		
		
		
	}
		
	}
	
	
	
	
	
	
	
	
	
	}

}
