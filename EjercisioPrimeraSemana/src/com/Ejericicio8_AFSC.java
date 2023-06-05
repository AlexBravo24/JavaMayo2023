package com;

import java.util.Scanner;
public class Ejericicio8_AFSC {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla 
		//el número en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		//Nota 1: En las caras opuestas de un dado de seis caras están
		//los números: 1-6, 2-5 y 3-4. 
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6,
		//se mostrará el mensaje: “ERROR: número incorrecto”.
		Scanner entrada = new Scanner(System.in);
	    int dado;

	    System.out.print("Lanza el dato e introduce el numero de la cara obtenida (1-6): ");
	    dado = entrada.nextInt();
	
	    
	    switch (dado) {
	    case 1:
	      System.out.println("La cara opuesta de 1 es la cara \"6\".");
	      break;
	    case 2:
	      System.out.println("La cara opuesta de 2 es la cara \"5\".");
	      break;
	    case 3:
	      System.out.println("La cara opuesta de 3 es la cara \"4\".");
	      break;
	    case 4:
	      System.out.println("La cara opuesta de 4 es la cara \"3\".");
	      break;
	    case 5:
	      System.out.println("La cara opuesta de 5 es la cara \"2\".");
	      break;
	    case 6:
	      System.out.println("En la cara opuesta de 6 es la cara \"1\".");
	      break;
	    default:
	      System.out.println("ERROR: número incorrecto.");
	    }
	}

}
