package com; //Nombre del paquete

public class TiposDeDatos { //nombre de la clase y apertura
	
public static void main(String[] args) {//Metodo main y apertura
	//Comentarios de una sola linea con doble diagonal
	/*Comentarios de multiples lineas
	 * una
	 */ //cierre de comentarios multi linea
	
	//Para guardar cambios presionamos Ctrl + s
	
	/*
	 * Tipos de datos
	 * Primitivos
	 * Numéricos enteros
	 */
	//Declarar variables sin asignacion de valor
	byte b;
	short s;
	int i;
	long l;
	//Se puede asignar valores posteriormente
	
	b = 127; //Asignando un valor a mi variable de tipo byte de -128 a 127
	s = 32767; //asignando un valor a mi variable short (2 bytes de memoria)
	i = 200000000; //Asignando un valor a mi variable int (4 bytes)
	l = 21474836599990l; //En las variables long, una vez rebasando 
	//el rango que pueden almacenar las variables int, necesitan el sufijo "l"
	//para poder almacenar ese valor
	
	// La variable comodin es la tipo int
	
	//Puedo declarar variables y asignar su valor inmediatamente
	
	byte by = 16;
	int il = 6000;
	
	/*Tipos de datos primitivos
	 * Numéricos en punto flotante
	 * Nos permite almacenar valores con punto decimal
	 * 
	 */
	float f = 4000.566f;//Ocupa un espacio de 4 byts de memoria y necesita
	//del sufijo "f"
	double d = 1345.586; //ocupa un espacio de memoria de 8 bytes esta 
	//variable es  el comodin de las variables con punto desimal
	
	/*Tipos de datos primotivos
	 * Booleanos
	 * Caracter
	 * 
	 */
	
	boolean boo = true; // Facilitan el trabajo al evaluar esxpreciones
	// o condiciones y solo admiten  valores true or falce
	
	char caracter = 'a'; //Solo admiten un caracter, y ocupan una memoria de 
	//2 bytes y se asigna entre commillas simples
	
	/*Tipos de datos estructurados
	 * Tipos de datos objeto
	 * 
	 * Tipos de datos envoltorio o wrapper
	 * 
	 * 
	 */
	
	    Byte b1 = 127;
	    Short s1 = 1000;
	    Integer i2 = 20000000;
	    Long l3 = 400000000000l;
	    
	    //Añaden métodos a nuestras variables permitiendo aplicarlos
	    //en caso de que se necesiten
	    
	    //Tipo de dato Estructurado
	     //Cadena de texto
	    
	    String cadena = "Esto es una cadena de texto.";
	    
	    String nombre;
	    
	    nombre = "Benigno ";
	    
	    String nombre2 = "Contreras ";
	    String nombre3 = "Altamirano ";
	    System.out.println(nombre+ nombre2+ nombre3);
	    
	    //Imprimir en consola o mostrar datos en ella
	    
	    System.out.println(nombre+ nombre2+ nombre3); 
	    
	    //syso, Ctrl + Espacio atajo para escribir instruccion de imprimir en consola
	    
	    //concatenando valores
	    
	    System.out.println("El valor de i2 es "+ i2);
	    
	    
	    //charAt devuelve el caracter en el idice espesificado
	    
	    System.out.println(cadena.charAt(3));
	    
	    //substring = nos devuelve una subcadena a partir 
	    // de3l indice especificado
	    System.out.println(cadena.substring(3));
	    System.out.println(cadena.substring(4,10));
	    //toLowerCase = convierte todo a minuscula
	    System.out.println(cadena.toLowerCase());
	  //toUpperCase = convierte todo a mayuscula
	    System.out.println(cadena.toUpperCase());
	    
	    //equals(Comparar un objeto contra otro)
	    //Comparar si una cadena es igual a otra
	    
	    System.out.println(cadena.equals("Hoy es martes 30 de mayo de 2023"));
        //Devolvera valor true o false segun el caso
	    
	    //equalsIgnoreCase(Compara las cadenas de texto
	    //ignorando si tiene mayusculas o minusculas
	    System.out.println(cadena.equalsIgnoreCase("Hoy es martes 30 de mayo de 2023"));

	   //replace= remplazar los caracteres con otros que especifiquemos
	    System.out.println(cadena.replace("e","x"));
        //remplaza los espacios para mostrar todo junto
	    System.out.println(cadena.replace(" ",""));

	   
	
}//Cierre de main

}//Cierre de clase
