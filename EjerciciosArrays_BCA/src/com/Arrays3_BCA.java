package com;

import java.util.Scanner;

public class Arrays3_BCA {
	
  //Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
 //caracteres.
	public static void main(String[] args) {
	
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca una frace");
		String frace=entrada.nextLine();
		char[]caracteres=frace.toCharArray();
		System.out.println("Los caracteres de la frace son:");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]+"");
		}

	}

}
