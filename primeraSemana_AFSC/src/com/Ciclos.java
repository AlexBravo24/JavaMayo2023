package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos. Tambien llamados bucles
		//Estructurasque nos van a permitir repetir
		//Sentensias o procesos.
		
		//while: Mientras se cumpla deerminada condicion, ejecuta algo
		
		//La mayoria de las veces vamos a contar con una variable numerica
		//sera nuestro control
		
//		int x=1;
//		while(x<5) {//Mientras x<5, imprime
//			System.out.println("Hola mundo");
//			x++;//Para controlar este ciclo, indico incremento
//		}
//		int y=1;
//		
//		while (y<=10) {
//				System.out.println(20*y);
//				y++;
//		}
		
		//Do: Ejecuta el codigo al menos una vez y despues
		//pregunta si se quiere seguir realizando
		int y=1;
		
		do {//Haz lo siguiente
			System.out.println("Hola mundo al menos 1 vez");
		}while (y>5);
		
		//for: para
		//(Variable
		for (double i = 0; i <5; i+=.1) {
			System.out.println("Hola Mundo"+i);
		}
	}//main

}