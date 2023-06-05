package com;

import java.util.Scanner;

public class Array1_EIMD {

	public static void main(String[] args) {
/*
 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
Muestra por consola el índice y el valor al que corresponde.
 */
		
		
		int numeros[]=new int[11];
		Scanner sc =new Scanner(System.in);
		for (int i = 1; i <=10; i++) {
			System.out.println("Ingresa el valor:"+i);
			numeros[i]=sc.nextInt();
			
			
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El valor que guardaste es:"+numeros[i]+"la posicion es:"+i);
		}
		sc.close();
	}

}
