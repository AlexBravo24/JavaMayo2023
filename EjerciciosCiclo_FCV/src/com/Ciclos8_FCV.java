package com;

import java.util.Scanner;

public class Ciclos8_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa Java que lea dos n�meros y 
		//muestre los n�meros desde el menor hasta el mayor
		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el primer n�mero");
		num1=entrada.nextInt();
		System.out.println("introduzca el segundo n�mero");
		num2=entrada.nextInt();
		
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.println(num1);
				num1++;
			}
		}else {
			for(int i=num2; i<=num1; i++) {
				System.out.println(num2);
				num2++;
			}
		}
	}

}
