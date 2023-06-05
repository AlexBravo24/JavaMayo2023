package com;

import java.util.Scanner;

public class Ejercicio1_EAGG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.
		
		int numero1, numero2;
		
		Scanner entrada1= new Scanner(System.in);
		
		System.out.println("Introduce el número 1 por teclado");
		numero1 = entrada1.nextInt();
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("Introduce el número 2 por teclado");
		numero2 = entrada2.nextInt();
		
				
		if (numero1>numero2) {
			System.out.println("El número 1 introducido es mayor");
		} else if (numero1==numero2) {
			System.out.println("Los números introducidos son iguales");
		}else {
			System.out.println("Desconocido");
	}
				


	}

}
