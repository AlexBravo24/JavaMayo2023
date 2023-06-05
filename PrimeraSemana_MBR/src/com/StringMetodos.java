package com;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//metodos de la clase String
		
		//Declaramos una variable de tipo string y le 
		//asignamos  un valor 
		String cadena = "Hoy es Martes 30 de Mayo de 2023";
		
		
		//.length () nos devuelve el tamaño de la cadena en
		//un valor numerico 
		System.out.println(cadena.length());
		
		//Al devolverme un valor numerico con este puedo realizra operaciones 
		System.out.println(20+cadena.length());
		//syso(20+32)
		
		//isEmpty verifica si la cadena esta vacia
		System.out.println(cadena.isEmpty());
		
		
		//charAt devuelve el caracter en el indice especificado
		System.out.println(cadena.charAt(0));
		
		//substring 1 metodo: nos devuelve una sucadena a partir de indice especificado
		System.out.println(cadena.substring(3));
		//2 metodo. nos devuelva el valor de la cadena a partir de un indice inicial y uno final
		System.out.println(cadena.substring(4,10));
		
		System.out.println(cadena.substring(0,cadena.length())); //se imprime desde el primer caracter  por substracting y hasta el el ultimo caracter por que leght da el numro ultimo
		
		
		//toLowerCase- convierte la cadena de texto a minuscula
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase- Convierte la cvadena de texto a mayusculas
		System.out.println(cadena.toUpperCase());
		
		//equals (comparar un objeto contra otro)
		//Comparar si una cadena de texto es igual a otra
		System.out.println(cadena.equals("Hoy es Martes 30 de Mayo de 2023"));
		
		//equalsIgnoreCase(compara las cadenas de texto ignorando si tiene mayusculas o minusculas)
		System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo de 2023"));
		
		//replace reemplazar los caracteres con otros que especifiquemos
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace(" ", ""));
	
	}

}
