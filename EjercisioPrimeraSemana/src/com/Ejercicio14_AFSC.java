package com;

import java.util.Scanner;

public class Ejercicio14_AFSC {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, 
		//el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga $16 por hora. 
		//Si trabaja más de 40 horas se le paga $16 por cada 
		//una de las primeras 40 horas y $20 por cada hora extra

		Scanner entrada = new Scanner(System.in);
	     
	     int hrstrab,
	     	 tot,
	     	 hrex;
	     
	     System.out.println("Ingrese el número de horas trabajadas: ");
	     hrstrab=entrada.nextInt();
	     

	     if(hrstrab <= 40){
	         tot= hrstrab*16;
	         System.out.println("Su sueldo es de $ "+tot);
	     }else{
	         hrex=hrstrab-40;
	         tot=(hrex*20)+(40*16);
	         System.out.println("Su sueldo es de $ "+ tot);
	     }
		
	}

}
