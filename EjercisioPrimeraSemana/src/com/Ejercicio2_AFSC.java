package com;

import java.util.Scanner;

public class Ejercisio2_AFSC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		int numero;
		Scanner entrada1 =new Scanner(System.in);
		System.out.println("Calculamos si un numero es par o impar, proporciona el numero: ");
		numero=entrada1.nextInt();
		if (numero % 2==0) {
			System.out.println("El numero "+ numero + " es par");
			}else {
				System.out.println("El numero "+ numero + " es impar");
			}
			
		
	}//main

}//clase
