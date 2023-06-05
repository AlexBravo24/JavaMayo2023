package com;

public class StringMetodos {

	public static void main(String[] args) {
		// Metodos de la Clase String
		
		//Declaramos una variable de tipo string y le asignamos un valor
		
		String cadena = "Hoy es Martes 30 de Mayo de 2023";
		
		// .length() Nos devuelve el tamaño de la cadena en un valor numerico de tipo entero
		
//		System.out.println(cadena.length());
		
		//Al devolverme un valor numerico, con este puedo realizar operaciones
		
//		System.out.println(20+cadena.length());   //syso (20+32)
		
		//isEmpty verifica si la cadena esta vacia
		
//		System.out.println(cadena.isEmpty());
		
		//charAt devuelve el caracter en el indice especidicado
		
//		System.out.println(cadena.charAt(4));
		
		// substring 1.- Nos devuelve una subcadena a partir del indice especificado
		
//		System.out.println(cadena.substring(4));
		
		// substring 2.- Nos devuelve el valor de la cadena a partir de un indice inicial a un final
		
//		System.out.println(cadena.substring(4, 13));
		
		//	toLowercare 3.- convertir la cadena de texto a minuscula
		
//		System.out.println(cadena.toLowerCase());
		
		//toUpperCase 4.- Convertir las cadena de texto a mayusculas
		
//		System.out.println(cadena.toUpperCase());
		
		// equals 5.- (comparar un objeto contra otro si es igual al otro)
		
//		System.out.println(cadena.equals("Hoy es Martes 30 de Mayo de 2023"));
		
		//equalsIgnoreCase 6.- Compara las cadenas de texto ignorando si tiene minusculas y mayusculas
		
//		System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo de 2023"));
		
		//replace 7.- remplaza los caracteres con otros  que especifiquemos
		
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace(" ", "."));

	}

}
