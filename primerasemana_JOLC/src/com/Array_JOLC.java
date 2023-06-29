package com;

public class Array_JOLC {

	public static void main(String[] args) {
		/* ARRAY o areglos son una estructura de datos que nos permiten 
		almacenar un tipo de datos en comun una ves declarado su tamaño, este no puede cambiar 
		en tiempo de ejecucion 
		
		declarando un array con su tamaño declarado igual*/
		
		int [] numeros = new int [10]; 
		
		/* un aray declarado con su tamaño [1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
		 * por indie, la primera posicion donde guardamos es la posicion 0
		 * 
		 * como podemos guardar datos en cada posicion del array
		 * 
		 */
			numeros [0] = 1; 
			numeros [1] = 2; 
			numeros [2] = 3; 
			numeros [3] = 4; 
			numeros [4] = 5; 
			numeros [5] = 6; 
			numeros [6] = 7; 
			numeros [7] = 8; 
			numeros [8] = 9; 
			numeros [9] = 10; 
			
			
			/*darle salida en consola a una determinada posicion del array para
			 * obtener un valor determinado
			 * 
			 * 
			 */
	System.out.println(numeros [9] );
	
	
	
	/* otra manera de declarar e iniciar una array, incluso con sus valores
	 */
	
	int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
	
	
			System.out.println(numeros2[7]);
			
			/* declarar un array de caracteres*/
			
			char[] letras = {'a','b','e','x'};
			String nombre ="alex";
			
			//imprimir todos los valors de un array en consola
			System.out.println(numeros);
			
			for(int i =0; i<numeros.length; i++) {
				System.out.println(numeros [i]);
				
				
				//funsiona tambien con while
				
				int x = 0; //tengo una variable que me va a ayudar a iterar conforme su valor cambie
				 while(x<numeros.length) {
					 System.out.print(numeros2[x]);//voy a imprimir n pantalla la posicion de 
					 //acuerdo a como cambie x
					 x++;//y realizo un imcremento para que no tienda al infinito y se imprima los 
					 //otros valores
					 
					 
					 
				
					 
					 
				 }
				
			}
			
			
			
			
	}

}
