package com;

public class Ejercicio2_AFSC {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que 
		//contendr� los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
		
		int suma=0,media;
		int[]numeros=new int[100];
		for (int i=0; i<100;i++) {
			numeros[i] = i+1;
			System.out.println(numeros[i]);
			suma += i+1;
		}
			media = suma / numeros.length;
		//double prom=suma/numeros.length;
		System.out.println("la suma es:   "+suma);
		System.out.println("La media es:   "+media);
		

	}

}
