package com;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
//		Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra

Scanner entrada=new Scanner(System.in);
		
		Double Horas, Salario, Extra;
	
		System.out.println("Por favor digite la cantidad de horas trabajadas:");
		Horas = entrada.nextDouble();
		
		
		if(Horas <= 40) {
			
			Salario=Horas*16;
			
			System.out.println("Su salario es:"+Salario);
			
		}else {
			
			int Sueldo_Base=40*16;
			Salario=Horas-40;
			Extra=Salario*20;
			Double Total=Sueldo_Base+Extra;
			
			System.out.println("Su sueldo base es:"+Sueldo_Base);
			System.out.println("Sus horas extra son:"+Salario);
			System.out.println("El total es:"+Total);
			
		}
		
		
		
		
	}

}
