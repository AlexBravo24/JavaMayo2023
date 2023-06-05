package com;

import java.util.Scanner;

public class Ciclos10_EAGG {

	public static void main(String[] args) {
		// 10. Programa que lea 20 números e indique si 
		// son positivos o negativos y pares o impares y 
		// además muestre la sumatoria de los positivos y 
		// sumatoria de los impares.

		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int [20];
		int sum_Positivos = 0;
		int sum_Impares = 0;
				
		
		System.out.println("Ingrese 20 números:");
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			numeros [i] = entrada.nextInt();
			
		
			if (numeros[i]>0) {
				System.out.println("Es positivo.");
				sum_Positivos += numeros [i];
			} else if (numeros [i] < 0) {
				System.out.println("Es negativo.");
			}else {
				System.out.println("Es cero.");
				
			}
			
			if (numeros[i]%2==0) {
				System.out.println("Es par.");
			} else {
				System.out.println("Es impar.");
				sum_Impares += numeros [i];
			}
		}
		
		
		System.out.println("La sumatoria de los números positivos es: " + sum_Positivos);
		System.out.println("La sumatoria de los números impares es: " + sum_Impares);
		
	}

}
