package com;

import java.util.Scanner;
public class EjercicioCiclo_3AFSC {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		String original,reves = "";
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Ingresa Una Palabra o Frase: ");
	original = entrada.nextLine();
	
	//Iterar al revés para armar la reversa
	for (int i=original.length()-1; i>=0; i--) {
		reves = reves + original.charAt(i); //Extraemos los caracteres y los guardamos
												//de acuerdo a la posicion en la que se encuentra
	}
	System.out.println("Tu palabra al reves es: " + reves.replace(" ",""));
	
	if(original.replace(" ", "").equalsIgnoreCase(reves.replace(" ", ""))) {
		System.out.println("Es Palindromo");
	}else {
		System.out.println("No es Palindromo");
	}

	}
}


