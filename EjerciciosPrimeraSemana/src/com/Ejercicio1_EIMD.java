package com;

import java.util.Scanner;

public class Ejercicio1_EIMD {

	public static void main(String[] args) {
		/*
		 1.Realiza un programa que reciba dos números por teclado 
		 e indique cuál es mayor o si son iguales.
		 */
		
		int pirmero;
		int segundo;
		Scanner numeros = new Scanner(System.in);
		System.out.println("Introduce 2 numeros");
		pirmero= numeros.nextInt();
		segundo=numeros.nextInt();
		
		if(pirmero==segundo) {
			System.out.println("Ambos números son iguales");
		}
		else if(pirmero<segundo) {
			System.out.println("El numero: "+ segundo + " es mayor que: "+ pirmero);
			
		}
		else {
			System.out.println("El numero: "+ pirmero +" Es mayor que: " + segundo );
		}
		
		numeros.close();
		
	}
}
