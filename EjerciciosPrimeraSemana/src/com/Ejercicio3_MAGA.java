package com;

import java.util.Scanner;

public class Ejercicio3_MAGA {
	public static void main(String[] args) {
		/*
		 * EJERCICIO 3: 
		 * Crea un programa que pida al usuario dos n�meros y muestre el 
		 * resultado de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		 * */
		
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("-----------------------------------");
		System.out.println(" DIVISION DE UN NUMERO ENTRE OTRO");
		System.out.println("-----------------------------------");
		System.out.println("Introduce un n�mero desde teclado: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce un segundo n�mero desde teclado: ");
		num2 = entrada.nextInt();
		
		if (num2 == 0) {
			System.out.println("El segundo n�mero no debe ser 0 division error");
		}else {
			System.out.println("El resultado de la divisi�n es: " + (num1 / num2));
		}
	}
}
