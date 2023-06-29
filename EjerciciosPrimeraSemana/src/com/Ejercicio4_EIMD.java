package com;


import java.util.Scanner;

public class Ejercicio4_EIMD {

	public static void main(String[] args) {
/*
 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
 */
		
		String letras;
		  Scanner cadena = new Scanner(System.in);
		  System.out.println("Introduce una horacion");
		  letras=cadena.nextLine();
		  
		  char[] caracteres=letras.toCharArray();
	     
	 System.out.println("Las letras Mayusculas son: ");
	        for (int i = 0; i < letras.length(); i++) {
	       if (caracteres[i]=='A'||caracteres[i]=='B'||caracteres[i]=='C'
	    		   ||caracteres[i]=='D'||caracteres[i]=='F'||caracteres[i]=='G'
	    		   ||caracteres[i]=='H'||caracteres[i]=='I'||caracteres[i]=='J'
	    		   ||caracteres[i]=='K'||caracteres[i]=='L'||caracteres[i]=='M'
	    		   ||caracteres[i]=='N'||caracteres[i]=='Ñ'||caracteres[i]=='O'
	    		   ||caracteres[i]=='P'||caracteres[i]=='Q'||caracteres[i]=='R'
	    		   ||caracteres[i]=='S'||caracteres[i]=='T'||caracteres[i]=='U'
	    		   ||caracteres[i]=='V'||caracteres[i]=='W'||caracteres[i]=='X'
	    		   ||caracteres[i]=='Y'||caracteres[i]=='Z') {
			
					System.out.println("Posicion: "+i+" Letra: "+caracteres[i]);
				}
	        	
					
	        }
	 
	       
	        cadena.close();
		
		
		
	}

}
