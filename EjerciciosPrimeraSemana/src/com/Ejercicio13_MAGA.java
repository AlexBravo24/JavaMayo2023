package com;

import java.util.Scanner;

public class Ejercicio13_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 13: 
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa y
		 *  lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte en 
		 *  la bolsa de acuerdo a lo siguiente:
			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
			y el resto se invierte en la bolsa.
			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños
			 y el resto se invierte en la bolsa.
			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 * */
		
		Scanner e = new Scanner(System.in);
		double monto, salud, comedor, bolsa;
		
		System.out.println("--- Calculo de donación ----");
		System.out.println("----------------------------");
		System.out.println("Indica el monto de la donacion: ");
		monto = e.nextFloat();
		
		if (monto > 0) {
			if (monto > 10000) {
				salud = monto * 0.3;
				comedor = monto * 0.5;
				bolsa = monto * 0.2;
			}else {
				salud = monto * 0.25;
				comedor = monto * 0.6;
				bolsa = monto * 0.15;
			}
			
			System.out.println("El monto a invertir en el centro de salud es: $" + salud);
			System.out.println("El monto a invertir en el comedor de niños es: $" + comedor);
			System.out.println("El monto a invertir en el bolsa es: $" + bolsa);
		}else {
			System.out.println("ERROR: monto incorrecto");
		}

	}

}
