package com;

import java.util.Scanner;

public class Ciclos2_EAGG {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de 
		// multiplicar de un n�mero introducido desde teclado, 
		// hasta la iteraci�n deseada por el usuario. 
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		Scanner entrada = new Scanner(System.in);
		int num;
		int x;
		int i=1;
		
		System.out.println("Introduce el n�mero que desees para la tabla de multiplicar");
		num = entrada.nextInt();
		
		System.out.println("Introduce las iteraciones deseadas");
		x = entrada.nextInt();
		
		System.out.println("Tabla de multiplicar del " + num + " hasta el n�mero " + x);
		while (i <= x) {
			System.out.println(num + "x" + i + "="+ (num*x));
			i++;
		}	
		

			
	}

}
