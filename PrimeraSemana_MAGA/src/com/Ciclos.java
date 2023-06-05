package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos. También se llaman bucles
		// Estructuras que nos permiten repetir sentencias o procesos
		
		//while
		//Se ejecuta mientras que se cumpla una determinada condicion
		
		
		//Tabla de multiplicar
		int x = 1;
		int num1 = 1;
		
		System.out.println("Tabla de multiplicar del " + num1);
		while ( x < 10 ) {
			System.out.println(num1 + " X " + x + " = " + (num1 + x));
			x++;
		}
		
		//DO - WHILE
		// Ejecutar el codigo una vez y después evalua si se ejecuta
		do {
			
		} while (x > 0);
	}

}
