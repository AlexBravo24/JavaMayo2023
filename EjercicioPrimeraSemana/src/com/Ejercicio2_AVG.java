package com;

import java.util.Scanner;

public class Ejercicio2_AVG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por 
		//teclado y nos indique si es par o impar
		
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su número entero");
		
		numero = entrada.nextInt();
		
		if (numero % 2 == 0){
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		

		
	}

}
