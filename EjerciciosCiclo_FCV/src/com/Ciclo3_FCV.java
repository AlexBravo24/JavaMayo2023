package com;

import java.util.Scanner;

public class Ciclo3_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa para determinar si un String es palíndromo.
		
		String cadena;
		String cadena2,cadena3;
		String c;
		char caracter;
		int longitud;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Bienvenido\nPuede introducir la oración");
		cadena=entrada.nextLine();		
		cadena2=cadena.replace(" ", "");
		cadena2=cadena2.toLowerCase();
		cadena3="";
		longitud=cadena2.length()-1;
	
		int a=longitud;
		
		for(int i=0; i<=longitud; i++) {
			
			
			caracter=cadena2.charAt(a);
			cadena3 +=caracter;
			a--;
		}
		if(cadena3.equals(cadena2)) {
			System.out.println("Es un palíndromo");
		}else{
			System.out.println("No es palíndromo");
		}

	}

}
