package com;

public class Ciclos6_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 6:
		 * Una persona desea invertir $1000.00 en un banco, el cual le 
		 * otorga un 2% de interés mensual. ¿Cuál será la cantidad de dinero que 
		 * esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		 * */

		System.out.println("--------------------------------------------------------");
		System.out.println("INVERSION DE DINERO A UN AÑO");
		System.out.println("--------------------------------------------------------");
		System.out.println("\nDinero inicial $1000.00");
		
		double dinero = 1000.00;
		int x = 1;
		while (x <= 12) {
			dinero += (dinero * 0.02);
			x++;
		}
		
		System.out.printf("Dinero invertido despues de un año: $%.2f", dinero);
	}

}
