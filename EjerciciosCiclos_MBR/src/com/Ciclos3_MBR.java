package com;

import java.util.Scanner;

public class Ciclos3_MBR {
	
	

	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String es pal�ndromo.
		Scanner entrada = new Scanner(System.in);
		String frase, invertida;
		int tama�o;
		
		System.out.println("SE DETERMINA SI UNA FRACE ES PAL�NDROMA");
		System.out.println("Introduce la frase");
		frase = entrada.nextLine();
		tama�o = frase.length()-1;
		
		invertida = "";
		
		while(tama�o >= 0) {
			invertida += frase.charAt(tama�o);
			tama�o--;
		}
		
		if(frase.equals(invertida)) {
			System.out.println("LA frase es palindroma");
		}else {
			System.out.println("LA frase no  es palindroma");
		}
		
	}
}
