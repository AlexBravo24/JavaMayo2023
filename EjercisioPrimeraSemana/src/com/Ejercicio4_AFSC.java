package com;
import java.util.Scanner;

public class Ejercicio4_AFSC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una letra: ");  
		cadena = entrada.nextLine();

		if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		      System.out.println("La letra ingresada es una letra mayúscula.");
		 }else {
		      System.out.println("La letra ingresada no es una letra mayúscula.");
		    }

	}

}
