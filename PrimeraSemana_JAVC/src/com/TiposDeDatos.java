package com; //Nombre del paquete

public class TiposDeDatos {  //Nombre de la clase y apertura
	
	public static void main(String[] args) { //Metodo main y apertura
		
		//Comentarios de una sola linea 
		
		/*Comentarios
		 * en
		 * multiples
		 * lineas
		 */
		
		//Para guardar cambios en la clase se realiza con Crtl + s
		
		/* TIPOS DE DATOS
		 * PRIMITIVOS
		 * NUMERICO ENTEROS
		 */
	
		
		// Declarar variables sin asignacion de valor
		
		byte b; 
		
		short s;
		
		int i; 
		
		long l; 
		
		//Asignacion de valores a mis variables
		
		b = 127; 
		
		s = 32767; 
		
		i = 2000000000;
		
		l = 85466521215565945l;
		
		
		//La variable comodin sera int
		
		//Puedo declarar variables y asignar su valor inmediatamente
		
		
    	byte by = 16;
		int i1 = 6000;
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICCOS EN PUNTO O COMA FLOTANTE
		 * NO PERMITEN ALMACENAR VALORES CON PUNTO DECIMAL
		 */
				
		float f = 4000.566f;  //Ocupan un espacio de 4 bytes en memoria y necesitan el sulfijo f
		
		double d = 13455.586; //Ocupa un espacio de 8 bytes en memoria
		
		
		//Variable comodin de los numeros decimales es la tipo double
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar
		
		char caracter = 'a'; //Solo admiten un caracter y ocupan una memoria de 2 bytes y se asignan entre comillas 
		
		
		
		
/*TIPOS DE DATOS ESTRUCTURADOS
 * TIPOS DE DATOS OBJETO
 * 
 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
 */
		
	Byte b1 = 127; 
	Short s1 = 1000; 
	Integer i2 = 20000000; 
	Long l3 = 40000000000000l;
	
  //Añaden metodos a nuestra variable, permitiendonos aplicarlos en caso de que se necesiten
	
	//Tipos de datos Estructurados u Objeto
	
	//Cadena de Texto
	
  String cadena = "Esto es una cadena de texto.";
  
  String nombre;
  
  nombre = "Alejandro";
  
  nombre = "Jorge Alejandro";
  
//  nombre = "Jose";
  
  String nombre1 = "Alejandro";
  String nombre2 = "Jorge Alejandro";
  
  String apellidos = " Bravo Ramires ";
  
  
  //Imprimir en consolo o mostrar Datos
  
  System.out.println(nombre);
  
  //Atajo para escribir la instruccion de impresion en consola
  //syso + ctrl estacio
  // Ctrl + barra espaciadora
  // Ctrl + espacio
  
  System.out.println(nombre1);
  System.err.println(nombre2);
  
  
  System.out.println(i2);
  
  //Concatenando valores
  
  System.out.println("Mi nombre completo es: " + nombre2 + "" + apellidos);
  
  //Imprimir Numeros
  
  System.out.println(1000);
 	
		
		
		
	} //Cierre del main

} // Cierre de la clase
