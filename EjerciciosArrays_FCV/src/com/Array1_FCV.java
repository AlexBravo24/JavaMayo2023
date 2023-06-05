package com;

import java.util.Scanner;

public class Array1_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		int [] numeros = new int [10];
		
		System.out.println("Introduzca los números deseados");
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			numeros[i]=entrada.nextInt();
		}
		for (int i = 0; i <= 9; i++) {
			System.out.println("Indice "+i+" valor["+numeros[i]+"]");
		}

	}

}
