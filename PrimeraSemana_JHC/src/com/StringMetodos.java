package com;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Declaramos una variable de tipo String y le
			//asignamos un valor 
		
			String cadena = ("Hoy es Martes 30 de mayo de 2023");
			
			//length nos devuelve el tamaño de la cadena en un 
			//valor numerico de tipo entero
			System.out.println(cadena.length());
			
			//Al devolverme un valor numerico, con este puedo realizar
			//operaciones 
			
			System.out.println(20 + cadena.length());
			//syso (0 + 32)
			
			//isEmpty verifica si la cadena esta vacia
			System.out.println(cadena.isEmpty());
			
			//charAt devuelve un caracter en el indice especificado
			System.out.println(cadena.charAt(1));
			
			//substring - nos devuelve una subcadena a partir
			//del indice especificado
			
			System.out.println(cadena.substring(3));
			
			//substring - nos devuelve el valor de la cadena 
			//a partir de un indice inicial y uno final 
			System.out.println(cadena.substring(4, 10));
			
			//toloWerCase - convertir cadenas de texto a minusculas
			System.out.println(cadena.toLowerCase());
			
			//toUpperCase - convertir la cadena de texto a mayusculas
			System.out.println(cadena.toUpperCase());
			
			//equals (comparar un objeto contra otro)
			//comparar si una cadena de texto es igual a otra
			
			System.out.println(cadena.equals("Hoy es martes 30 de mayo de 2023"));
			
			
			//equalsIngoreCase (Compara las cadenas de texto ignorando
			//si tiene mayusculas y minusculas
			System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo de 2023"));
			
			
			//replace - reemplazar los caracteres con otros que especifiquemos
			System.out.println(cadena.replace("e", "x" ));
			System.out.println(cadena.replace(" ",""));
	}

}
