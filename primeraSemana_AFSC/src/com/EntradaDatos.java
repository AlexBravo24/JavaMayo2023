package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir numeros por teclado
		//Declaro una variable donde almacenar variable a teclear
		
		int numero;
		//Utilizamos clase llamada Scanner para poder leer 
		//O escuchar lo que se va a introducir por teclado
		
		Scanner entrada =new Scanner(System.in);
		
		//Escribo un mensaje con una instruccion
		
		System.out.println("Introduce un numero por teclado");
		
		//Guardamos lo que vayamos a teclear en la variable numero
		numero=entrada.nextInt();
		System.out.println("El valor tecledo fue "+numero);
		
		//Mientras mp cierre el scanner, puedo seguir introduciendo numeros
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		//concatenacion
		System.out.println("La concatenacion del numero 1 + numero 2 es:  "+ numero+numero2);
		//operacion
		System.out.println("La suma del numero 1 + numero 2 es:  "+ (numero+numero2));

	}

}
