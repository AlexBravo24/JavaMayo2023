package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos.Tambienlos podemos encontrar bucles.
		// Estructuras que nos va a peromitir
		//Sentencias o proceso
		
		//While - MIENTRAS - Mientras se cumpla una determinacion condicion
		//La mayoria de las veces vamos a contar con una variable 
		//numerica que va a ser nuestro control
		
		
//		int x=1;
//		while (x<5) { //Mientras "x" sea menor a 5
//			System.out.println("hola mundo"); //Imprime un mensaje 
//			x++; // Para controlar este ciclo
//		}
//		
//		int y = 1;
//		while(y<=10) {// Mientras Y sea menor o igual que 10
//			System.out.println(20*y);// Imprime una operacion
//			//multiplicando un valor por lo que vale Y en ese momento.
//			y++;
//		}
		
		
		// DO - Ejecutar el codigo al menos una vez, y despues pregunta
		// si se quiere seguir realizando.
		//De esta manera nos aseguramos que se ejecute por una primera
		// vez en el caso de que una condicion no se cumple.
		
		int d = 1; 
		do {// Haz lo siguiente
			System.out.println("hola mundo al menos 1 vez");
		}while (d>5);
		
		//FOR - PARA- 
		//tengo mi variable inicaida; la condicion; incremento
		for (double i = 1; i <= 5; i+=.1) {
			System.out.println("Hola mundo" + i);
		}
		
		
		
		
		
	}

}
