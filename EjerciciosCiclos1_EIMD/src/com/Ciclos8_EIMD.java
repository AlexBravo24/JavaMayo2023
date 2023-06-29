package com;

import java.util.Scanner;

public class Ciclos8_EIMD {

	public static void main(String[] args) {
		/*
		 8. Programa Java que lea dos números y muestre los números desde el menor hasta el
mayor 
		 */
		
		double uno,dos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		uno=sc.nextDouble();
		System.out.println("Ingrese el segundo número");
		dos=sc.nextDouble();
		
		for (double i = uno; i <= dos; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
