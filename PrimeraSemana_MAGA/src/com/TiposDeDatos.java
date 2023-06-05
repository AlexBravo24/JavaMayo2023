package com; // Nombre del paquete

public class TiposDeDatos { //Nombre de la clase
	public static void main(String[] args) { //Metodo main apertura
		
		/*
		 * Comentarios de
		 * varias lineas
		 * */
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 * */
		
		//Declarar variables sin asignación
		byte b;
		short s;
		int i;
		long l;
		float f;
		
		
		//Asignarles valores posteriormente
		b = 127; //Rango -128 a 127 1 byte de memoria
		s = 32767; // 2 bytes de memoria
		i = 1255454; //4 bytes de almacenamiento
		l = 79829798713323l; // 6 bytes de almacenamiento se requiere poner l minuscula para almacenar el valor
		
		
		//La variable int es como un comodin
		
		byte by = 16;
		int il = 6000;
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * Nos permiten almacenar valores con punto flotante
		 * */
		f = 4000.56f; //4 Bytes en memoria y requieren sufijo f
		double d = 13455.55;//8 bytes en memoria
		
		//El comodin es tipo double
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CHARACTER
		 * */
		
		boolean boo = true; //Facilitan la evaluacion de deciciones
		char caracter = 'a'; //Solo se puede almacenar una sola letra o un simbolo o espacio
							// Se asignan entre comillas simples
		
		
		/*TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * 
		 * 
		 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
		 * ESTOS SON CLASES QUE TIENEN METODOS
		 * */
		
		Byte b1 = 126;
		Short s1 = 1000;
		Integer i1 = 656565;
		Long l2 = 454456l;
		
		//Tipo de dato estructurado u objeto
		//Cadena de texto
		
		String cadena = "Esto es una cadena de texto";
		String nombre;
		
		nombre = "Marco Alberto";
		String apellidos = "Garcia Aviles";
		
		System.out.println(nombre);
		
		System.out.println(apellidos);
		
		System.out.println(i1);
		System.out.println("Mi nombre completo es: " + nombre + " " + apellidos);
		
	}// Cierre del main
}
