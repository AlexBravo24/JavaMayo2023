package com;

public class EjercicioCiclo_6AFSC {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de inter�s mensual. 
		//�Cu�l ser� la cantidad de dinero que esta persona 
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte?

		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 1.02;
		mes++;
		}
		System.out.println("Si reinviertes todo tu dinero al finalizar el a�o tendras : $   " + dinero);
		
	}//main

}
