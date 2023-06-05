package com;

import java.util.Scanner;

public class Array3_JOLC {

	//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
	//caracteres.
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa una frase: ");
	        String frase = scanner.nextLine();

	        char[] caracteres = frase.toCharArray();

	        System.out.println("Array de caracteres:");
	        for (int i = 0; i < caracteres.length; i++) {
	            System.out.println("Carácter " + i + ": " + caracteres[i]);
	        }
	    }
	}