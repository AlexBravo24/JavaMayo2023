package com;

import java.util.Scanner;

public class Ejercicio3_JHC {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error.

		int numerador;
		int denominador;
		
		Scanner entrada = new Scanner(System.in);
		
		//Usuario
		System.out.println("Este programa muestra la division de dos numeros");
		//primer numero
		System.out.println("Introduce el primer numero");
		numerador = entrada.nextInt();
		//segundo numero
		System.out.println("Introduce el segundo numero");
		denominador = entrada.nextInt();
		
		//Operaciones
		if (denominador != 0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
			System.out.println("El segundo numero introducido es 0. " 
		+ "Reinicie el programa e introduzca un valor que sea valido");
			
		}
	}

}
