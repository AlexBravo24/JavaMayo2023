package com;

import java.util.Scanner;

public class Ejercicio6_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		es de tamaño 2.
		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
		tamaño 2.
		Precio inicial se recibe desde teclado*/
		
		int precioinicial;
		int tamaño;
		double total;
		String tipo;
		
		System.out.println("Bienvenido al programa para calcular precio de la uva");
		System.out.println("Favor de introducir el precio inicial del kilo de uva");
		
		Scanner entrada = new Scanner (System.in);
		
		precioinicial=entrada.nextInt();
		
		System.out.println("Favor de introducir el tipo de uva con la letra A o B");
		
		tipo=entrada.next();
		
		System.out.println("Favor de introducir el tamaño de la uva con el número 1 o 2");
		
		tamaño=entrada.nextInt();
		
		if((tipo.equals("A")==true)&&(tamaño==1)) {
			
			total=(precioinicial*0.20)+precioinicial;
			System.out.println("Su precio total es: $"+total);
			
			
		}else if ((tipo.equals("A")==true)&&(tamaño==2)) {
			
			total=(precioinicial*0.30)+precioinicial;
			System.out.println("Su precio total es: $"+total);
		}
		///////////////////////////////////////////////////////////////////////
		
		if ((tipo.equals("B")==true)&&(tamaño==1)) {
			
			total=precioinicial-(precioinicial*0.30);
			System.out.println("Su precio total es: $"+total);
			
			
		}else if ((tipo.equals("B")==true)&&(tamaño==2)) {
			
			total=precioinicial-(precioinicial*0.50);
			System.out.println("Su precio total es: $"+total);
		}

	}

}
