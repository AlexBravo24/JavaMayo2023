package com;

public class StringMetodos {

	public static void main(String[] args) {
		// Mmetodos de la clase String
		
		//Declaramos una variable de tipo String
		//asignamos un valor
		
		String cadena = "Hoy es Martes 30 de Mayo de 2023";
		System.out.println(20+cadena.length());
		//Syso(20+32
		
		//isEmpty verifica si la cadena esta vacia
		System.out.println(cadena.isEmpty());
		
		//charAt devuelve el caracter en el indice epecifico
		System.out.println(cadena.charAt(1));
		
		//substring - nos devuelve una subcadena apartir 
		//del indice especificado
		System.out.println(cadena.substring(3));
		
		//substring - nos devuelve el valor de la cadena 
		//apartir de un indice inicial y uno final
		System.out.println(cadena.substring(4,10));
		
		//ToLowerCase -convertit la cadena de texto a minusculas
		System.out.println(cadena.toLowerCase());
		
		//toLoweCaae - convertir la cadena de texto a mayusculas
		System.out.println(cadena.toUpperCase());
		
		//equals (compara un objeto contra otro)
		//comparar si una cadena de texto es igual a otra
		System.out.println(cadena.equals("HOY ES MARTES 30 DE MAYO DE 2023"));
		
		//equalsIgnoreCase (compara las cadenas de texto ignorando
		//si tiene mayusculas o minusculas)
		System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo de 2023"));
		
		//remplace - reemplazar los caracteres con otros que especificamente 
		System.out.println(cadena.replace("e","x"));
		System.out.println(cadena.replace(" ", ""));
	}

}
