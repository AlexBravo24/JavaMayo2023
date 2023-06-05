package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducir datos por teclado
		
		//Declarar una variable donde almacenar el numero que voy
		//a teclear
		
		int numero;
		
		//Utilizamos una clase llamada Scanner para poder leer
		//o "escuchar" lo que se va a introducir por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		//Escribo un mensaje con una instrucción
		System.out.println("Introduce un número por teclado");
		
		//Guardamos lo que vayamos a teclear en la variable numero
		
		numero = entrada.nextInt();
		
		System.out.println("El valor tecleado es "+numero);
		
		//Mientras no cierre el Scanner, puedo seguir introduciendo
		//numero con el
		
		System.out.println("Introduce otro número");
		int numero2 = entrada.nextInt();
		
		System.out.println("La suma de numero 1 y numero 2 es:"+ (numero+numero2));
		
		// Si lo cerramos antes de querer leer otro numero
		//Marca error
		//entrada.close();
		
		System.out.println("Introducir un tercer numero");
		int numero3 = entrada.nextInt();
		
		entrada.close();

	}

}
