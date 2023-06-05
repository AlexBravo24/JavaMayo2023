package com;

public class StringMetodos {

	public static void main(String[] args) {
		// M�todos de la clase String
		
		//Declaramos una variable de tipo String y le asignamos valor
		
		String cadena = "Hoy es Martes 30 de Mayo de 2023";

		//.length() Nos devuelve el tama�o de la cadena 
		//en un valor num�rico de tipo entero
		
		System.out.println(cadena.length());
		
		//Al devolverle un valor num�rico, con �ste puedo realizar operaciones
		
		System.out.println(20+cadena.length());
		//syso (20+32)
		
		
		
		//isEmpty verifica si la cadena est� vac�a
		System.out.println(cadena.isEmpty());
		
		//charAt devuelve el caracter en el �ndice especificado
		
		System.out.println(cadena.charAt(4));
		
		//substring = nos devuelve una subcadena a partir 
		// del �ndice especificado
		
		System.out.println(cadena.substring(3));
		
		//substring = nos devuelva el valor de la cadena
		// a partir de un �ndice inicial y uno final
		
		System.out.println(cadena.substring(4, 10));
		
		//toLowerCase - convertir la cadena de texto en min�sculas
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase - convertir la cadena de texto en mayusculas
		System.out.println(cadena.toUpperCase());
		
		//equals (Comparar un objeto contra otro)
		//Comparar si una cadena de texto es igual a otra
		System.out.println(cadena.equals("Hoy es Martes 30 de Mayo de 2023"));
		
		//equalsIgnoreCase (Compara las cadenas de texto ignorando
		//si tiene may�sculas o min�sculas
		System.out.println(cadena.equalsIgnoreCase("Hoy es martes 30 de MAYO de 2023"));
		
		//replace = reemplazar los caracteres con otros que especifiquemos
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace(" ", ""));
		
		
		
		
		
		
		
	}

}
