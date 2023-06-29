package com;

import java.util.Scanner;

public class Ejercicio5_YAAH {
	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		
		int edad;
		int nota;
		String sexo;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Introduce tu sexo (F/M): ");
		sexo = valores.nextLine();
		
		System.out.println("Introduce tu edad: ");
		edad = valores.nextInt();
		
		System.out.println("Introduce tu nota: ");
		nota = valores.nextInt();
		
		if( edad >=18 && nota >= 5 && sexo.equals("M") ) {
			System.out.println("Su solicitud es POSIBLE");
		}else if( edad >=18 && nota >= 5 && sexo.equals("F") ) {
			System.out.println("Su solicitud es ACEPTADA");
		}else {
			System.out.println("Su solicitud NO ES ACEPTADA");
			
		}
		
		
		 
//		        Scanner scanner = new Scanner(System.in);
//
//		        System.out.print("Introduce tu género (Hombre/Mujer): ");
//		        String genero = scanner.nextLine();
//
//		        if (genero.equalsIgnoreCase("hombre")) {
//		            System.out.println("Has seleccionado Hombre.");
//		        } else if (genero.equalsIgnoreCase("mujer")) {
//		            System.out.println("Has seleccionado Mujer.");
//		        } else {
//		            System.out.println("Género no válido.");
//		        }
		
	}

}
