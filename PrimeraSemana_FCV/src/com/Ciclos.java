package com;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ciclos También se conocen como bucles
		//Son estructuras que nos van a permitir repetir
		//sentencias o procesos
		
		
		//Ciclo WHILE -- mientras se cumpla una 
		//determinada condición, se ejecuta
		
		// la mayoria de las veces se va a contar
		//con una variable numerica que va a ser
		// de control
		
		int x = 1;
		
		while (x<5) { //Mientras x sea menor a 5 se ejecuta
			System.out.println("Hola mundo");
			x++;
			
		}
		
		// DO - Ejecutara el codigo al menos una vez
		// y despues pregunta si quiere seguir realizandolo
		
		do {//Haz lo siguiente
			
			System.out.println("hola al menos una vez");
		}while(x<5);
/////////////////////////////////////////////////////////////////
			
		//Ciclo FOR
		
		for (int i=1; i< 5; i++) {
			System.out.println("Hola mundo");
		}
	
	}

}
