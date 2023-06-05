package com;

import java.util.Scanner;

public class Ejercicio13_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 13: 
		 * Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y
		 *  lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en 
		 *  la bolsa de acuerdo a lo siguiente:
			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
			y el resto se invierte en la bolsa.
			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os
			 y el resto se invierte en la bolsa.
			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		 * */
		
		Scanner e = new Scanner(System.in);
		double monto, salud, comedor, bolsa;
		
		System.out.println("--- Calculo de donaci�n ----");
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
			System.out.println("El monto a invertir en el comedor de ni�os es: $" + comedor);
			System.out.println("El monto a invertir en el bolsa es: $" + bolsa);
		}else {
			System.out.println("ERROR: monto incorrecto");
		}

	}

}
