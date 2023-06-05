package com;

import java.util.Scanner;

public class Ciclos10_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 10:
		 * Programa que lea 20 números e indique si son positivos o negativos y 
		 * pares o impares y además muestre la sumatoria de los positivos y 
		 * sumatoria de los impares.
		 * */
		
		int x = 1;
		int numero = 0, pos = 0, imp = 0;
		Scanner e = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------");
		System.out.println("PROGRAMA QUE LEE 20 NUMEROS Y DE ESTOS: ");
		System.out.println("- SI SON POSITIVOS");
		System.out.println("- SI SON NEGATIVOS");
		System.out.println("- SI SON PARES E IMPARES");
		System.out.println("- LA SUMATORIA DE LOS POSITIVOS");		
		System.out.println("- LA SUMATORIA DE LOS IMPARES");		
		System.out.println("------------------------------------------------------");
		
		
		do {
			System.out.println("Introduce un numero: ");
			numero = e.nextInt();
			if (numero > 0) {
				System.out.println("El numero es positivo");
				pos += numero;
			}else {
				System.out.println("El numero es negativo");
			}
			if (numero % 2 == 1) {
				System.out.println("El numero es impar");
				imp += numero;
			}else {
				System.out.println("El numero es par");
			}
		} while (x < 20);

		System.out.println("La sumatoria de los positivos es: " + pos);
		System.out.println("La sumatoria de los impares es: " + imp);
	}

}
