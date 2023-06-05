package com;

public class Ciclos {

	public static void main(String[] args) {
		//Ciclos o Bucles
		//Estructura que nos van a permitir repetir
		//sentencias o procesos
		
		//whille - Mientas se cumpla
		//una determinada condicion, se ejecut5ara el seiguiente
		//la mayoria de las veces vamos a contar con una variable 
		//numerica que va a ser nuestro control
		
		int x = 1;
		while (x < 5) {//Mientras x sea menor a 5, realiza lo siguiente
			System.out.println("Hola mundo");//imprime un mensaje
			x++;//para controlar este siclo, indico un incremento
			
		}
		
		int y = 1;
		while(y<=10) {//mientras y sea menor o igual a 10
			System.out.println(20*y);
			y++;
		}
		
		//Do- (Ejecutarbel codigo al menos una vez, y despues
		//se pregunta si se quiere segur realizando.
		//de esta manera nos aseguramos que se ejecute por una primera vez
		//en el caso de que una condicion no se cimple
		int p=1;
		do {//Has lo siguiente
			
			System.out.println("Hola mundo al menos 1 vez");
			
		} while ( p > 5);
		//FOR (PARA)
		//(Tengo mi variable iniciada; la condicion; incremento
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo");
			
		}
		
		

	}

}
