package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//C�mo introducir n�meros o cadenas de texto por teclado
		
		//Declaro una variable d�nde almacenar el n�mero que voy
		//a teclear
		
		int numero;
		
		//utilizamos una clase llamada Scanner para poder leer
		// o "escuchar" lo que se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
		//Escribo un mensaje con una instrucci�n
		System.out.println("Introduce un n�mero por teclado");
		
		//Guardamos lo que vayamos a teclear en la variable 
		//n�mero
		numero = entrada.nextInt();
		
		System.out.println("El valor tecleado fue " + numero);
		
		//Mientras no cierre el Scanner, puedo seguir introduciendo
		//n�meros con �l
		
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		
		//Este lo incluimos nadam�s como ejemplo para saber si as� quedaba pero no 
		//porque no estaba anotado en Println
		System.out.println("Introduce otro numero 3");
		int numero3 = entrada.nextInt();
		
		System.out.println("La suma de numero 1 y numero 2 es: " + (numero + numero2));
		
		
		
		
		
		
		
		
		

	}

}
