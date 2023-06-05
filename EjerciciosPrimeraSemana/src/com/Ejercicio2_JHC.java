package com;

import java.util.Scanner;

public class Ejercicio2_JHC {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		//Primer numero
		System.out.println("Este programa calcula si el numero es par o impar");
		System.out.println("Introduce el numero");
		numero = entrada.nextInt();
		
		//Calculos
		
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		}else {
			System.out.println("El numero " + numero + " es impar");
		}
		
		
	}

}
