package com;

import java.util.Scanner;

public class Ciclo12_JAVC {

	public static void main(String[] args) {
		
		
		
		
		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//    cuando el promedio de las edades sea superior a 25
		
		int edad = 0, cont = 0, edades = 0;
		
		double prom = 0;
		Scanner e = new Scanner(System.in);
		
		while (prom < 25) {
			System.out.println("Escribe tu edad : ");
			edad = e.nextInt();
			cont++;
			edades += edad;
			
			prom = edades / cont;
			
			
		}
		
		System.out.println("Promedio es : " + prom);
		e.close();
		
	
		
	}

}
