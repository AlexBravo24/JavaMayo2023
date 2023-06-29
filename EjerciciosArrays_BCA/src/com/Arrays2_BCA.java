package com;

public class Arrays2_BCA {
 //Crea un array de números de 100 posiciones, que contendrá los números del 
 //1 al 100. Obtén la suma de todos ellos y la media.
	public static void main(String[] args) {
		
		
		int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += numeros[i];
        }

      
        double media = (double) suma / numeros.length;

        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);

	}

}
