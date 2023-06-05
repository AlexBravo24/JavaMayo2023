package com;

import java.util.Scanner;

public class Ciclos2_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 2:
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero 
		 * introducido desde teclado, hasta la iteración deseada por el usuario. 
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 * */

		int num, fin, x;
		Scanner e = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------");
		System.out.println("------- TABLA DE MULTIPLICAR DE UN NUMERO -----------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\nIntroduce el número para la tabla de multiplicar: ");
		num = e.nextInt();
		System.out.println("Introduce hasta que número deseas haces la tabla de multiplicar: ");
		fin = e.nextInt();
		x = 1;
		while(x <= fin) {
			System.out.println(num + " X " + x + " = " + (num * x));
			x++;
		}
	}

}
