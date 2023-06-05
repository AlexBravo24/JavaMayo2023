package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//Introducir numeros por teclado
		
		
		int numero; 
		
		
		// Utilizamos una clase llamada Scaner para poder leer o escuchar lo que se introduce por teclado
		
		Scanner entrada = new Scanner (System.in);
		
		// Escribon un mensaje con una instruccion
		
		System.out.println("Introduce un numero por teclado");
		
		// Guardamos lo que vayamos a teclear en la variable numero
		
		numero = entrada.nextInt();
		
		
		System.out.println("El valor tecleado fue " + numero);
		
		// Mientras no cierre el Scanner, puedo seguir introduciendo numeros con el
		
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("La suma del numero1 y numero2 es: " + (numero+numero2));
		
				
				
		
		

	}

}
