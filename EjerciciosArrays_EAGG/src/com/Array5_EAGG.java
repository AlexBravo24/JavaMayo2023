package com;

import java.util.Scanner;

public class Array5_EAGG {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n 
		// productos y otro para mostrar sus respectivos 
		// precios. Muestra en consola la lista de productos
		// y sus precios. Por lo menos 5 productos o artículos.

		Scanner entrada= new Scanner(System.in);
		
		String productos[]; 
		double precios[];
		
		productos = new String [5];
		precios = new double [5];
		
		System.out.println("Introduce los 5 productos de la lista:");
		for(int i=0; i<5; i++) {
		productos[i] = entrada.nextLine();
		}
		
		System.out.println("Introduce los 5 precios de la lista:");
		for(int i=0; i<5; i++) {
		precios[i] = entrada.nextDouble();
		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("El producto " + productos[i] + " su precio es de $" + precios[i]);
		}	
		

		
	}

}
