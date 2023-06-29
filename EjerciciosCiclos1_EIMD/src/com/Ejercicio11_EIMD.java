package com;
import java.util.Scanner;
public class Ejercicio11_EIMD {
	public static void main(String[] args) {
	/*
	 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
ancho y el alto. Ejemplo: 8 x 8 
	 */
	
		int ancho,alto;
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce el ancho");
		ancho=sc.nextInt();
		System.out.println("introduce el alto");
		alto=sc.nextInt();
		
		for (int i = 0; i < ancho; i++) {
			System.out.print("\n*");
for (int j = 1; j < alto; j++) {
	System.out.print("*");
}
	}
		sc.close();
		
	}

}
