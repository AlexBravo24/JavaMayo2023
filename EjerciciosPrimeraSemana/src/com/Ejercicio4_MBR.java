package com;

import java.util.Scanner;

public class Ejercicio4_MBR {

	public static void main(String[] args) {
		/*4. Realiza un programa que lea una cadena por teclado 
		 y compruebe si es una letra may�scula.*/
		
		Scanner scanner = new Scanner (System.in);
	    String letra;
	 // Se solicitan datos al usuario
	    System.out.println("SE MUESTRA SI UNA LETRA INGRESADA ES MAYUSCULA");
	    System.out.print("Ingrese una letra: ");
	    letra = scanner.nextLine();
	    
	// Realizamos C�lculos y mostramos en pantalla
	    if (letra.length() != 1){
	      System.out.println("La letra no es may�scula");
	 
	    }else if ((letra.compareTo("A") >= 0) && (letra.compareTo("Z")<=0)) {
	       System.out.println("Es una letra may�scula.");
	    }else {
	        System.out.println("No es una letra may�scula.");
	    }

	}

}
