package com;

import java.util.Scanner;

public class Ejercicio1_EAGG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.
		
		int numero1, numero2;
		
		Scanner entrada1= new Scanner(System.in);
		
		System.out.println("Introduce el n�mero 1 por teclado");
		numero1 = entrada1.nextInt();
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("Introduce el n�mero 2 por teclado");
		numero2 = entrada2.nextInt();
		
				
		if (numero1>numero2) {
			System.out.println("El n�mero 1 introducido es mayor");
		} else if (numero1==numero2) {
			System.out.println("Los n�meros introducidos son iguales");
		}else {
			System.out.println("Desconocido");
	}
				


	}

}
