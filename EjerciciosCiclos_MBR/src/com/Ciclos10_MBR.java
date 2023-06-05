package com;

import java.util.Scanner;

public class Ciclos10_MBR {

	public static void main(String[] args) {
		/*10. Programa que lea 20 números e indique si son positivos o negativos y pares 
		 * o impares y además muestre la sumatoria de los positivos y sumatoria de los impares.*/
		Scanner entrada= new Scanner(System.in);
		int sp = 0;
		int si = 0;
		int num;
		for(int i =0; i<20; i++) {
			System.out.println("Ingresa un número. ");
			//int num = Scanner.nextInt();
			num=entrada.nextInt();
			
			if(num>=0) {
				System.out.println("El número es positivo");
				sp += num;
			}else {
				System.out.println("El número es negativo");
			}
			if (num % 2 == 0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("Ei numero es impar");
				si += num;
			}
			
		}
		System.out.println("La sumatoria de los números positivos es. "+ sp);
		System.out.println("La sumatoria de los números impares es. "+ sp);

	}

}
