package com;

import java.util.Scanner;

public class Ejercicio3_AVG {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y 
		//muestre el resultado de su divisi�n. Si el 
		//segundo n�mero es 0, debe mostrar un mensaje de error
		
		Scanner entrada = new Scanner (System.in);
		
		int nu;
		int dem;
		
		System.out.println("Muestre el resultado de su divisi�n");
		System.out.println("Ingrese el n�mero");
		
		nu = entrada.nextInt();
		System.out.println("Ingrese el segundo n�mero");
		
		dem = entrada.nextInt();
		
		
		if (dem != 0) {
			System.out.println((double) nu/(double)dem );
		} else {
			System.out.println("Error al codificar");
		}
		
		
	}

}
