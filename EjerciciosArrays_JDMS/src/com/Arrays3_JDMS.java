package com;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3_JDMS {

	public static void main(String[] args) {
		
		Scanner valor=new Scanner(System.in);
		
		  char frase[]={};
		  String palabra;
		  int suma=0;
		  int media=0;
		 // int tam;
		  System.out.println("Ingresa una frase: ");
		  palabra=valor.nextLine();
		  //tam=palabra.length();
//		  System.out.println(palabra);
		  frase=new char [palabra.length()];
	      for (int i = 0; i < palabra.length(); i++) {
	    	  frase[i] =palabra.charAt(i);
	    	}
	     // System.out.println(Arrays.toString(frase));
	      for (int j = 0; j < frase.length; j++) {
	    	  System.out.println(frase[j]);
		}

	}

}
