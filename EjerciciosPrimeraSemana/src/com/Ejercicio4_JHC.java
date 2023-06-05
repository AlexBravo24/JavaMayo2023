package com;

import java.util.Scanner;

public class Ejercicio4_JHC {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		String cadena;
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos al usuario
		System.out.println("Este programa lee una cadena y comprueba si es una letra mayuscula");
		System.out.println("Introduce la cadena ");
		cadena = entrada.nextLine();
		
		
		//Calculos
		if (cadena.length() != 1) {
			System.out.println("La cadena no es una letra mayuscula");
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <=0)) {
			System.out.println("La cadena es una letra mayuscula");
		}else {
			System.out.println("La cadena no es una letra mayuscula");
		}
		
		

	}

}
