package com;

import java.util.Scanner;

public class Ejercicio3_MAGA {
	public static void main(String[] args) {
		/*
		 * EJERCICIO 3: 
		 * Crea un programa que pida al usuario dos números y muestre el 
		 * resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		 * */
		
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("-----------------------------------");
		System.out.println(" DIVISION DE UN NUMERO ENTRE OTRO");
		System.out.println("-----------------------------------");
		System.out.println("Introduce un número desde teclado: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce un segundo número desde teclado: ");
		num2 = entrada.nextInt();
		
		if (num2 == 0) {
			System.out.println("El segundo número no debe ser 0 division error");
		}else {
			System.out.println("El resultado de la división es: " + (num1 / num2));
		}
	}
}
