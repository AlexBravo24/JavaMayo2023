package com;

import java.util.Scanner;

public class Ciclos10_MBR {

	public static void main(String[] args) {
		/*10. Programa que lea 20 n�meros e indique si son positivos o negativos y pares 
		 * o impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares.*/
		Scanner entrada= new Scanner(System.in);
		int sp = 0;
		int si = 0;
		int num;
		for(int i =0; i<20; i++) {
			System.out.println("Ingresa un n�mero. ");
			//int num = Scanner.nextInt();
			num=entrada.nextInt();
			
			if(num>=0) {
				System.out.println("El n�mero es positivo");
				sp += num;
			}else {
				System.out.println("El n�mero es negativo");
			}
			if (num % 2 == 0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("Ei numero es impar");
				si += num;
			}
			
		}
		System.out.println("La sumatoria de los n�meros positivos es. "+ sp);
		System.out.println("La sumatoria de los n�meros impares es. "+ sp);

	}

}
