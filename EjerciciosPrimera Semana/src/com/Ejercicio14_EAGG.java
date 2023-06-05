package com;

import java.util.Scanner;

public class Ejercicio14_EAGG {

	public static void main(String[] args) {
		// 14. Un obrero necesita calcular su salario semanal, 
		// el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga $16 por hora. 
		// Si trabaja más de 40 horas se le paga $16 por cada una 
		// de las primeras 40 horas y $20 por cada hora extra.

		Scanner entrada = new Scanner(System.in);
		
		double salario;  
		int horas;
		
		
		System.out.println("Introduce las horas que trabaja el obrero");
		horas = entrada.nextInt();
		
		if (horas > 40) {
			salario = ((40 * 16) + (horas-40)*20);
					
		} else {
			salario = horas * 16;
			
		}
	
			System.out.println("El salario semanal del obrero es de " + salario + " dólares.");
			
		
		
		
		
	}

}
