package com;

import java.util.Scanner;

public class Ciclos4_MBR {

	public static void main(String[] args) {
		/*4.Programa que reciba una frase y una letra por teclado. 
		 * Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		 * Si no existe, imprimir un mensaje “Carácter no encontrado”.*/
		
		Scanner e =  new Scanner(System.in);
		String frase = "";
		char letra = ' ';
		int contador = 0;
		//int b = 0;
		System.out.println("Ingresa una frase");
		frase = e.nextLine();
		System.out.println("Ingresa una letra");
		letra = e.nextLine().charAt(0);
		
	
		 for (int i = 0; i < frase.length(); i++) {
			 if(frase.charAt(i)==letra) contador++; }
		 if(contador ==0) System.out.println("Letra no encontrada");
		 else if (contador == 1) System.out.println("solo hay un caracter en la frase");
		 else System.out.println("La letra " + letra+ "se rpite"+ contador+ "veces");
				
			 
			 }
			 }


