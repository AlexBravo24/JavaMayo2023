package com; //Nombre del paquete

public class TipoDeDatos { //Nombre de la clase y apertura

	public static void main(String [] args) { //Metodo main y apertura
		
		// Comentarios en una sola linea

		
		/* Comentarios de multiples lineas 
		 * de 
		 * multiples 
		 * lineas
		 */
		
		//Para guardar cambios en nuestra clase se realiza con control + s
		
		
		/*Tipos de datos 
		 * Primitivos
		 * Enteros
		 * 
		 */
		
		//Declarar variables sin asignacion de valor, valores enteros
		byte b;
		short s;
		int i;
		long l;
		
		//Asignarle valores a mis varibales porteriormente 
		
		b = 127; //Asignando un valor a mi variable de tipo byte de -128 a 127
		s = 32767; //Asignando un valor a mi variable short (2 bytes de memoria)
		i = 200000000; //Asignando un valor a mi variable int (4 bytes)
		l = 2147483647; //En las variables long, una vez rebasado 
		//el ranog que pueden almacenar las de tipo int, necesitan el sufijo "i"
		//para poder almacenar este valor
		
		//La variable comodin es la de tipo int
		//Puedo declarar variables y asignar su valor inmediatamente 
		
		byte by = 16;
		int i1 = 6000;
		
		/*Tipos de datos primitivos 
		 * Numericos en punto o coma flotante
		 * Nos permiten almacenar valores con punto decimal
		 */
		
		float f = 4000.566f; //Ocupan un espacio de 4 bytes en memoria y necesitan 
		//del sufijo "f"
		double d = 4000.566; //Ocupan un espacio de 8 bytes en momoria 
		
		//La variable comodin de los numeros decimales es la del tipo double
		
		/*Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones 
		//o condiciones y solo admiten valores true o flase
		
		
		char caracter = 'a'; //Solo admiten un caracter y ocupan una memoria 
		// 2 bytes y se asignan entre comillas simples
		
		/*Tipos de datos estructurados
		 * Tipos de datos objeto 
		 * 
		 * Tipos de datos envoltorio o wrapper 
		 */
		
		Byte b1 = 127;
		Short s1 = 1000;
		Integer in1 = 200000000;
		Long l3 = 400000000000l;
		
		//Añaden metodos a nuestras variables, permitiendonos aplicarlos 
			//en caso que se necesiten
		
		//Tipo de dato estructurado 
		
		//Cadena de texto
		
		String cadena = "Esto es una cadena de texto.";
		
		String nombre;
		
		nombre = "Alejandro";
		
		nombre = "Jorge Alejandro";
		
		String nombre1 = "Alejandro ";
		String nombre2 = "Jorge Alejandro";
		String nombre3 = "Jonathan";
		
		String apellidos = "Hernandez Cruz";
		
		
		//Imprimir en consola o mostrar datos en ella
		//Atajo para escribir la linea de arriba 
		//syso + ctrl + barra espaciadora
		
		System.out.println(nombre);
		
		System.out.println(nombre1);
		
		System.out.println(nombre2);
		
		System.out.println("El numero buscado es lo siguiente:");
		
		System.out.println(in1);
		
		//Concatenando valores

		System.out.println("El valor de in1 es : " + in1 + " " + nombre + " " + nombre1 + " " + nombre2);
		
		System.out.println("Mi nombre completo es: " + nombre3 + " " + apellidos);
		
		//Imprimir numeros
		System.out.println(1000);
		
		
	} // Cierre del main 
	
} // Cierre de la clase
