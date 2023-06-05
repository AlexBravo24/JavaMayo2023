package com;

import java.util.Scanner;

public class Ejercicio2_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 2: 
		 * Realiza un programa que pida un número por teclado
		 *  y nos indique si es par o impar
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Introduce un número por teclado: ");
		num1 = entrada.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}

	}

}
