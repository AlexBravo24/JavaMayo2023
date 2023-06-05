package com;

import java.util.Scanner;

public class EntradaDatos {
	public static void main(String[] args) {
		// Introducir numeros por teclado
		// Declarar una variable para almacenar un valor
		int numero, numero2;
		
		//Utilizamos una clase llamada Scanner para leer datos
		Scanner entrada = new Scanner(System.in );
		
		System.out.println("Introduce un número por teclado: ");
		numero = entrada.nextInt();
		
		System.out.println("Introduce un segundo número por teclado: ");
		numero2 = entrada.nextInt();
		
		System.out.println("La suma de los dos numeros anteriores es: " + (numero + numero2));
		
		
		entrada.close();
		
	}
}
