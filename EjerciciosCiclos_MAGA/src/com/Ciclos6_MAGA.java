package com;

public class Ciclos6_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 6:
		 * Una persona desea invertir $1000.00 en un banco, el cual le 
		 * otorga un 2% de inter�s mensual. �Cu�l ser� la cantidad de dinero que 
		 * esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		 * */

		System.out.println("--------------------------------------------------------");
		System.out.println("INVERSION DE DINERO A UN A�O");
		System.out.println("--------------------------------------------------------");
		System.out.println("\nDinero inicial $1000.00");
		
		double dinero = 1000.00;
		int x = 1;
		while (x <= 12) {
			dinero += (dinero * 0.02);
			x++;
		}
		
		System.out.printf("Dinero invertido despues de un a�o: $%.2f", dinero);
	}

}
