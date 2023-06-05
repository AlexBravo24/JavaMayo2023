package com;

import java.util.Scanner;

public class Ciclo7_AVG {

	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $700.00 en un banco, 
		 * el cual le otorga un 2% de interés mensual. 
		 * ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes
		 * todo su dinero?
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		
		double dinero = 1000;
		int mes = 1;
		
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println(mes);
		System.out.println(dinero);

	}

}
