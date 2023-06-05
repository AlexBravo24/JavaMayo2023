package com;

import java.util.Scanner;

public class Ciclos11_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 11:
		 * Dibuja un cuadrado, como en la imagen que acompaña, 
		 * introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
		 * */
		
		Scanner e = new Scanner(System.in);
		int alto, ancho;
		int x = 0;
		
		
		System.out.println("------------------------------------------------------------");
		System.out.println("PROGRAMA QUE DIBUJA UN CUADRO INDICANDO EL ALTO Y EL ANCHO: ");	
		System.out.println("-------------------------------------------------------------");
		System.out.println("Introduce el ancho: ");
		ancho = e.nextInt();
		System.out.println("Introduce el alto: ");
		alto = e.nextInt();
		while (alto > 0) {
			while(x < ancho) {
				System.out.print(" * ");
				x++;
			}
			System.out.println("");
			x = 0;
			alto --;
		}

	}

}
