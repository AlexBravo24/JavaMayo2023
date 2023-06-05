package com;

import java.util.Scanner;

public class Ciclo4_JOLC {
	
	/*Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
	cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
	“Carácter no encontrado”.*/
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ingresa una frace: ");
		String frase = scanner.nextLine();
		
		System.out.println("ingresa una letra: ");
		char letra = scanner.next().charAt(0);
		
		int contador = 0;
		 for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)==letra) {
				contador++;
			}
		}
		 
		if (contador > 0) {
			System.out.println("la letra \" " + letra + "\" aparece " + contador + " veces en la frase.");
			
		} else { System.out.println("caracter no encontrado");
				
		scanner.close();
		
			}
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}


