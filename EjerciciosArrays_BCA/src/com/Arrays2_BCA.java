package com;

public class Arrays2_BCA {
 //Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
 //1 al 100. Obt�n la suma de todos ellos y la media.
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

        
        System.out.println("La suma de los n�meros es: " + suma);
        System.out.println("La media de los n�meros es: " + media);

	}

}
