package com;

import java.util.Scanner;

public class EjercicioCiclo8_JHC {
	public static void main(String[] args) {
		
		//8. Programa Java que lea dos números y muestre los números desde el menor hasta el
		//mayor
		
		int numero1;
		int numero2;
		int menor;
		int mayor;
		
		Scanner nu = new Scanner(System.in);
		
		//Lectura de numero
		System.out.println("*********************************************************");
		
		System.out.println("Programa Java que lea dos números y muestre los números desde el menor hasta el mayor");
		
		System.out.println("*********************************************************");
		
		do {
			System.out.println("Introduce el primero numero: ");
			numero1 = nu.nextInt();
			System.out.println("Introduce el segundo numero: ");
			numero2 = nu.nextInt();
			if (numero1 == numero2 ) {
				System.out.println("Debes introducir dos numeros diferentes ");
			}
		}while (numero1 == numero2);
		
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		}else {
			mayor = numero2;
			menor = numero1;
		}
		
		//Numeros menor a mayor
		
		System.out.println("\nNumeros desde " + menor + " hasta " + mayor + " : ");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
