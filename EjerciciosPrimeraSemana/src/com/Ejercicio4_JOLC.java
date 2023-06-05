package com;

import java.util.Scanner;

public class Ejercicio4_JOLC {

	

	
	/*
	 Ejercicios Estructuras Alternativas en Java
	Programa:
	Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
	
	Variables a utilizar:
	    * cadena (string)
	ALGORITMO
	    - LEER cadena
	    - Cálculos
	    *   si longitud cadena != 1 --> No es una letra mayúscula
	    *       si cadena > A y <Z --> Es una letra mayúscula
	            sino --> No es una letra mayúscula
	    - MOSTRAR resultado
	*/
	// Inicio del programa y declaración de variables:
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    String cadena;
	// Solicitud de datos al usuario
	    System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
	    System.out.print("Introduce la cadena que desees: ");
	    cadena = scanner.nextLine();
	    
	// Realizamos Cálculos y mostramos en pantalla
	    if (cadena.length() != 1){
	      System.out.println("La cadena no es una letra mayúscula");
	   // }else if ((cadena > "A") && (cadena < "Z")) {
	    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	       System.out.println("La cadena es una letra mayúscula.");
	    }else {
	        System.out.println("La cadena no es una letra mayúscula.");
	    }
	    }
	  }

