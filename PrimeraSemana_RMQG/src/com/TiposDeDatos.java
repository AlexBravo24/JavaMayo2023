package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y aperturta
	public static void main(String[] args) { //Metodo main y aaertura
		
		//Comentarios de una solo línea
		/*
		 * Multi comments
		 * Tipo de datos
		 * Primitivos
		 * Numéricos enteros
		 * 
		 */
		//Declarar variables sin asignación de datos
		
		byte b;
		short s;
		int i;
		long l;
		
		//Asignarles valor posteriormente
		b = -128; //Asignando un valor a mi variable de -1328 a 127
		s = 32767; //Asignando un valor a mi variable short desde -32.768 hasta 32.767
		i = 200000000; //Asignando un valor a mi variable int
		l = 21474836599990l; //Para almacenar un valor superior a int hay que agregar una L minuscula al final
							 // (un sufijo) 
		//La variable comodín es de tipo int
		//Puedo declarar variables y asignarles valor en un solo paso
		byte by = 16;
		int i1 = 6000;
		/*
		 * Tipos de datos primitivos
		 * numéricos en punto o coma flotante
		 * Nos permiten asignar valores con punto decimal
		 * 
		 */
		float f = 4000.566f; //Ocupan 4 bytes de memoria y requieren el sufijo f minúscula
		double d = 13455.586; //Ocupa 8 bytes
		//La variable comodín para números decimales es la double
		
		/*Tipos de datos primitivos 
		 * Booleanos
		 * Caracter
		 * 
		 */
		boolean boo = true; //True o false
		char letra = 'a'; //Sólo admiten un caracter y ocupan 2 bytes. Se asignan con comilla simple (no doble)
		
		/*Tipos de datos estructurados
		 * Tipos de datos tipo objetoTipos de datos envoltorio a wrapper
		 * 
		 */
		
		Byte b1 = 127;
		Short s1 = 1000;
		Integer i2 = 20000000;
		Long l3 = 4000000000000l;
		//Añaden métodos a nuestras variables permitiendonos aplicarlos de ser necesario
		
		//Tipo de dsato estructurado u objecto
		//Cadena de texto
		
		String cadena = "My note";
		String nombre;
		nombre = "Rafa";
		String nombre2 = "Rafael Mauricio";
		String apellidos = "Queb Galicia";

		//Imprimir en consola o mostrar info dentro de ella
		//Atajo para escribir en consola
		//syso + Ctrl + barra espaciadora
		System.out.println(nombre);
		System.out.println(cadena);
		System.out.println("El valor de i2 es: " + i2);
		System.out.println("Mi nombre completo es: "+ nombre2 + " " + apellidos);
	} //Cierre del main

} //Cierre de la clase