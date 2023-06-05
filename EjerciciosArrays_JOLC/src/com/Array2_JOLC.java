package com;

public class Array2_JOLC {
	
	
	//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
	//1 al 100. Obt�n la suma de todos ellos y la media

	public static void main(String[] args) {
		
		int[] array = new int[100];

        // Rellenar el array con los n�meros del 1 al 100
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        // Calcular la suma de los n�meros
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += array[i];
        }

        // Calcular la media
        double media = (double) suma / 100;

        // Mostrar resultados por consola
        System.out.println("Suma de los n�meros: " + suma);
        System.out.println("Media de los n�meros: " + media);
    }
}
	