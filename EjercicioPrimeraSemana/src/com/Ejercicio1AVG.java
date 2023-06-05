package com;

import java.util.Scanner;

public class Ejercicio1AVG {

	public static void main(String[] args) {
		
		// .Realiza un programa que reciba dos números por teclado e 
		// indique cuál es mayor o si son iguales.

		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
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
