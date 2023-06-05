package com;

import java.util.Scanner;

public class Ejercicio2_EAGG {

	public static void main(String[] args) {
		// 2. Realiza un programa que pida un número por teclado
		// y nos indique si es par o impar.

	int numero;
	
	Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el número");
		numero = entrada.nextInt();
		
		if(numero % 2==0) {
		System.out.println("Es número par");
		}else {
			System.out.println("No es número par");
		}
		
		
	}

}
