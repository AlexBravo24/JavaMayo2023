package com;

public class Array2_JAVC {

	public static void main(String[] args) {
		
		
		// 2.- Crea un array de números de 100 posiciones, que contendrá los números del 
		//     1 al 100. Obtén la suma de todos ellos y la media.

			int media, suma = 0;
	       
			int[] numero = new int[100];
	       
			System.out.println("Los Numeros del 1 al 100 : ");
			
			for (int i = 0; i < numero.length; i++) {
	            
				numero[i] = i+1;
	           
				System.out.println("Numero : " + numero[i]);
	            
				suma += i+1;
	        }
	        media = suma / numero.length;
	        System.out.println("La suma da : " + suma);
	        System.out.println("La media da : " + media);

	}

}
