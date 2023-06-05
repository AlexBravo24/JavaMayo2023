package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir numero por teclado 
		
		//Declaro una variable donde almacenar el nuemeor que voy
		//a teclear
		
		int numero; 
		
		// utilizamos una clase llamada scanner para poder leer o escuchar 
		//lo que se va a introducir por teclado 
		Scanner entrada = new Scanner(System.in);
		
		//Escribo un mensaje con una introccion
		System.out.println("Introduceun numero por teclado");
		
		//guardamos lo que vayamos a teclear en la variable
		//numero
		numero = entrada.nextInt();
		System.out.println("El valor teclado fue "+ numero);
		
		//Mientras no cirre el Scanner, puedo seguir introduccir
		//numero con el
		System.out.println("introduce otro numero ");
		int numero2 = entrada.nextInt();
		System.out.println("introduce otro numero");
		int numero3 = entrada.nextInt();
		//entrada.close();
		System.out.println("la suma de numeor1 y numero 2 es: " + (numero+numero2+numero3));

	}

}
