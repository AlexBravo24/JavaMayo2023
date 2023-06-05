package com;

public class Ciclos7_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 7:
		 * Una persona desea invertir $700.00 en un banco, el cual le 
		 * otorga un 2% de interés mensual. ¿En cuántos meses tendrá más de $1500, 
		 * si reinvierte cada mes todo su dinero?
		 * */
		
		double dinero = 700.00;
		int meses = 0;
		System.out.println("-----------------------------------------------------------");
		System.out.println("PROGRAMA PARA DETERMINAR CUANTOS MESES TOMA LLEGAR A 1500");
		System.out.println("------------------------------------------------------------");
		System.out.println("- DINERO INICIAL: 700");
		System.out.println("- META FINAL: 1500");
		while(dinero <= 1500) {
			dinero += dinero * 0.02;
			meses++;
		}
		
		System.out.printf("Dinero recaudado: $%.2f\n", dinero);
		System.out.println("Llegar a la deseada toma: " + meses + " meses");
	}

}
