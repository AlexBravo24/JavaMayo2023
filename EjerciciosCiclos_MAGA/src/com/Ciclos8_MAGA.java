package com;

import java.util.Scanner;

public class Ciclos8_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 8:
		 * Programa Java que lea dos números y muestre los números 
		 * desde el menor hasta el mayor
		 * */
		
		int num1, num2;
		Scanner e = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("PROGRAMA QUE MUESTRA NUMEROS ENTRE EL MAYOR Y EL MENOR");
		System.out.println("------------------------------------------------------");
		System.out.println("Introduce un primer numero: ");
		num1 = e.nextInt();
		System.out.println("Introduce un segundo numero: ");
		num2 = e.nextInt();
		if (num1 > num2) {
			System.out.println("Valores entre " + num2 + " y " + num1);
			while( num2 < num1  ) {
				System.out.println( num2 );
				num2++;
			}
		}else {
			System.out.println("Valores entre " + num1 + " y " + num2);
			while( num1 < num2  ) {
				System.out.println( num1 );
				num1++;
			}
		}
	}

}
