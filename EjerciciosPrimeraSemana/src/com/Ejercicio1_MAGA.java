package com;

import java.util.Scanner;

public class Ejercicio1_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 1: 
		 * Realiza un programa que reciba dos n�meros por teclado e 
		 * indique cu�l es mayor o si son iguales
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce el primer n�mero por teclado: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo n�mero por teclado: ");
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		}else if (num1 > num2) {
			System.out.println("El primer numero es mayor al segundo");
		}else {
			System.out.println("El segundo numero es mayor al primero");
		}
		
	}

}
