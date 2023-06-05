package com;

import java.util.Scanner;

public class Ejercicio3_AVG {

	public static void main(String[] args) {
		
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres
		
		 Scanner entrada=new Scanner(System.in);
         
	        System.out.println("Escriba una frase");

	        String frase=entrada.nextLine(); 

	        char caracteres[]=new char[frase.length()];

	        for(int i=0;i<frase.length();i++){
	            caracteres[i]=frase.charAt(i);
	            System.out.println(caracteres[i]);
	        }
	}

}
