package com;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos variable tipo String
		//asigna valor
		
		String cadena = "Hoy es Martes 30 de Mayo de 2023";
		
		//.length () Nos devuelve el tamaño de la cadena en 
		// un valor numerico de tipo entero
		System.out.println(cadena.length());
		
		//Al devolver el valor numerico , se puede realizar operaciones
		System.out.println(20+cadena.length());
		//syso(20+26)
		
		//isEmpty verifica si la cadena esta vacia
		System.out.println(cadena.isEmpty());
		
		//charAt devuelve el caracter en el indice especificado
		System.out.println(cadena.charAt(0));
		
		//substring: Nos devuelve una subcadena a partir del indice especificado
		System.out.println(cadena.substring(3));
		
		// substring: Nos devuelve valor de cadena a partir de un indice inicial y final
		
		System.out.println(cadena.substring(4,10));
		
		//toLowerCase: convertir la cadena de texto a minuscula
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase:Convierte la cadena de texto en Mayuscula
		System.out.println(cadena.toUpperCase());
		
		//equals: compara texto contra otro
		System.out.println(cadena.equals("Hoy es Martes 30 de Mayo de 2023"));
		
		//equalsIgnoreCase: Compara cadenas ignorando mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo de 2023"));
		
		//replace: reemplaza caracteres con otros que especifiquemos
		System.out.println(cadena.replace("e","x"));
		System.out.println(cadena.replace(" ", ""));
		
	

	}

}
