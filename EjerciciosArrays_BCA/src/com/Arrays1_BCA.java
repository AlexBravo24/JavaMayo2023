package com;

import java.util.Scanner;

public class Arrays1_BCA {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.

		
		Scanner num = new Scanner(System.in);
	    int[] numeros = new int[10];
	   
	    for(int i = 0; i < 10; i++){
	      System.out.print("Ingrese el valor para la posici�n " + i + ": ");
	      numeros[i] = num.nextInt();
	    }

	    for(int i = 0; i < 10; i++){
	      System.out.println("El valor en la posici�n " + i + " es " + numeros[i]);
	    }
	}

}
