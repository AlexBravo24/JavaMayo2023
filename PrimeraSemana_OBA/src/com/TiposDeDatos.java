package com;

public class TiposDeDatos {
	public static void main(String[] args) {   //control espacio
		//doble linea para comentarios de un solo renglón
		/*comentarios de muchas lineas
		 * en mas renglones
		 * aja
		 */
	//cierre de main

//para guardar los cambios      control s
	
	//tipos de datos:   PRIMITIVOS:NUMERICOS ENTEROS,
	byte b;
	short s;
	int i;
	long l;

	b = 127;
	s = 32767;
	i = 2147483647;
	l = 2147483650l;
	
	                              //NUMERICOS TIPO PUNTO Y COMA
	float f = 4000.566f;   //debe de llevar la f despues del numero
	double d = 4000.5786;  //es el comodin
	
	//   boleanos
	boolean boo = true;   // solo se ocupan para ver si es verdadero o falso
    //  entre comilla simple 'a'
	
	
	String cadena = "esto es una cadena."; 
	String nombre = "Oscar";
			
	String apellidos = "Bravo Aguilar.";
	//para imprinmir
	System.out.println(nombre);// syso control mas espacio
    System.out.println(apellidos);
	// concatenando valores
	System.out.println("Mi nombre completo es: " + nombre + " " + apellidos);
    //imprimiendo números
	System.out.println(1000);
	

	}
	
	
	
	
	
	
}//cierre de la class


