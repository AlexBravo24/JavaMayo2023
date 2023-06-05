package com;

import java.util.Scanner;

public class Ejercicio8_MBR {

	public static void main(String[] args) {
		/*8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis 
		 * caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		 * Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
		 * Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
		 * �ERROR: n�mero incorrecto�.*/
		
		Scanner scanner = new Scanner(System.in);
	    int dado;
	// Solicitud de datos al usuario
	    System.out.println("SE INDICA EL N�MERO QUE APARECE EN LA CARA OPUESTA A LA QUE SALE EN EL DADO");
	    System.out.print("Resultado de la cara obtenida: ");
	    dado = scanner.nextInt();
	// Realizamos comparaciones y se imprime en consola el resultado
	    switch (dado) {
	    case 1:
	      System.out.println("En la cara opuesta est� el \"6\".");
	      break;
	    case 2:
	      System.out.println("En la cara opuesta est� el \"5\".");
	      break;
	    case 3:
	      System.out.println("En la cara opuesta est� el \"4\".");
	      break;
	    case 4:
	      System.out.println("En la cara opuesta est� el \"3\".");
	      break;
	    case 5:
	      System.out.println("En la cara opuesta est� el \"2\".");
	      break;
	    case 6:
	      System.out.println("En la cara opuesta est� el \"1\".");
	      break;
	    default:
	      System.out.println("ERROR: n�mero incorrecto.");
	    }

	}

}
