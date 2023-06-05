package com;

public class Ciclo6_1_JAVC {

	public Ciclo6_1_JAVC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		System.out.println("INVERSION DE DINERO A UN AÑO");
		
		System.out.println("\nDinero inicial $1000.00");
		
		double dinero = 1000.00;
		int x = 1;
		while (x <= 12) {
			
			dinero += (dinero * 0.02);
			x++;
		
		}

		System.out.printf("Dinero invertido despues de un año : $%.2f " , dinero);
		
	}

}
