package com;

import java.util.Scanner;

public class Ciclo10_JAVC {

	public static void main(String[] args) {
		
		
		//10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		//    impares y además muestre la sumatoria de los positivos y sumatoria de los impares
		
		
		int x = 1;
		int numero = 0, pos = 0, imp = 0;
		
		Scanner e = new Scanner(System.in);
				
		
		
		do {
			System.out.println("Introduce un numero : ");
			numero = e.nextInt();
			
			if (numero > 0) {
				System.out.println("El numero es Positivo : ");
				pos += numero;
				
			} else {
				System.out.println("El numero es Negativo :");
			}
			if (numero % 2 == 1) {
				System.out.println("El numero es impar ");
			} else {
				System.out.println("El numero es par");
				
			}
		} while (x < 20);
		
		System.out.println("La sumatoria de los positivos es : " + pos);
		System.out.println("La sumatoria de los impares es : " + imp );
		
				
				
				
				
				
				
				
				
			}
		
		
	}


