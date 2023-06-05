package com;

import java.util.Scanner;

public class Ejercicio3RMQG {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y 
		//muestre el resultado de su división. 
		//Si el	segundo número es 0, debe mostrar un mensaje de error.
		int numero;
		//Utilizamos la clase llamada Scanner para poder leer 
		// o escuchar loque se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
		//Mensaje para dar una instrucción en pantalla
		System.out.println("Vamos a ingresar un par de números");
		System.out.println("y mostrar el resultado de su división");
		System.out.println("Introduce el primer número por teclado");
		//Guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		//Lo mostramos
		System.out.println("El primer valor tecleado fue " + numero);
		//Mientras no cerremos scanner podemos seguir pidiendo numeros
		System.out.println("Introduce el segundo número por teclado");
		int numero2 = entrada.nextInt();
		System.out.println("El segundo valor tecleado fue " + numero2);
		entrada.close();
		//Evaluar los numeros.
		//Dividir solo si el segundo es distinto a cero
		if (numero2==0) {
			System.out.println("El segundo valor es cero; no se puede dividir");
		}else {
			System.out.println("El resultado de su división es :" + (numero/numero2));
		}


	}//fin main

}//fin class
