package com;

import java.util.Scanner;

public class Ciclos4_EIMD {

	public static void main(String[] args) {
		/*
		 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
“Carácter no encontrado”. 
		 */
		int contador=0;
		String frase,letra;
		char l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		frase=sc.nextLine();
		System.out.println("Ingresa una letra");
		letra=sc.nextLine();
		l=letra.charAt(0);
		char[] caracteres = frase.toCharArray();
		for (int i = 0; i < frase.length(); i++) {
			
			if(caracteres[i]==l) {
				contador++;
			}
			
			
		}
		
		if(contador==0) 
		{
			System.out.println("El caracter no existe");
		}else {
		System.out.println("En la frase: "+frase+" \nSe repite la letra: "+ letra+"\n"+contador+" vez/veces.");
	}
		sc.close();}

}
