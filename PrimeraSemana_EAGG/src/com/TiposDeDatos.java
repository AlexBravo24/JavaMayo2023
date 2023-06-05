package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y apertura
	public static void main(String[] args) { //Médodo main y apertura
		
		//Comentarios de una sóla línea
		
		/*Comentarios
		 * de múltiples
		 * líneas
		 */
		
		//Para guardar cambios en nuestra clase se realiza con Ctrl + S
		
		/*TIPOS DE DATOS
		 * PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Declarar variables sin asignación de valor
		
		byte b;
		short s;
		int i;
		long l;
		
		//Asignarles valores a mis variables posteriormente
		
		b = 127; //Asignando un valor a mi variable de tipo byte de -128 a 128
		s = 32767; //Asignando un valor a mi variable short (2 bytes de memoria)
		i = 200000000; //Asignando un valor a mi variable int (4 bytes)
		l = 2147483650l; //En las variables long, una vez rebasado el rango que pueden almacenar las de tipo int
		//necesitan el sufijo l para poder almacenar ese valor
		
		//la variable comodin es la de tipo int
		//Puedo declarar variables y asignar su valor inmediatamente
		
		byte by = 16;
		int il = 6000;
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 * Nos permite almacenar valores con punto decimal
		 */
		
		float f = 4000.566f; //Ocupan un espacio de 4 bytes en memoria y
		//necesitan el sufijo "f"
		
		double d = 13455.586; //Ocupa un espacio de 8 bytes en memoria
		
		//La variable comodín de los números decimales es la tipo double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 *
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones 
		//o condiciones y sólo admiten valores true o false
		
		char caracter = 'a'; //Solo admiten un caracter, y ocupan una memoria
		//de 2 bytes y se asignan entre comilla simple
		
		
		/*TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * 
		 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
		 */
		
		Byte b1 = 127; 
		Short s1 = 1000;
		Integer i2 = 20000000;
		Long l3= 400000000000l;
		
		//Añaden métodos a nuestras variables, permitiéndonos aplicarlos
		//en caso de que se necesiten
		
		//Tipo de dato Estructurado u Objeto
		
		//Cadena de Texto
		
		String cadena = "Esto es una cadena de texto"; 
		
		
		String nombre;
		
		nombre = "Esmeralda";
		
		nombre = "Esmeralda Anahí";
		
		nombre = "Esmeralda Gaona";
		
		String nombre1 = "Esmeralda";
		String nombre2 = "Esmeralda Gaona";
		String apellidos = "Gaona García";
		
		//Imprimir en consola o mostrar datos en ella
		
		System.out.println(nombre);
		
		//Atajo para escribir la instrucción de impresión en consola cyso
		//syso +
		// Ctrl + barra espaciadora
		// Ctrl + espacio
		
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		System.out.println("El número contenido en i2 es:");
		System.out.println(i2);
		
		//Concatenando valores
		
		System.out.println("El valor de i2 es: " + i2);
		
		System.out.println("Mi nombre completo es: " + nombre1 + " " + apellidos);
		
		//Imprimir números sin necesidad de guardarlos como variables, pero es preferible guardarla
		System.out.println(1000);
		
		
		
		
		
		
		
		
		
		
	} //Cierre del main
} //Cierre pero de la clase
