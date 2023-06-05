package com;

import java.util.Scanner;

public class Ejercicio4_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		String cadena;
		String comparador;
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Favor de introducir una palabra");
		
		cadena=entrada.next();
		
		comparador=cadena.toLowerCase();
		
		if(comparador.equals(cadena)==true) {
			System.out.println("No hay letras mayusculas");
		}else {
			System.out.println("La palabra contiene letras mayusculas");
		}
	
		
	}

}
