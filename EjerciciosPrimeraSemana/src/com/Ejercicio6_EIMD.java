package com;

import java.util.Scanner;

public class Ejercicio6_EIMD {

	public static void main(String[] args) {
		/*
		 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo
		  de uva, 
		  la cual se
clasifica en tipos 
(A y B), y además en tamaños (1 y 2). 
Cuando se realiza la venta del producto, ésta
es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
entrega en un embarque considerando lo siguiente:

* Si es de tipo A, se le cargan 20 céntimos al precio inicial
*  cuando es de tamaño 1 y 30 céntimos si
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
tamaño 2.
Precio inicial se recibe desde teclado



TIPO A Y TAMAÑO 1= 20 CENTIMOS
TIPO A Y TAMAÑO 2= 30 CENTIMOS
TIPO B Y TAMAÑO 1=-30 CENTIMOS
TIPO B Y TAMAÑO 2=-50 CENTIMOS
		 */

		String tipo,tamaño,precioI;
		double n;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Ingresa El precion inicial por kilo [Centimos]");
		precioI=sc.nextLine();
		
		System.out.println("Ingresa el tipo [A/B]");
		tipo=sc.nextLine();
		
		
		System.out.println("Ingresa el  tamaño[1/2]");
		tamaño=sc.nextLine();
		 n =Double.parseDouble(precioI);
		if (tipo.equals("A")&& tamaño.equals("1")) {
			
			
			System.out.println("el precio final es: "+(n+20)+ " Centimos" );
		}else if (tipo.equals("A")&& tamaño.equals("2")) {
			
			
			System.out.println("el precio final es: "+(n+30)+ " Centimos" );
		}else if (tipo.equals("B")&& tamaño.equals("1")) {
			
			
			System.out.println("el precio final es: "+(n-20)+ " Centimos" );
		}else if (tipo.equals("B")&& tamaño.equals("2")) {
			
			
			System.out.println("el precio final es: "+(n-50)+ " Centimos" );
		}
		
		sc.close();
		
	}

}
