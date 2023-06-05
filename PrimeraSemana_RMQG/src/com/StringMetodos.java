package com;

public class StringMetodos {

	public static void main(String[] args) {
		// Metodos de la clase String
		//Declaramos una variable de tipo String 
		//y le asignamos un valor
		String cadena = "Hoy es martes 30 de Mayo de 2023";
		//Longitud de cadena
		System.out.println(cadena.length());
		//Está vacía la cadena
		System.out.println(cadena.isEmpty());
		//Devolver el caracter en una pos definida
		System.out.println(cadena.charAt(1));
		//Devolver una parte de la cadena
		System.out.println(cadena.substring(4, 10));
		//Convertir a lower case
		System.out.println(cadena.toLowerCase());
		//Convertir a Upper case
		System.out.println(cadena.toUpperCase());
		//Comparar cadenas
		System.out.println(cadena.equals("Hoy es martes 30 de mayo de 2023"));
		//Comparar cadenas ignorando mayusculas/minusculas
		System.out.println(cadena.equalsIgnoreCase("Hoy es martes 30 de mayo de 2023"));
		//Reemplazar caracteres dentro de la cadena
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace(" ", ""));
	}

}
