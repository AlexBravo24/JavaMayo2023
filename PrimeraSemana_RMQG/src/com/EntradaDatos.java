package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir números por teclado

		int numero;
		//Utilizamos la clase llamada Scanner para poder leer 
		// o escuchar loque se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
	//Mensaje para dar una instrucción en pantalla
		System.out.println("Introduce un número por teclado");
		//Guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		//Lo mostramos
		System.out.println("El valor tecleado fue " + numero);
		//Mientras no cerremos scanner podemos seguir pidiendo numeros
		System.out.println("Introduce otro número por teclado");
		int numero2 = entrada.nextInt();
		entrada.close();
		System.out.println("La suma de los dos numero es: " + (numero + numero2));
	}

}
