package com;

import java.util.Scanner;

public class Ejercicio6_EAGG {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio 
		// inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		// y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, 
		// �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto 
		// recibir� un productor por la uva que entrega en un embarque considerando
		// lo siguiente: 
		// * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es 
		// de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
		// * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, 
		// y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado.

		float A,B;
		String tipo;
		int tama�o;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingresa el precio de la UVA tipo A");
		A = entrada.nextFloat();
		
		System.out.println("Ingresa el precio de la UVA tipo B");
		B = entrada.nextFloat();
		
		System.out.println("Ingresa el tipo de UVA si es A o B");
		tipo = entrada.next();
		
		tipo = tipo.substring(0,1);
		
		if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) {
			System.out.println("Introduce el tama�o de la UVA (1 � 2):");
			tama�o = entrada.nextInt();
			
			if (tama�o ==1 || tama�o ==2) {
				if (tipo.equalsIgnoreCase("A")) {
					if (tama�o ==1) {
						A += 0.20;
					} else {
						A += 0.30;
					}
					System.out.println("El precio final es: " + A);
				}else {
					if (tama�o == 1) {
						B -= 0.30;
					}else {
						B -= 0.50;
					}
					System.out.println("El precio final es:" + B);
				}	
				}else { 
					System.out.println("El tama�o de la UVA est� incorrecto");					}
			
				}else {
					System.out.println("Error no existe este tipo de uva");
				}	
		}

}
