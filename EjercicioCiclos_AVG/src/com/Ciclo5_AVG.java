package com;

import java.util.Scanner;

public class Ciclo5_AVG {

	public static void main(String[] args) {
		/*
		 * . Simular el comportamiento de un reloj digital, 
		 * imprimiendo la hora, minutos y segundos de un día desde 
		 * las 00:00:00 horas hasta las 23:59:59 horas
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		//int Reloj;

		
			for (int h=0; h <= 23; h++)
			for (int m=0; m <= 59; m++)
			for (int s=0; s <= 59; s++)
			System.out.println(h +"H "+ m +"M "+ s+"S");
			}
			

}
