package com;

import java.util.Scanner;

public class Ejercicio6_YAAH {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//		tama�o 2.
//		Precio inicial se recibe desde teclado
		
		
		String tipo;
		int tamano;
		int precio;
		
		Scanner intro = new Scanner(System.in);
		
		System.out.println("Introduce el tipo(A/B): ");
		tipo = intro.nextLine();
		
		System.out.println("Introduce el tama�o(1/2): ");
		tamano = intro.nextInt();
		
		System.out.println("Introduce un precio inicial");
		precio = intro.nextInt();
		
		
		
		if( tamano == 1 && tipo.equals("A") ) {
			System.out.println("La Uva es de tipo A y tama�o 1 el precio final es:  " + (precio + 20) + " Centimos" );
			
		}else if(tamano == 2 && tipo.equals("A")){
			System.out.println("La Uva es de tipo A y tama�o 2 el precio final es:  " + (precio + 30) + " Centimos" );
			
		}else if(tamano == 1 && tipo.equals("B")){
			System.out.println("La Uva es de tipo B y tama�o 2 el precio final es:  " + (precio - 30) + " Centimos" );
			
		}else if(tamano == 2 && tipo.equals("B")){
			System.out.println("La Uva es de tipo B y tama�o 2 el precio final es:  " + (precio - 50) + " Centimos");
			
		}else {
			System.out.println("Error");
		}
		
		
	}

}
