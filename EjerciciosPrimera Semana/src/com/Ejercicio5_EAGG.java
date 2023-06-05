package com;

import java.util.Scanner;

public class Ejercicio5_EAGG {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación
		// de una solicitud con base a los siguientes parámetros:
		// edad, nota y sexo.
		// * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		// * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		// * Otros casos -> NO ACEPTADA

		int edad;
		int nota;
		String sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu nota");
		nota = entrada.nextInt();
		
		System.out.println("Introduce tu sexo M o F");
		sexo = entrada.next();
		
	   
	    if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }
	  
		
	}

}

