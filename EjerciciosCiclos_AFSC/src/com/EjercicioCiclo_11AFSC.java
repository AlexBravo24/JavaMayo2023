package com;

import java.util.Scanner;

public class EjercicioCiclo_11AFSC {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
		int x;
		int y;
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el ancho del cuadro: ");
		x = entrada.nextInt();
		System.out.println("introduce el alto");
		y= entrada.nextInt();
		for (int ancho = 1; ancho <= x; ancho++) {
			for (int alto = 1; alto <= y; alto++) { 
				System.out.print(" * ");
								
			
		}
			System.out.println();
		}
		
	}//main

}
