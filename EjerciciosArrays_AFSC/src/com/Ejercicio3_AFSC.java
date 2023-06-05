package com;

import java.util.Scanner;

public class Ejercicio3_AFSC {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y 
		//pasa sus caracteres a un array de caracteres

		Scanner entrada=new Scanner(System.in);
		 int x=0; 
		 String frase;
		 
		 System.out.println("Escribe una Frase: ");
		 frase=entrada.nextLine();
		 
		 char caracteres[]=new char[frase.length()];
		 for(int i=0;i<frase.length();i++){            
		 x=x+1;             
		 caracteres[i]=frase.charAt(i); 
		 System.out.println(caracteres[i]);           
		 } 
		System.out.println("\nLa cantidad de caracteres es : "+frase.length());
		
	}

}
