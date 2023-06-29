package com;

public class Array_OBA {

	public static void main(String[] args) {
		// los Arrays o arreglos son estructuras de datos que nos permiten almacenar datos en comun
		//una vez establecido su tamaño este no cambia
		int [] numeros = new int [10]; // tiene 10 posiciones y comienza desde 0 a 9 no de 1 a 10
		// como guardar en cada pocicion
		numeros [0]=1;
				numeros [1]=2;
				numeros [2]=3;
				numeros [3]=4;
				numeros [4]=5;
				numeros [5]=6;
				numeros [6]=7;
				numeros [7]=20;
				numeros [8]=21;
				numeros [9]=22;
				
				System.out.println(numeros [6]);//imprime lo que quiero en el numero [6] que es el 7
				//otra forma de usar Array :
				int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
				System.out.println(numeros2[8]);
				//declarar un Array de caracteres
				char[] letras = { 'a','b','c'};
				String nombre = "oscar";
				//imprimir todos los valores de Array
				System.out.println(numeros);
				
				for (int i =2; i < 9; i++){
					System.out.println(numeros[i]);
					//con while tambien funciona
					int x = 0; 
					while (x<numeros2.length) {
						System.out.println(numeros2[x]);
						x++;
						
					}
					
				}
					
				
				
				
				
	}

}
