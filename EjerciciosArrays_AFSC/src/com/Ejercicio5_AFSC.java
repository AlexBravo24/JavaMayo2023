package com;

public class Ejercicio5_AFSC {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos 
		//y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.

		String productos []={"Lapiz", "Goma","Sacapuntas","Juego Geometrico","Compas"};
		int precios[]={10,7,5,17,23};
		 
		System.out.println("***** Lista de Productos y Precios *****\n");
		 
		for (int u=0;u<productos.length;u++){
		 System.out.println(productos[u]+ " --> "+ precios[u]); 
		} 
		
	}

}
