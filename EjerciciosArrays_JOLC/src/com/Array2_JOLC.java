package com;

public class Array2_JOLC {
	
	
	//Crea un array de números de 100 posiciones, que contendrá los números del 
	//1 al 100. Obtén la suma de todos ellos y la media

	public static void main(String[] args) {
		
		int[] array = new int[100];

        // Rellenar el array con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        // Calcular la suma de los números
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += array[i];
        }

        // Calcular la media
        double media = (double) suma / 100;

        // Mostrar resultados por consola
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);
    }
}
	