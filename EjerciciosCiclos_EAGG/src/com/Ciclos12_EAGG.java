package com;

import java.util.Scanner;

public class Ciclos12_EAGG {

	public static void main(String[] args) {
		// 12.Se ingresan un conjunto de n edades de personas por teclado. 
		// El programa finalizara cuando el promedio de las edades sea superior a 25.

		Scanner entrada = new Scanner(System.in);
		
		
		int edad = 0, contar = 0, edades = 0;
		double prom = 0;
		
		while (prom < 25) {
			System.out.println("Introduce la edad de la persona");
			edad = entrada.nextInt();
			contar++;
			edades += edad;
			prom = edades / contar;
			
		}
	System.out.println("Promedio es: " + prom);
	
	
		
		
	}
}
