package com;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Metodos de la clase String
		
		//Declaramos una variable de tipo String y le
		//asignamos un valor
		
		String cadena = "Hoy es 30 de Mayo De 2023" ;
		//.length() nos devuelve el tamaño de la cadena
		//un valor numerico de tipo entero
		System.out.println(cadena.length());
		
		//Al devolverme un valor numerico, con este puedo realizar operaciones 
		System.out.println(20+cadena.length());
		
		//isEmpty verifica si la cadena esta vacía
		System.out.println(cadena.isEmpty());
		
		//charAt devuelve el caracter en el indice especificado
		System.out.println(cadena.charAt(2));
		
		//substring - nos devuelve una subcadena a partir 
		//del indice especificado
		System.out.println(cadena.substring(3));
		
		//substring - nos devuelve el valor de la cadena
		//a partir de un indice inicial y uno final
		System.out.println(cadena.substring(4, 10));
		
		//toLowerCase - convertir la cadena a minusculas
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase - convertir toda la cadena a mayusculas
		System.out.println(cadena.toUpperCase());
		
		//equals - comparar un objeto contra otro
		// comparar si una cadena de texto 
		System.out.println(cadena.equals("Hoy es mayo"));
		
		//equalsIgnoreCase - compara las cadenas de texto ignorado
		//si tiene mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 30 de mayo De 2023"));
		
		//replace - reemplazar los caracteres con otros con otros que especifiquemos
		System.out.println(cadena.replace("y", "f"));
	}

}
