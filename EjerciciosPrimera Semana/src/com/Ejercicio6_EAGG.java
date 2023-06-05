package com;

import java.util.Scanner;

public class Ejercicio6_EAGG {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio 
		// inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		// y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
		// ésta es de un sólo tipo y tamaño, se requiere determinar cuánto 
		// recibirá un productor por la uva que entrega en un embarque considerando
		// lo siguiente: 
		// * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es 
		// de tamaño 1 y 30 céntimos si es de tamaño 2. 
		// * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, 
		// y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado.

		float A,B;
		String tipo;
		int tamaño;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingresa el precio de la UVA tipo A");
		A = entrada.nextFloat();
		
		System.out.println("Ingresa el precio de la UVA tipo B");
		B = entrada.nextFloat();
		
		System.out.println("Ingresa el tipo de UVA si es A o B");
		tipo = entrada.next();
		
		tipo = tipo.substring(0,1);
		
		if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) {
			System.out.println("Introduce el tamaño de la UVA (1 ó 2):");
			tamaño = entrada.nextInt();
			
			if (tamaño ==1 || tamaño ==2) {
				if (tipo.equalsIgnoreCase("A")) {
					if (tamaño ==1) {
						A += 0.20;
					} else {
						A += 0.30;
					}
					System.out.println("El precio final es: " + A);
				}else {
					if (tamaño == 1) {
						B -= 0.30;
					}else {
						B -= 0.50;
					}
					System.out.println("El precio final es:" + B);
				}	
				}else { 
					System.out.println("El tamaño de la UVA está incorrecto");					}
			
				}else {
					System.out.println("Error no existe este tipo de uva");
				}	
		}

}
