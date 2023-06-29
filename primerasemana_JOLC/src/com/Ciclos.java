package com;

public class Ciclos {

	public static void main(String[] args) {
		
		
		//ciclos tambien los pueden encontrar como BUCLES , son estructuras que nos van a permitir repetir 
		//sentencias o procesos
		
		/*while- mientras se cumpla una determinada condicion, se ejecutara lo siguiente
		 * 
		 * la mayoria de las veces vamos a contar con una variable numerica que va a ser nuestro control
		 */
		
		int x= 1;
		
		while (x<5) {  //mientras x sea menor a 5 realiza lo siguiente
			System.out.println("hola mundo");//imprime un msj
			x++;//para controlar un ciclo, indico un incremento 
		}
		
		int y = 1;
		while(y<=10) { //mientras "y"sea menor o igual a 10
			System.out.println(20*y);
			//imprime una operacion multiplicando un valor por lo que vale "y" en ese momento
			
			y++;
			
		}
		/*DO - ( Ejecutar el codigo al menos una ves, y despues pregunta si se quiere
		 * seguir realizando.
		 * de esta manera nos aseguramos que se ejecute por una primera vez en el caso de que una condicion no se cumpla
		 */
		
		int z =1;
		do { //haz lo siguiente
			System.out.println("hola mundo al menos una vez");
		}while (z>5);
		
		/* FOR (PARA) 
		 * 
		 * (tengo mi variable iniciada; la condicion ;incremento)
		 */
		
		for (double  i = 1; i<=5; i++) {
			System.out.println("hola mundo " + i);
		}
		
		
	}
	}


