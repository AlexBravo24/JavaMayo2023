package com;

import java.util.Scanner;

public class Ejercicio2_YAAH {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un n�mero por 
		// teclado y nos indique si es par o impar

		int numero;
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		numero= into.nextInt();
		
		if (numero % 2 == 0) { // % Calcula el residuo de la division entre numero y 2
			System.out.println("El n�mero: " + numero + " es par");
		}else {
			System.out.println("El n�mero: " + numero + " es impar");
		}
		
	}

}
