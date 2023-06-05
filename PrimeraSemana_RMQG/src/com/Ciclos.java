package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos o bucles que son estructuras que permiten
		// repetir sentencias o procesos.
		
		//WHILE - Mientras se cumpla la condición se ejecutará
		//un bloque de código.
		
		int x = 1; //iniciamos el contador
		
		while (x<=5) {
			System.out.println("Hola mundo " + x);
			x++; //Agrega un incremento al contador
		}
		int y = 1;
		do {
			System.out.println("Hola mundo al menos una vez");
		} while (y>5);
		
		//FOR - 
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo " + i);
		}
	}

}
