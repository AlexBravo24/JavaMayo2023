package com;

import java.util.Scanner;

public class Ciclos2_AVG {

	public static void main(String[] args) {
		/*
		 *  Programa un algoritmo que realice la tabla de multiplicar 
		 *  de un numero introducido desde teclado, hasta la iteración 
		 *  deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		 *  23 x 95 = ???
		 */
		
Scanner entrada = new Scanner(System.in);
		
		int n;
		int incremento;
		System.out.println("Ingrese un numero");
		n = entrada.nextInt();
		System.out.println("ingresa hasta donde deseas multiplicar");
		incremento = entrada.nextInt();
		
		if (n>0) {
			for (int i = 1; i<= incremento;i++)
			System.out.println(n + "x" + i + "=" + n*i);
		}
		

	}

}
