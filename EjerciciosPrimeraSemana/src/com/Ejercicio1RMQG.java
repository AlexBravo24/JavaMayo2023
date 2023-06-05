package com;
import java.util.Scanner;
public class Ejercicio1RMQG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		// Introducir números por teclado

		int numero;
		//Utilizamos la clase llamada Scanner para poder leer 
		// o escuchar loque se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
	//Mensaje para dar una instrucción en pantalla
		System.out.println("Vamos a ingresar un par de números");
		System.out.println("para evaluar el resultado si los numeros");
		System.out.println("Fueron iguales o cuál fué mayor");
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
		//Comparar si son iguales
		if (numero==numero2) {
			System.out.println("Los números son iguales");
		}else if (numero>numero2){
			System.out.println("El primer número es mayor");
		}else {
			System.out.println("El segundo número es mayor");
		}

	}//fin main

}//fin clase
