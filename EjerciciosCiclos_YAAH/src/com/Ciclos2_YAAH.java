package com;

import java.util.Scanner;

public class Ciclos2_YAAH {

	public static void main(String[] args) {
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???
		
		int numero1;
		int numero2;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		numero1 = numero.nextInt();
		
		System.out.println("Introduce otro n�mero: ");
		numero2 = numero.nextInt();
		
		for (int i = 1; i <= numero2; i++) {
			System.out.println("N�mero " + numero1 + " X " 
		+ i + " es igual a: " + (numero1 * i));
		}
		
		
		
//		int a;
//		int b;
//		int i = 1;
//		
//		Scanner numero = new Scanner(System.in);
//		
//		System.out.println("Introduce un n�mero: ");
//		a = numero.nextInt();
//		
//		System.out.println("Introduce otro n�mero: ");
//		b = numero.nextInt();
//		
//		while ( i <= b) {
//			System.out.println(a + " x " + i + " = " + (a*i));
//			i++;
//		}
//		
//		
		
		
		
	}

}
