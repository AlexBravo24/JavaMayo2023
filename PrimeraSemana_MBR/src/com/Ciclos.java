package com;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclos.Tambien se pueden encontrar como bucles
		//Estructuras que nos van a permitir repetir sentencias o procesos
		//while-Mientras-Mientras se cumpla una determinada condicion, se ejecutara lo siguiente 
        //la mayoria de las veces vamos a contar con una variable numerica que va a  ser nuesttro contro
		
		
//		}
//		
//		int y = 1;
//		while(y<=10) {//miwentras y sea menor o igual a 10
//			System.out.println(20*y);//imprime una operacion
//			//multiplicando un valor por el que vale y en ese momento 
//			y++;
		//}
		//Do -(Ejecutar el codigo al menos una vez, y despues pregunta si se quiere seguir realizando )
		//De esta manera nos asguramos que se ejecute por una 
		//primera vez en el caso de que una condicion no se cumpla 
		int Y =1;
		do {//Haz lo siguiente 
			System.out.println("Hola mundo al menos 1 vez");
		}while (Y>5);
		
		//FOR (PARA)
		//(Tengo mi variable iniciada; la condicion; incremento )
//		for (int i = 1;  i < 5; i++) {
//			System.out.println("Hola mundo");
			for (double i = 1;  i < 5; i+=.1) {
				System.out.println("Hola mundo"+ i);
			
		}
		
		
		
	}

}
