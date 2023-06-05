package com;

public class TiposDeDatos { // Nombre de la clase y apertura
	
	public static void main(String[] args) { // Metodo main y su apertura
		
		// Comentarios de una sola linea
		
		/*
		 * Comentarios de varias lineas
		 * 
		 */
		
		/*Tipos de Datos
		 * 
		 * Primitivos
		 * Numericos enteros
		 * 
		 */
		
		//Declaracion de variables sin asignacion de valor
		
		byte b;
		short s;
		int i;
		long l;
		
		// Asignar valores a las variables posteriormente
		
		b = 127; // Asignando un valor a la variable de tipo byte de -128 a 127  (1 bytes).
		s = 32767; // Asignando un valor a mi valor short (2 bytes de memoria).
		i = 2147483647; //Asignando un valor a mi variable int (4 bytes)
		l = 2147483648l; // En las variables long una vez rebasado el rango que puede
		// almacenar las de tipo int, necesitan el sufijo "l"  
		// para poder almacenar ese valor.
		
		// La variable comodin es la de tipo int
		// Puedo declarar  variables y asignar su valor inmediatamente
		
		byte by = 16;
		int il = 6000;
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS EN PUNTO O COMA FLOTANTE
		 * Nos permiten almacenar valores con punto decimal
		 */
		
		float f = 4000.566f; // Ocupan un espacio de 4 btes en memoria y nescecitan del 
		// sufijo "f"
		double d = 13455.586; // Ocupa un espacio de 8 bytes en memoria
		
		// La variable de comodin de los números decimales es la de tipo double
		
		
		/* TIPOS DE DATOS PRIMITIVOS
		BOOLEANOS
		CARACTER
		*/
	
		boolean boo = true; // Facilitan el trabajo al evaluar expresiones 
		// o condiciones y solo admiten valores true or false.
		
		char caracter = 'a'; // Solo admiten un caracter, y ocupan una mempria de 
		// 2 bytes y se asignan entre comilla simple
		
		/*TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * 
		 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
		 * 
		 */
		
		Byte b1 = 127;
		Short s1 = 1000;
		Integer i2 = 20000000;
		Long l3 = 4000000000000l;
		
		// Añade metodos a nuestras variables, permitiendonos aplicarlos 
		// en caso de que se nescecite.
		
		// Tipos de dato Estructurado u Objeto.
		
		// Cadena de texto.
		
		String cadena = "Esto es una cadena de texto.";
		
		String nombre;
		
		nombre = "Antonio";
		
		nombre = "Yauri Antonio";
		
		nombre = "Aguirre";
		
		String nombre1 = "Antonio";
		String nombre2 = "Yauri";
		
		// Imprimir en consola o mostrar datos en ella.
		
		System.out.println(nombre);
	    // Atajo para escribir la instruccion de impresion en consola
		// syso + Ctrl + barra espaciadora
		// syso+ Ctrl + espacio
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		System.out.println("El numero contenido en i2 es: ");
		System.out.println(il);
		
		// Concatenando valores
		
		System.out.println("Mi nombre es:  " + nombre2 + " " + nombre1);
		
		
		// Imprimir numeros
		
		System.out.println(1000);
		
		
		
		
		
		
		
;		
	} // Cierre del main
}
 // Cierre de 