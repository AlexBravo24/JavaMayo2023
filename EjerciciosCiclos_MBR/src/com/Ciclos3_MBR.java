package com;

import java.util.Scanner;

public class Ciclos3_MBR {
	
	

	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String es palíndromo.
		Scanner entrada = new Scanner(System.in);
		String frase, invertida;
		int tamaño;
		
		System.out.println("SE DETERMINA SI UNA FRACE ES PALÍNDROMA");
		System.out.println("Introduce la frase");
		frase = entrada.nextLine();
		tamaño = frase.length()-1;
		
		invertida = "";
		
		while(tamaño >= 0) {
			invertida += frase.charAt(tamaño);
			tamaño--;
		}
		
		if(frase.equals(invertida)) {
			System.out.println("LA frase es palindroma");
		}else {
			System.out.println("LA frase no  es palindroma");
		}
		
	}
}
