package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir numeros por teclado
		
		//Declaro una variable donde almacenar el numero que voy a teclear
		
        int numero;
		
		//Utilizamos una clase llamada Scanner para poder leer o escuchar lo que se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
		//escribo un mensaje con una instruccion
		System.out.println("Introduce un numero por teclado");
		
		//guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		//entrada.close();
		
		System.out.println("El valor numerico fue "+ numero); 
		// mientras no cierre el scanner puedo seguir introduciendo numeros con el
		System.out.println("Introduce otro numero");
		int numero2=entrada.nextInt();
		
		System.out.println("La suma de numero 1 y numero 2 es : "+(numero+numero2));
		
 
	}

}
