package com;

public class StringMetodos {
	public static void main(String[] args) {
		//Metodos de la clase String
		
		String cadena = "Hoy es martes 30 de Mayo de 2023";
		
		//lenght() Nos devuelve el tamño de la cadena en un valor numerico
		System.out.println("La longitud de la cadena es: " + cadena.length());
		
		//isEmpty Verifica que la cadena no esta vacía
		System.out.println(cadena.isEmpty());
		
		
		//CharAt Devuelve el caracter en el indice especificado
		System.out.println("El caracter de la posicion 3 es: " + cadena.charAt(4));
		
		//substring Permite extraer una cadena de texto
		System.out.println(cadena.substring(4));
		
		//substring Permite devolver una cadena de una posicion a otra
		System.out.println(cadena.substring(4, 6));
		
		//toLowerCase - Permite pasar a minusculas toda la cadena
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase - Permite pasar a mayusculas toda la cadena
		System.out.println(cadena.toUpperCase());
		
		//equals - Comparar si una cadena es igual a otra
		System.out.println(cadena.equals("Hoy es Martes 30 de Mayo de 2023"));
		
		//equalsIgnore - Comparar si una cadena es igual a otra sin importar mayusculas
		System.out.println(cadena.equalsIgnoreCase("Hoy es Martes 30 de Mayo de 2023"));
		
		//replace - Reemplaza los caracteres de una cadena por otro
		System.out.println(cadena.replace("e", "x"));
		
		System.out.println(cadena.replace(" ", ""));
	}
}
