package com;

import java.util.Scanner;

public class Ejericio1 {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde

		Scanner entrada =new Scanner(System.in);
		int [] numeros=new int [10];
		System.out.println("Numeros a guardar");
		for(int i=0;i<10;i++) {
		System.out.println("Digita un numero:  ");
		numeros[i]=entrada.nextInt();		
		}
		
		System.out.println("Los valores y su posicion son:  ");
		for(int i=0;i<10;i++) {
			System.out.println("La posicion de los :  "+i+"  Numeros:  "+numeros[i]);
		}
	}

}
