package com;

import java.util.Scanner;

public class Array3_FCV {
		public static void main(String[] args) {
			//Pide al usuario por teclado una frase y 
			//pasa sus caracteres a un array de caracteres
			
			int longitud;
			String cadena;
			char a;
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Favor de ingresar una frase");
			cadena=entrada.nextLine();
			longitud=cadena.length();
			
			char [] arreglo = new char [longitud];
			
			for(int i=0; i<longitud; i++) {
				a=cadena.charAt(i);
				//System.out.println(a);
				arreglo[i]=a;
				System.out.println("Indice es: "+i+" Letras correspondiente "+arreglo[i]);
			}
			
	}
}
