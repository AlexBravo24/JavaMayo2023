package com;

import java.util.Scanner;

public class Ejercicio5_JHC {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		int nota;
		int edad;
		String sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos del usuario
		System.out.println("Este programa calcula la aceptacion");
		System.out.println("Edad: ");
		edad = entrada.nextInt();
		System.out.println("Nota: ");
		nota = entrada.nextInt(); entrada.nextLine();
		System.out.println("Sexo (M o F): ");
		sexo = entrada.nextLine();
		
		//Operaciones
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("El valor de sexo introducido es incorrecto. \n"
					+ "Reenvie el formulario");
		}else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("Posible");
		}else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }
	}

}
