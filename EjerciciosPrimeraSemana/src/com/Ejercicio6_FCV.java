package com;

import java.util.Scanner;

public class Ejercicio6_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
		es de tama�o 2.
		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
		tama�o 2.
		Precio inicial se recibe desde teclado*/
		
		int precioinicial;
		int tama�o;
		double total;
		String tipo;
		
		System.out.println("Bienvenido al programa para calcular precio de la uva");
		System.out.println("Favor de introducir el precio inicial del kilo de uva");
		
		Scanner entrada = new Scanner (System.in);
		
		precioinicial=entrada.nextInt();
		
		System.out.println("Favor de introducir el tipo de uva con la letra A o B");
		
		tipo=entrada.next();
		
		System.out.println("Favor de introducir el tama�o de la uva con el n�mero 1 o 2");
		
		tama�o=entrada.nextInt();
		
		if((tipo.equals("A")==true)&&(tama�o==1)) {
			
			total=(precioinicial*0.20)+precioinicial;
			System.out.println("Su precio total es: $"+total);
			
			
		}else if ((tipo.equals("A")==true)&&(tama�o==2)) {
			
			total=(precioinicial*0.30)+precioinicial;
			System.out.println("Su precio total es: $"+total);
		}
		///////////////////////////////////////////////////////////////////////
		
		if ((tipo.equals("B")==true)&&(tama�o==1)) {
			
			total=precioinicial-(precioinicial*0.30);
			System.out.println("Su precio total es: $"+total);
			
			
		}else if ((tipo.equals("B")==true)&&(tama�o==2)) {
			
			total=precioinicial-(precioinicial*0.50);
			System.out.println("Su precio total es: $"+total);
		}

	}

}
