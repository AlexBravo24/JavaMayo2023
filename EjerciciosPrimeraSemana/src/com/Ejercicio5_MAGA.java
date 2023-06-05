package com;

import java.util.Scanner;

public class Ejercicio5_MAGA {
	public static void main(String[] args) {
		/*
		 * EJERCICIO 5: 
		 * Realiza un programa que calcule la aceptación de una solicitud en base a 
		 * los siguientes parámetros: 
		 * edad, nota y sexo. 
		 * * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * * Otros casos -> NO ACEPTADA.
		 * */
		
		int edad, nota;
		String sexo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- Aceptación de solicitudes ------ ");
		System.out.println("Escribe tu sexo (Hombre - M / Mujer F): ");
		sexo = entrada.nextLine();
		System.out.println("Escribe tu edad");
		edad = entrada.nextInt();
		System.out.println("Escribe tu nota (calificacion): ");
		nota = entrada.nextInt();
		
		sexo = sexo.substring(0, 1);
		
		System.out.println(sexo);
		
		if (nota >= 5 && edad >= 18 &&  sexo.equals("M")) {
			System.out.println("Estado de su solicitud: POSIBLE");
		}else if (nota >= 5 && edad >= 18 &&  sexo.equals("F")) {
			System.out.println("Estado de su solicitud: ACEPTADA");
		}else {
			System.out.println("Estado de su solicitud: NO ACEPTADA");
		}
	}
}
