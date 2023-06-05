package com;

import java.util.Scanner;

public class Ciclos4_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 4:
		 * Programa que reciba una frase y una letra por teclado. 
		 * Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase.}
		 *  Si no existe, imprimir un mensaje “Carácter no encontrado”
		 * */

		String cadena;
		char letra;
		int l, a;
		Scanner e = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------");
		System.out.println(" PROGRAMA PARA ENCONTRAR UNA LETRA EN UNA CADENA");
		System.out.println("-------------------------------------------------------");
		System.out.println("\nIntroduce una frase: ");
		cadena = e.nextLine();
		System.out.println("Introduce la letra que buscas: ");
		letra = e.next().charAt(0);
		l = cadena.length();
		a = 0;

		for (int i = 0; i < l; i++) {
			if (cadena.charAt(i) == letra) {
				a++;
			}
		}
		
		
		if (a > 0) {
			System.out.println("Se encontro el caracter " + a + " veces");
		}else {
			System.out.println("No see encontro el caracter");
		}
		
		
	}

}
