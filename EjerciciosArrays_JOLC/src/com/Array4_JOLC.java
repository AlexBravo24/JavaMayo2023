package com;

public class Array4_JOLC {

	public static void main(String[] args) {
		
		//Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = new int[array1.length];

	        // Copiar los valores invertidos de array1 a array2
	        for (int i = 0; i < array1.length; i++) {
	            array2[i] = array1[array1.length - 1 - i];
	        }

	        // Mostrar array1
	        System.out.print("array1: ");
	        for (int i = 0; i < array1.length; i++) {
	            System.out.print(array1[i] + " ");
	        }

	        // Mostrar array2
	        System.out.print("\narray2: ");
	        for (int i = 0; i < array2.length; i++) {
	            System.out.print(array2[i] + " ");
	        }
	    }
	}