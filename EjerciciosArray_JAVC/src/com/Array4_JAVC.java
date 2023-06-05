package com;

public class Array4_JAVC {

	public static void main(String[] args) {
		
		
		
		// 4. Dado un array de números de 5 posiciones con los siguientes valores:
		//      {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//    los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//    {5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		
		int [] invertidos = new int [5];
		
		for (int i = 0; i < invertidos.length; i++) {
			
			invertidos [i] = numeros[(invertidos.length - 1 - i)];
			
		}
		
		for (int i = 0; i < invertidos.length; i++) {
			System.out.println("Invertidos [" + i + "] = " + invertidos [i]);
			
		}


	}

}