package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos. Tambien los pueden encontrar como bucles 
		//Estructuras que nos van a permitir repetir
		//Sentencias o procesos
		
		//while - Mientras - se cumpla una determinada condicion se ejecutara
		//bien
		
		//La mayoria de las veces vamos a contar con una variable numerica 
		//que va ser nuestro control
//		
//		int x = 0;
//		
//		while (x < 5) { //Mientras sea menor a 5
//			System.out.println("Hola mundo"); //Si se cumple la condicion 
//			x++; //Para controlar este ciclo indico un incremento
//		}
		
//		int y = 1; //Tabla simple de multiplicar, Variables de control
//		
//		while (y <= 10) {
//			System.out.println(20 * y);
//			y++;
//		}
		
		//do - Ejecutar el codigo una vez, despues pregunta si desea seguir realizando
		
//		int y = 1;
//		
//		do { //has lo siguiente al menos una vez
//			System.out.println("Hola mundo al menos una vez");
//		}while (y > 5);
		
		//For (PARA)
		//Tengo mi variable iniciada, la condicion; incremento
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hola mundo");
//		}
		
		//Funcionalidad con decimales
		for (double i = 1; i < 5; i+=.1) {
			System.out.println("Hola mundo" +i);
		}
		
		

	}

}
