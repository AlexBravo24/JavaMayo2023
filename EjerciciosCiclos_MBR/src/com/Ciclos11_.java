package com;

import java.util.Scanner;

public class Ciclos11_ {

	public static void main(String[] args) {
		/*11.Dibuja un cuadrado, como en la imagen que acompaña, 
		 * introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8*/
		Scanner entrada = new Scanner(System.in);
		int alto;
		int ancho;
		int x=0;
		System.out.println("Se dibujara el alto y ancho");
		System.out.println("Introduce el ancho: ");
		ancho = entrada.nextInt();
		System.out.println("Introduce el alto: ");
		alto = entrada.nextInt();
		while (alto > 0) {
			while(x< ancho) {
				System.out.println(" * ");
				x++;
			}
			System.out.println("");
			x =0;
			alto --;
		}

	}

}
