package com;

import java.util.Scanner;

public class EjercicioCiclo9_JHC {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos 
		
		int numero1;
		int numero2;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("Programa Java que lea dos números y muestre los números pares entre ellos ");
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		do {
			System.out.println("Introduce el primero numero: ");
			numero1 = datos.nextInt();
			System.out.println("Introduce el segundo numero: ");
			numero2 = datos.nextInt();
			if (numero1 >= numero2) {
				System.out.println("El segundo numero debe ser mayor que el primero ");
			}
		}while (numero1 >= numero2);
		
		//Imprimir numeros
		System.out.println("\nNumeros pares desde " + numero1 + " hasta " + numero2 + " : ");
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
			

	}

}
