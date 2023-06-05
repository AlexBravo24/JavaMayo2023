package com;

public class Array5_JAVC {

	public static void main(String[] args) {
		
		
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//      respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//      Por lo menos 5 productos o artículos.
		
		String utiles [] = {"Mouse $ " , "Teclado $ " , "Audifonos $ " , "Bocina $ " };
		
		double precios [] = {199, 400, 800, 1000};
		
		for (int u = 0; u < utiles.length; u++) {
			System.out.println(utiles [u] + " " + precios [u]);
		}
		
		
	

	}

}
