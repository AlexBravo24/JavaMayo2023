package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclo while
		
		//La mayoria de las veces vamos a contar con una variable
		// numerica que va a ser nuestro control.
		
		int x = 1;
		
		while (x<5) { // Mientras x sea menor o igual a 5, realiza lo siguiente.
			System.out.println("Hola mundo"); // Imprime msj
			x++; // Para controlar el ciclo, indico un incremento.
		}

		int y = 1;
		
		while (y<=10) { // Mientras y sea menor o igual a 10 imprime una operacion 
			System.out.println(20*y); // multiplicando un valor
			y++; // por lo que vale y en ese momento.
		}
		
		// DO - ( Ejecutar el codigo al menos una vez, y después 
		// preguntar si se quier seguir realizando.
		// De esta manera nos aseguramos que se ejecute por una 
		// primera vez en el caso de que una condicion 
		
		int z = 1;

		do { // Haz lo siguiente 
			System.out.println("Hola cara de vrga..!!!!");
		} while (z>5);  
		
		// FOR (PARA)
		// Tengo mi variable iniciada; la condicion; incremento
		for (int i = 1; i <= 5; i++) {
			System.out.println("Herga Spiterman " + i);
		}
	}

}
