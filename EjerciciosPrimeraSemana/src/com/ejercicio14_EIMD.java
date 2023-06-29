package com;

import java.util.Scanner;

public class ejercicio14_EIMD {

	public static void main(String[] args) {
		/*
		 14. Un obrero necesita calcular su salario semanal, 
		 el cual se obtiene de la siguiente manera: Si trabaja 40
horas o menos se le paga $16 por hora. 
Si trabaja más de 40 horas se le paga $16 por cada una de las
primeras 40 horas y 
$20 por cada hora extra.
		 */
		
		double horas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime las horas trabajadas en la semana ");
		horas=sc.nextDouble();
		if (horas<=40) {
			System.out.println("Tu salario es: $" + (horas*16));
			
		}else {
			System.out.println("Tu salario es: $" + ((40*16) + ((horas-40)*20)));
		}
		sc.close();
		
	}

}
