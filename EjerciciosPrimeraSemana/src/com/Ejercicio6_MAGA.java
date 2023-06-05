package com;

import java.util.Scanner;

public class Ejercicio6_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 6: 
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		 *  la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		 *  Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar 
		 *  cu�nto recibir� un productor por la uva que entrega en un embarque considerando 
		 *  lo siguiente: 
		 *  * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
		 *  * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 
		 *  2. Precio inicial se recibe desde teclado
		 * */
		float A, B; 
		Scanner entrada = new Scanner(System.in);
		String tipo;
		int size;
		System.out.println("-----------------------------------");
		System.out.println("Introduce el tipo de UVA (A/B): ");
		tipo = entrada.next();
		System.out.println("Introduce el precio de la UVA tipo A");
		A = entrada.nextFloat();
		System.out.println("Introduce el precio de la UVA tipo B");
		B = entrada.nextFloat();
		tipo = tipo.substring(0, 1);
		if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) {
			System.out.println("Introduce el tama�o de la UVA (1/2): ");
			size = entrada.nextInt();
			if (size == 1 || size == 2) {
				if (tipo.equalsIgnoreCase("A")) {
					if (size == 1) {
						A += 0.20;
					}else {
						A += 0.30;
					}
					System.out.println("El precio final es: " + A);
				}else {
					if (size == 1) {
						B -= 0.30;
					}else {
						B -= 0.50;
					}
					System.out.println("El precio final es: " + B);
				}
			}else {
				System.out.println("Tama�o de la UVA incorrecto");
			}
		}else {
			System.out.println("Error no existe ese tipo de uva");
		}
		
		entrada.close();
	}

}
