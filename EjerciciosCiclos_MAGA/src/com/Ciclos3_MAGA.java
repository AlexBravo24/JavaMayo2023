package com;

import java.util.Scanner;

public class Ciclos3_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 3:
		 * Realiza un programa para determinar si un String es pal�ndromo
		 * */

		Scanner e = new Scanner(System.in);
		String cadena, invertida;
		int longitud;
		
		System.out.println("------------------------------------------------------");
		System.out.println(" PROGRAMA PARA DETERMINAR SI UN STRING ES PAL�NDROMO");
		System.out.println("------------------------------------------------------");
		System.out.println("\nIntroduce la cadena: ");
		cadena = e.nextLine();
		longitud = cadena.length() - 1;
		invertida = "";
		
		while(longitud >= 0) {
			invertida +=  cadena.charAt(longitud);
			longitud--;
		}
		
		
		if (cadena.equals(invertida)) {
			System.out.println("La cadena si es pal�ndromo");
		}else {
			System.out.println("La cadena no es pal�ndromo");
		}
		
	}

}
