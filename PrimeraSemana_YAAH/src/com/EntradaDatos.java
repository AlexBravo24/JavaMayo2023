package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir n�meros por teclado
		
		// Declara una variable donde almacenar el n�mero que voy a teclear 
		
		int numero;
		
		// Utilizamos una clase llamada Scaner para poder leer o 
		// "escuchar" lo que se va a introducir por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		// Escribo un mensaje con una instuccion
		System.out.println("Introduce un n�mero por teclado");
		
		
		// Guardamos lo que vayamos a teclear en la variable numero
		
		numero = entrada.nextInt();
		
		System.out.println("El valor tecleado fu� " + numero);
		
		// Mientras no cierre el Scanner, puedo seguir introduciendo numeros con el
		System.out.println("Introduce otro n�mero");
		int numero2 = entrada.nextInt();
		entrada.close();
		System.out.println("La suma de numero 1 y n�mero 2  es: " + (numero + numero2));

				
		
		
		
		
	}

}
