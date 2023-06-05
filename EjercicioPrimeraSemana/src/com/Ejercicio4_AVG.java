package com;

import java.util.Scanner;

public class Ejercicio4_AVG {

	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula.
		
		
		Scanner entrada = new Scanner (System.in);
		
		String Cadena;
		System.out.println("Ingresa la cadena: ");
		Cadena = entrada.nextLine();
		
		if (Cadena.length()!=1) {
			System.out.println("La letra es mayuscula");
		}else if ((Cadena.compareTo("A") >=0 )  && (Cadena.compareTo("Z")<=0)){
			System.out.println("Si es Mayuscula");
		} else {
			System.out.println("no es Mayuscula");
		}
		
		
	}

}
