package com;

import java.util.Scanner;

public class Array3_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 3: Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		 * */

		String cadena;
		Scanner e = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("--- PROGRAMA PARA PASAR UNA FRASE A UN ARREGLO DE CHARS ---");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\nIntroduce una frase: ");
		cadena = e.nextLine();
		char [] frase = new char[cadena.length()];
		for (int i = 0; i < frase.length; i++) {
			frase[i] = cadena.charAt(i);
			System.out.println("frase[" + i + "] = " + frase[i]);
		}
	}

}
