package com;
import java.util.Scanner;

public class Array1_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 1: Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 *  Muestra por consola el índice y el valor al que corresponde.
		 * */

		
		int [] numeros = new int [10];
		Scanner e = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("--- PROGRAMA PARA LEER 10 NUMEROS Y PONERLOS EN UN ARRAY --");
		System.out.println("--- Y MUESTRA EL INDICE Y EL VALOR DE CADA UNO DE ELLOS --");
		System.out.println("-----------------------------------------------------------");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un valor para el indice[" + i + "]: ");
			numeros[i] = e.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros["+ i + "] = " + numeros[i]);
		}
	}

}
