package com;

public class Array2RMQG{
    public static void main(String[] args) {
    	
		/*
		 * Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1
		 * al 100. Obt�n la suma de todos ellos y la media.
		 */
    	
        int[] numeros = new int[100];
        int suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        media = (double) suma / numeros.length;

        System.out.println("La suma de todos los n�meros es: " + suma);
        System.out.println("La media de todos los n�meros es: " + media);
    }
}
