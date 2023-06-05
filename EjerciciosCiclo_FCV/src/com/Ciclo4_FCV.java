package com;

import java.util.Scanner;

public class Ciclo4_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
				Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
				cuántas veces existe esa letra dentro de la frase. 
				Si no existe, imprimir un mensaje “Carácter no encontrado”.*/
		
		String cadena;
		String letra;
		int letras;
		
		System.out.println("Bienvenido");
		System.out.println("Fvor de introducir una palabra");
		Scanner entrada = new Scanner (System.in);
		
		cadena=entrada.nextLine();
		
		System.out.println("Favor de introducir la letra que desea buscar");
		letra=entrada.next();

	}

}
