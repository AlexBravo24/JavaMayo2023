package com;

public class Array2_EIMD {

	public static void main(String[] args) {
		/*
		 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
1 al 100. Obt�n la suma de todos ellos y la media.
		 */
		
		int numeros []=new int[100];
		int suma=0;
		double media=0;
		int valorI=0;
		
		for (int i = 0; i <=99; i++) {
			numeros [i]=valorI++;
	       suma=suma+valorI;
		System.out.println(suma);
		media=suma/100;
		}
		
		
		System.out.println("La Suma es:"+suma+" la media es: " +media);
	}

}
