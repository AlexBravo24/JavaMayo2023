package com;

import java.util.Scanner;

public class Ejercicio5_AVG {

	public static void main(String[] args) {
		// . Realiza un programa que calcule la aceptación 
		//de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//Otros casos -> NO ACEPTADA

		Scanner entrada = new Scanner (System.in);
		
		int solicitud;
		int base;
		System.out.println("calcule la aceptacion");
		System.out.println("introduce el número");
		solicitud = entrada.nextInt();
		System.out.println("Introduce la solicitud");
		base = entrada.nextInt();
		
		if (base >= 1) {
		      System.out.println("El resultado es " + (Math.pow(solicitud, base)));
		    }else if (base == 0) {
		       System.out.println("El resultado es 1.");
		    }else {
		        System.out.println("El resultado es " + (Math.pow(solicitud, 1/base)));
		    }
		
	}

}
