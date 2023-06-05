package com;

import java.util.Scanner;

public class Cliclos12_MBR {

	public static void main(String[] args) {
		/*12.Se ingresan un conjunto de n edades de personas por teclado. 
		 * El programa finalizara cuando el promedio de las edades sea superior a 25.*/
		int edad =0, contador = 0, edades=0;
		double promedio = 0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Conjunto de N edades donde el promedio es <= 25 ");
		while (promedio <  25) {
			System.out.println("Ingresa tu edad");
			edad = entrada.nextInt();
			contador++;
			edades += edad/contador;
			promedio = edades/contador;
			
			
		}
		System.out.println("Promedio es: + prom");
		entrada.close();

	}

}
