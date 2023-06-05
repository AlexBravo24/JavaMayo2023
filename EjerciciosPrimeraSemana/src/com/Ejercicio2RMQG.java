package com;

import java.util.Scanner;

public class Ejercicio2RMQG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		int numero;
		//Utilizamos la clase llamada Scanner para poder leer 
		// o escuchar loque se va a introducir por teclado
		Scanner entrada = new Scanner(System.in);
		
	//Mensaje para dar una instrucción en pantalla
		System.out.println("Vamos a ingresar un número");
		System.out.println("para evaluar si es par o impar");
		System.out.println("Introduce el número por teclado");
		//Guardamos lo que vayamos a teclear en la variable numero
		numero = entrada.nextInt();
		//Lo mostramos
		System.out.println("El valor tecleado fue " + numero);
		entrada.close();
		if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
	}//Fin main
}//Fin class
