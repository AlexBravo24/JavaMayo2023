package com;

import java.util.Scanner;

public class Ejercicio14_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 14: 
		 * Un obrero necesita calcular su salario semanal, el cual se 
		 * obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga 
		 * $16 por hora. Si trabaja más de 40 horas se le paga $16 
		 * por cada una de las primeras 40 horas y $20 por cada hora extra.
		 * */

		Scanner e = new Scanner(System.in);
		int horas, extras;
		
		System.out.println("-------------------------------------------");
		System.out.println("Calculo del salario");
		System.out.println("-------------------------------------------");
		System.out.println("Introduzca el número de horas laboradas: ");
		horas = e.nextInt();
		extras = 0;
		
		if (horas > 0) {
			if (horas > 40) {
				extras = horas - 40;
				horas = 40;
			}
			System.out.println("El salario total del empleado es: " + ( ( horas * 16 ) + ( extras * 20 ) ));
			System.out.println("El empleado trabajo " + extras + " horas extras");
		}else {
			System.out.println("ERROR: numero de horas incorrectas");
		}
	}

}
