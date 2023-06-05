package com;

import java.util.Scanner;

public class Ejercicio13_JAVC {

	public static void main(String[] args) {
		
		double donacion;
		double salud;
		double comedor;
		double bolsa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el Total de la Donacion ");
		donacion = entrada.nextInt();
		
		if (donacion >= 10000) {
			
			salud = 0.30 * donacion;
			comedor = 0.50 * donacion;
			bolsa = 0.20 * donacion;
			
		System.out.println("Se destino a salud : " + salud + " Se destino al comedor : " +comedor+ " Se destino a bolsa : " +bolsa);
		} if (donacion <= 10000) {
			
			salud = 0.25 * donacion;
			comedor = 0.60 * donacion;
			bolsa = 0.15 * donacion;
			System.out.println();
			
		System.out.println("Se destino a salud : " + salud + " Se destino a comedor :  "+ comedor + " Se destino a bolsa : " + bolsa);
		
		}
		
		
		
		

	}

}
