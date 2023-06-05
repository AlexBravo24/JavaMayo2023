package com;

import java.util.Scanner;

public class Ciclo6_AVG {

	public static void main(String[] args) {
		/*
		 *  Una persona desea invertir $1000.00 en un banco, el 
		 *  cual le otorga un 2% de interés mensual. 
		 *  ¿Cuál será la cantidad de dinero que esta persona tendrá al 
		 *  cabo de un año si todo el dinero lo reinvierte?
		 */
		Scanner entrada = new Scanner(System.in);
		
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 1.02;
		mes++;
		}
		System.out.printf("%.4f",dinero);
		}
		

}
