package com;

import java.util.Scanner;

public class Ciclo11_JAVC {

	public static void main(String[] args) {
		
		
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//    ancho y el alto. Ejemplo: 8 x 8 TODO Auto-generated method stub
		
		int x;
		int y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el ancho del cuadro : ");
		x = entrada.nextInt();
		
		System.out.println("Introduce el Alto ");
		y = entrada.nextInt();
		
		for (int ancho = 1; ancho <= x; ancho++) {
		for (int alto = 1; alto <= y; alto++) {
		
			System.out.println(" * ");
		
		
		}
		System.out.println();
		}

	}

}
