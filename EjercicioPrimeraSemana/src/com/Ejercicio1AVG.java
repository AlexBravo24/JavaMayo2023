package com;

import java.util.Scanner;

public class Ejercicio1AVG {

	public static void main(String[] args) {
		
		// .Realiza un programa que reciba dos n�meros por teclado e 
		// indique cu�l es mayor o si son iguales.

		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		n2 = sc.nextInt();
		
		if(n1==n2)
			System.out.println("son iguales");
			else {
				if (n1>n2)
					System.out.println(n1 + " " + "es mayor que " + n2);
				else 
					System.out.println(n2 + " " + "es menor que " + n1);
			}

		
	}
	

}
