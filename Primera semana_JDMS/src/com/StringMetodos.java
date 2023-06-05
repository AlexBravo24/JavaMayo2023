package com;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//METODOS DE CLASE STRING
		//Se declara una variable y se inicializa
		String cadena="Hoy es martes 30 de Mayo del 2023";
		String vacio=null;
		//.lengh() Nos devuelve el tamaño de la cadena en un valor tipo entero
		System.out.println(cadena.length());
		
		//Al devolver un valor numerico con  este puedo  realizar operaciones
		System.out.println(20+cadena.length());
		//isEmty ver si la cadena esta vacia y retorna un valor boolean
		System.out.println(cadena.isEmpty());
		//System.out.println(vacio.isEmpty());
		
		System.out.println(cadena.charAt(0));
		//Te imprime el numero  del caracter
		
		//Substring nos devulve una subcadena despues de posicion
		System.out.println(cadena.substring(3));
		
		//Nos devuelva el  valor de cadena apartir del indice final  e inicial
		System.out.println(cadena.substring(4,10));
		
		//toloweCase  convierte todo a minuscula
		System.out.println(cadena.toLowerCase());
		
		//toUppeCase  convierte todo a MAYUSCULAS
		System.out.println(cadena.toUpperCase());
		
		//equals Nos permite comparar 2 cadenas y saber si son iguales
		System.out.println(cadena.equals("Hoy es martes 30 de Mayo del 2023"));
        
		//equalsIgnoreCase compara cadenas ignorando  si son  mayusculas y minisculas
		System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo del 2023"));
	    
		//Remplazar los caractes con otros que se espera
		System.out.println(cadena.replace("e", "x"));
		
		//reemplaza espacios por vacios
		System.out.println(cadena.replace(" ", ""));
	}
	
	

}
