package com; //Nombre Del paquete

public class TipoDeDatos { //Nombre de la clase y apertura

	public static void main(String[] args) { //Método main
		
		//Comentarios de una sola linea
		
		/*comentarios 
		 * de multiples
		 * lines
		 */
		/*
		 * Iipos de datos
		 * primitivos
		 * Numericos enteros
		 */
		
		
		//Declarar variable sin asignación de valor
		
		byte b;
		short s;
		int i;
		long l;
		// puedo asignarle a mis valores posteriormente
		b = 127; //asignando un valor a mi variable de tipo byte de -128 a 127
		s = 32767; //asignando un valor a mivariable short (2 bytes de memoria)
		i = 200000000; //asigando un valor a mi variable int (4 bytes)
		l = 2147483689999l; //en la variables long, una vez rebasado el rango que pueda almacenar las de tipo log
		//necesita un sufijo (l) para poder almacenar ese valor
		
		// la variable comidn es la de tipo INT
		//puedo declarar variables y asiganrles su valor inmediatamente
		byte by = 16; 
		int il= 6000;
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * nos permite almacenar valoes con punto decimal
		 */
		
		float f = 4000.566f; //ocupan un espacio de 4 bytesen memoria y necesitan
		//del sufijo
		double d = 13455.586; //ocupa un espacio de 8 bytes en memoria 
		
		//la variable comodin de los numeros decimales es la tipo double
		
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //facilitan el trabajo al evaluar expresines
		//o condiciones y solo admiten valores true or false
		
		char caracter = 'a'; //solo admiten un caracter, oucupa un memoria de 2 bytes
		//y se asigna entre comillas simples 
		
		
		/*TIPOS DE DATOS ESTRUTURADOS
		 * TIPOS DE DATOS OBJETO
		 * 
		 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
		 * 
		 */
		
		
		Byte b1 = 127; 
		Short s1 = 1000;
		Integer i1 = 20000000;
		Long l3 = 4000000000000l;
		
		//añaden metodos a nuetras variables, permitiendolos aplicarlos
		//en caso de que se necesitan
		
		/*
		 * tipos de datos estructuados u objeto
		 * cadena de texto
		 */
		
		
		String cadena ="Esto es una cadena de text";
		
		String nombre;
		nombre = "ALFONSO";
		String nombre1 = "Alejandro";
		String nombre2 = "paola";
		String apellidos;
		apellidos = "Venancio García";
		
		
		//imprimir en consola
		
		System.out.println(nombre);
		//atajo para imprimir la intruccion en consola
		//CTRL + BARRA ESPACIADORA
		//CTRL + ESPACIO
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		System.out.println(i1);
		
		
		//concatenando valores
		
		System.out.println("el valor de i1 es: "+ i1 + " "+ nombre1);
		System.out.println("Mi nombre complero es: " + nombre +" "+ apellidos);
	} //Cierre del main
} //Cierre de la clase
