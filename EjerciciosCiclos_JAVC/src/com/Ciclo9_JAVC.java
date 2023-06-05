package com;

import java.util.Scanner;

public class Ciclo9_JAVC {

	public static void main(String[] args) {
		
		
		//9. Programa Java que lea dos números y muestre los números pares entre ellos
		
		int num1, num2;
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Introduce un Primer Numero : ");
		num1 = e.nextInt();
		
		System.out.println("Introduce un Segundo Numero : ");
		num2 = e.nextInt();
		
		if (num1 > num2) {
			System.out.println("Pares entre " + num2 + " y " + num1);
			while(num2<num1) {
				if ((num2%2) == 0) {
					System.out.println(num2);

				}
				num2++;
				
			}
		}else {
			System.out.println("Pares entre " + num1 + " y " + num2);
			while (num1 < num2 ) {
				if ((num1%2) == 0) {
					System.out.println(num1);
				}
			num1++;
			}
		
		}

	}

}
