package com;

import java.util.Scanner;

public class Ejercicio4_MAGA {
	public static void main(String[] args) {
		/*
		 * EJERCICIO 4: 
		 * Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		 * */
		
		String cadena;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto por teclado: ");
		cadena = entrada.nextLine();
		
		if (cadena.equals(cadena.toUpperCase())) {
			System.out.println("Si es una letra mayuscula");
		}else {
			System.out.println("No es una letra mayuscula");
		}
		
		entrada.close();
	}
}
