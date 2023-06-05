package com;

public class StringMetodos {

	public static void main(String[] args) {
		
		//Metodos de la clase string
		
		String cadena= "Hoy es martes 30 de mayo del 2023";
		//length - devuelve la longitud de la cadena de tipo entero
		System.out.println(cadena.length());
		//is empty solo devuelve true o false si tiene o no caracteres
		System.out.println(cadena.isEmpty());
		// charAt devuelve el caracter segun su indice
		//hoy es--- caracter 0 h caracter 1 es 0 
		System.out.println(cadena.charAt(1));
		// index of devuelve posicion ( un numero) de a cuerdo a la letra que le pasemos 
		System.out.println(cadena.indexOf("o"));
		//substring con un solo parametro empieza desde el indice que le demos 
		System.out.println(cadena.substring(3));
		//substring con dos parametros te indica de donde a donde tomarlo 
		
		System.out.println(cadena.substring(3, 6));
		//Uppercase devuelve letras mayusculas
		
		System.out.println(cadena.toUpperCase());
		//lower case todas minusculas
		String cadenaEnMayusculas = "ESTA CADENA ESTA EN MAYUSCULAS";  
		System.out.println(cadenaEnMayusculas.toLowerCase());
		//. equals compara cadenas y devuelve true o false
		System.out.println(cadena.equals("Hoy es martes 30 de mayo del 2023"));
		
		//concat concatena lo que le digamos
		System.out.println(cadena.concat("Mentiraaaaaaaaa"));
		
		//replace cambia el anterior por el nuevo caracter
		
		
		System.out.println(cadena.replace("H", " h" ));
	}

}
