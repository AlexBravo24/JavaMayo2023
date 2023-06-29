package com;

public class Ejercicio5_AVG {

	public static void main(String[] args) {
		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		 * respectivos precios. Muestra en consola la lista de productos y sus precios. 
		 * Por lo menos 5 productos o artículos
		 */

		
		String[] productos = {"productos1", "productos2", "productos3", "productos4", "productos5"};
		double[] precios = {10, 20, 35, 45 ,50};
		
		System.out.println("lista de los productos");
		for (int i = 0; i < precios.length; i++) {
			double d = precios[i];
			System.out.println(productos[i] + "-$"+ precios[i]);
		}	
		
	}

}
