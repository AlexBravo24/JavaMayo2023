package com;

public class Array2_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array de números de 100 posiciones, que contendrá 
		//los números del 1 al 100. Obtén la suma de todos 
		//ellos y la media.
		
		int [] arreglo = new int [100];
		long suma=0;
		for(int i=0; i<=99; i++) {
			
			arreglo[i]=i+1;
			System.out.println(arreglo[i]);
		}
		
		for(int i=0; i<=99; i++) {
			suma=suma+arreglo[i];
		}
		
		System.out.println("Total de la suma: "+ suma);
	}

}
