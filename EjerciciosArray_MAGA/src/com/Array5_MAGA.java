package com;

public class Array5_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 5: Crea dos arrays, uno para mostrar n productos y otro para
		 *  mostrar sus respectivos precios. Muestra en consola la lista de 
		 *  productos y sus precios. Por lo menos 5 productos o artículos.
		 * */
		
		String [] prods = {"Sopa Maruchan", "Knor", "Sabritas", "Azucar", "Ruffles"};
		double [] precios = {15.00, 20, 25, 80, 15};
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("--- PROGRAMA PARA MOSTRAR 5 PRODUCTOS Y SUS PRECIOS     ---");
		System.out.println("---     EN SUS RESPECTIVOS ARRAYS PRODS Y PRECIOS       ---");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\n\n\n           LISTA DE PRODUCTOS:");
		System.out.println("-------------------------------------------");
		System.out.println("|    Descripcion       | Precio            |");
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < precios.length; i++) {
			//System.out.printf("%"prods[i] + "| $" + precios[i]);
			System.out.printf("%22s |  $%.2f\n", prods[i], precios[i]);
		}
	}

}
