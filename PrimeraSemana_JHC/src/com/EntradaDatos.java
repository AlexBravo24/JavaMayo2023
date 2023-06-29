package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducir numeros por le teclado 
		 
		//Declaro una variable donde almacenar el numero que voy 
		//a teclear
		
		int numero;
		
		//Utilizamos una clase llamada Scanner para poder leer
		//o "escuchar" lo que se va a introducir por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		//Escribo un mensaje con una instruccion 
		System.out.println("Introduce un numero por el teclado");
		
		//Guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		
		System.out.println("El valor tecleado fue "+ numero);
		
		//Mientras no cierre el scanner, puedo seguir introduciendo numeros 
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		entrada.close();
		
		System.out.println("La suma del numero 1 y numero2 es: " + (numero+numero2));
		
		
	}

}
