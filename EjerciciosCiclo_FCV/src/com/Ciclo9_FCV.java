package com;

import java.util.Scanner;

public class Ciclo9_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa Java que lea dos números y muestre 
		//los números pares entre ellos
		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el primer número");
		num1=entrada.nextInt();
		System.out.println("introduzca el segundo número");
		num2=entrada.nextInt();
		System.out.println("Los numeros pares son: ");
		
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				if(num1%2==0) {
					System.out.println(num1);
				}
				
				num1++;
			}
		}else {
			for(int i=num2; i<=num1; i++) {
				
				if(num2%2==0) {
					System.out.println(num2);
				}
				
				num2++;
			}
		}

	}

}
