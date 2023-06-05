package com;

public class Ciclos {

	public static void main(String[] args) {
		
		// Ciclos. También los podemos encontrar como bucles, son estructuras
		// que nos van a permitir sentencias o procesos.
		
		// while - Mientras - Mientras se cumpla una determinada condición
		// se ejecutará lo siguiente.

		// La mayoría de las veces vamos  a contar con una variable numérica
		//que va a ser nuestro control.
		
//	int x = 0;
//	
//	while (x<5) { //Mientras x sea menor a 5, realiza lo siguiente
//		System.out.println("Hola mundo"); // Imprime un mensaje
//		x++; //Para controlar este ciclo, indico un incremento
//		
//	}
//	
//	int y = 1;
//	
//	while (y<=10) { //Mientras y sea menos o igual a 10
//		System.out.println(20*y); //Imprime una operación
//		//multiplicando un valor por lo que vale "y" en ese momento
//		y++;
//		}
		
//	DO-(Ejecutar el código al menos una vez, y después
	// pregunta si se quiere seguir realizando.
	// De esta manera nos aseguramos que se ejecute por una 
	// primera vez en el caso de que una condición no se cumpla
	
	int y=1;
		
	do { //Haz lo siguiente
		System.out.println("Hola mundo al menos 1 vez");
	}while (y>5);
	
	
	// FOR (PARA)
	// (Tengo mi variable iniciada; la condición; el incremento)
		for (int i = 1; i <= 5; i++) {
		System.out.println("Hola mundo");
		
	}
	
		
	}

}
