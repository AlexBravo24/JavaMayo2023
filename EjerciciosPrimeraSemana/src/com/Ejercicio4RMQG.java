package com;

import java.util.Scanner;

public class Ejercicio4RMQG {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado
		// y compruebe si es una letra may�scula.

		String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una cadena para evaluarla: ");
		cadena = entrada.nextLine();
		entrada.close();
		if (Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La primera letra es may�scula.");
        } else {
            System.out.println("La primera letra no es may�scula.");
        }
	}//fin main

}//fin class
