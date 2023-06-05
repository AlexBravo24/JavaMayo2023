package com;

public class EjercicioArray2_JHC {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("\n 2. Crea un array de números de 100 posiciones, que contendrá los números del\r\n" + 
					"1 al 100. Obtén la suma de todos ellos y la media. \n");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			
			//VARIABLES
			int media, suma = 0;
			
	        int[] array = new int[100];
	        
	        
	        //CICLO
	        for (int i = 0; i < array.length; i++) {
	            array[i] = i + 1;
	            System.out.println(array[i]);
	            suma += i + 1;
	        }
	        media = suma / array.length;
	        
	        //MOSTRAR EN PANTALLA
	        System.out.println("\nEl total de la suma es: \n" + suma);
	        System.out.println("\nEl total de la media es: \n" + media);

	}

}
