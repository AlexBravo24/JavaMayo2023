package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir números por teclado
		
		// Declara una variable donde almacenar el número que voy a teclear 
		
		int numero;
		
		// Utilizamos una clase llamada Scaner para poder leer o 
		// "escuchar" lo que se va a introducir por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		// Escribo un mensaje con una instuccion
		System.out.println("Introduce un número por teclado");
		
		
		// Guardamos lo que vayamos a teclear en la variable numero
		
		numero = entrada.nextInt();
		
		System.out.println("El valor tecleado fué " + numero);
		
		// Mientras no cierre el Scanner, puedo seguir introduciendo numeros con el
		System.out.println("Introduce otro número");
		int numero2 = entrada.nextInt();
		entrada.close();
		System.out.println("La suma de numero 1 y número 2  es: " + (numero + numero2));

				
		
		
		
		
	}

}
