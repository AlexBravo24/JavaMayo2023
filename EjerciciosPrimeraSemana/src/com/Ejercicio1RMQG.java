package com;
import java.util.Scanner;
public class Ejercicio1RMQG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		// Introducir n�meros por teclado

		int numero;
		//Utilizamos la clase llamada Scanner para poder leer 
		// o escuchar loque se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
	//Mensaje para dar una instrucci�n en pantalla
		System.out.println("Vamos a ingresar un par de n�meros");
		System.out.println("para evaluar el resultado si los numeros");
		System.out.println("Fueron iguales o cu�l fu� mayor");
		System.out.println("Introduce el primer n�mero por teclado");
		//Guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		//Lo mostramos
		System.out.println("El primer valor tecleado fue " + numero);
		//Mientras no cerremos scanner podemos seguir pidiendo numeros
		System.out.println("Introduce el segundo n�mero por teclado");
		int numero2 = entrada.nextInt();
		System.out.println("El segundo valor tecleado fue " + numero2);
		entrada.close();
		//Evaluar los numeros.
		//Comparar si son iguales
		if (numero==numero2) {
			System.out.println("Los n�meros son iguales");
		}else if (numero>numero2){
			System.out.println("El primer n�mero es mayor");
		}else {
			System.out.println("El segundo n�mero es mayor");
		}

	}//fin main

}//fin clase
