package com;

import java.util.Scanner;

public class Ciclos9_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 9:
		 * Programa Java que lea dos números y muestre los números pares entre ellos
		 * */

		int num1, num2;
		Scanner e = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("PROGRAMA QUE MUESTRA NUMEROS PARES ENTRE AMBOS NUMEROS");
		System.out.println("------------------------------------------------------");
		System.out.println("Introduce un primer numero: ");
		num1 = e.nextInt();
		System.out.println("Introduce un segundo numero: ");
		num2 = e.nextInt();
		if (num1 > num2) {
			System.out.println("Pares entre " + num2 + " y " + num1);
			while( num2 < num1  ) {
				if ((num2 % 2) == 0) {
					System.out.println(num2);
				}
				num2++;
			}
		}else {
			System.out.println("Pares entre " + num1 + " y " + num2);
			while( num1 < num2  ) {
				if ((num1 % 2) == 0) {
					System.out.println(num1);
				}
				num1++;
			}
		}
	}

}
