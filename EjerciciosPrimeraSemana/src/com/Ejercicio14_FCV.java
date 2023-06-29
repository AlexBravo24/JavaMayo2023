package com;

import java.util.Scanner;

public class Ejercicio14_FCV {
	public static void main(String[] args) {
		//Un obrero necesita calcular su salario semanal, el cual
		//se obtiene de la siguiente manera: Si trabaja 40 horas o menos
		//se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 
		//por cada una de las primeras 40 horas y $20 por cada hora extra.
		
		int horas;
		int extras;
		int total;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el total de horas laborales");
		horas=entrada.nextInt();
		
		if(horas<=40) {
			total=horas*16;
			System.out.println("Total a pagar es: " + total);
		}else if(horas>40) {
			extras=horas-40;
			total=(40*16)+(extras*20);
			System.out.println("Total a pagar es: " + total);
		}
		
		
	}

}
