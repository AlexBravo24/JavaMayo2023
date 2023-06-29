package com;

import java.util.Scanner;

public class ejercicio14_YAAH {

	public static void main(String[] args) {
		// 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra.
		
		
		int trabajo;
		int extra;
		
		Scanner inter = new Scanner(System.in);
		
		System.out.println("Introduce el número de horas trabajadas: ");
		trabajo = inter.nextInt();
		
		System.out.println("Introduce el número de horas extra trabajadas: ");
		extra = inter.nextInt();
		
		if ( trabajo < 40 ) {
			System.out.println("Se pagan:  " + ((trabajo * 16) + (extra * 0)));
		}else if ( trabajo >= 40 ) {
			System.out.println("Se pagan:  " + ((trabajo * 16) + (extra * 20)));
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
		

	}

}
