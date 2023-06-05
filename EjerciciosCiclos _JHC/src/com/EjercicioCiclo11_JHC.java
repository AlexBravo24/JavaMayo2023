package com;

import java.util.Scanner;

public class EjercicioCiclo11_JHC {

	public static void main(String[] args) {
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese las filas del cuadrado: ");
		int valor = teclado.nextInt();
		System.out.print("Ingrese las columnas del cuadrado: ");
		int valor2 = teclado.nextInt();
		teclado.close();
		
		/*
		 * Usamos dos bucles anidados para crear el cuadrado.
		 * El primer bucle crearía las FILAS
		 * y el segundo las COLUMNAS
		 */
		
		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor2; columna++)
				System.out.print("*");
			
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}
		
	}

}
