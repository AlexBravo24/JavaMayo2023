package com;

import java.util.Scanner;

public class Ciclo3_JOLC {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo
		//LA PALABRA PALINDROMO SIGNIFICA " AQUELLA QUE SE PUEDE LEER DE IZQUIERDA A DERECHA Y DE DERECHA A IZQUIERDA"}
		 
		
		Scanner s = new Scanner (System.in);
		String palabra;
		char [] palindromo;
		int izquierdo, derecho;
		System.out.println("ingresa palabra");
		palabra = s.nextLine();
		palabra = palabra.toLowerCase();
		palindromo = palabra.toCharArray();
		izquierdo = 0;
		derecho = palindromo.length - 1;
		
			
			while (izquierdo < derecho) {
				
				if (palindromo[izquierdo] == palindromo [derecho]) {
					
					derecho --;
					izquierdo ++;
				} else {System.out.println("la palabra no es un palindromo");
				
				break;
				}
			}
			
			if(izquierdo ==derecho) {
				System.out.println("la palabra es un palindromo");
			}
	}

}
