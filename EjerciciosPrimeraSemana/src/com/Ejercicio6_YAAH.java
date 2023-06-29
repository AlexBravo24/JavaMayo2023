package com;

import java.util.Scanner;

public class Ejercicio6_YAAH {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado
		
		
		String tipo;
		int tamano;
		int precio;
		
		Scanner intro = new Scanner(System.in);
		
		System.out.println("Introduce el tipo(A/B): ");
		tipo = intro.nextLine();
		
		System.out.println("Introduce el tamaño(1/2): ");
		tamano = intro.nextInt();
		
		System.out.println("Introduce un precio inicial");
		precio = intro.nextInt();
		
		
		
		if( tamano == 1 && tipo.equals("A") ) {
			System.out.println("La Uva es de tipo A y tamaño 1 el precio final es:  " + (precio + 20) + " Centimos" );
			
		}else if(tamano == 2 && tipo.equals("A")){
			System.out.println("La Uva es de tipo A y tamaño 2 el precio final es:  " + (precio + 30) + " Centimos" );
			
		}else if(tamano == 1 && tipo.equals("B")){
			System.out.println("La Uva es de tipo B y tamaño 2 el precio final es:  " + (precio - 30) + " Centimos" );
			
		}else if(tamano == 2 && tipo.equals("B")){
			System.out.println("La Uva es de tipo B y tamaño 2 el precio final es:  " + (precio - 50) + " Centimos");
			
		}else {
			System.out.println("Error");
		}
		
		
	}

}
