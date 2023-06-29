package com;

public class TiposDeDatos {
	public static void main(String[] args) {
	
		
		byte b;
		short s;
		int i;
		long L;
		
		
		b = 17;     //asignando un valor a mi variable byte de -128 a 127
		s = 32767;   //asignando un valor a mi variable short (2 bites de memoria)
		i = 2147483647; // asignando un valor a mi variable int (4 bytes)		
		L = 21478365999990l; //en las variables long, una ves rebasado el rango que pueden almacenar las de tipo int,
		//es necesario el sufijo " l" para poder almacenar ese valor
		
		//la variable comodin o la que mas se utiliza es de tipo int
		//puedo declarar variables y asignar su valor inmediatamente 
		
		byte by =16;
		int il =6000;
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * NOS PERMITE ALMACENAR VALORES CON PUNTO DECIMAL
		 */
		
		float f =4000.566f; //OCUPAN UN ESPACIO DE 4 BITES EN MEMORIA Y NECESITA EL SUFIJO "F"
		double d = 13455.586; // OCUPAN UN ESPACIO DE 8 BITES EN MEMORIA 
		
		//LA VARIABLE COMODIN DE LOS NUMEROS DECIMALES ES DE TIPO "double"
		
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * BOOLEANOS
		 * CARACTER
		 */
		
		
		boolean boo = true;  // FACILITAN EL TRABAJO AL EVALUAR EXPRESIONES O CONDICIONES Y SOLO ADMITEN VALORES "TRUE O FALSE"
		char caracter = 'a'; // SOLO ADMITEN UN CARACTER, Y OCUPAN UNA MEMORIA DE 2 BYTES Y SE ASIGNAN ENTRE COMILLA SIMPLE ' '
		
		
		//TIPOS DE DATOS ESTRUCTURADOS 
		
		//TIPOS DE DATOS ENVOLTORIO O WRAPPER
	
		Byte b1= 127;
		Short s1 =1000; 
		Integer i2 = 20000000;
		Long l3 =400000000000l;
		
		//AÑADEN METODOS A NUESTRAS VARIABLES, PERMINIENDONOS APLICARLOS EN EL CASO QUE SE NECESITEN 
		
		
		
		/* TIPO DE DATO ESTRUCTURADO U OBJETO
		 * 
		 * CADENA DE TEXTO
		 */
		
		String cadena  = "esto es una cadena de texto"; 
		String nombre; 
		
		nombre = "alejandro"; 
		nombre = "jorge alejandro";
		
		//IMPRIMIR EN CONSOLA O MOSTRAR DATOS EN ELLA 
		
		
		System.out.println(nombre);
		
		//ATAJO PARA ESCRIBIR LA INSTRUCCION DE IMPRESION EN CONSOLA ES "SYSO + CTRL + ESPACIO"
		 
		// PARA STRING LA PRIMERA LETRA ES MAYUSCULA 
		
		
		
		
		
		String nombre1 = "alejandro";
		
		String nombre2 = "jorge alejandro";
		
		System.out.println(nombre);
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		//CONCATENAR VALORES
		
        System.out.println("el numero contenido en i2 es " + i2 + " "+ b1 + " "+ nombre);
        
		
		
		
		
				
				
				
				
		
		
	
	
		
		
	} 
}


