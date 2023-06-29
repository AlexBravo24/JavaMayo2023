package com;

import java.util.Scanner;


//Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde.

public class Array1_JOLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array = new int[10];
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingresa 10 números:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Elementos del array:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Índice " + i + ": " + array[i]);
	        }
	    }
	}