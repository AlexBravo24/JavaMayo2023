package com;

import java.util.Scanner;

public class Ejercicio13_EAGG {

	public static void main(String[] args) {
		// 13. Una institución benéfica recibe anualmente una donación proveniente de Europa
		// y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte
		// en la bolsa de acuerdo a lo siguiente:
		// Si el monto de la donación es de $10000 o más: 
		// 30% se destina al centro de salud, 
		// 50% al comedor de niños y el resto se invierte en la bolsa.
		// Si el monto de la donación es menor que $10000: 
		// 25% se destina al centro de salud, 
		// 60% al comedor de niños y el resto se invierte en la bolsa.
		// La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		Scanner entrada = new Scanner(System.in);
		
		double donacion, centrosalud, comedor, inversion;  

		System.out.println("Introduce el monto de la donación");
		donacion = entrada.nextDouble();
				
		if (donacion >= 10000) {
			centrosalud = donacion * 0.3;
			comedor = donacion * 0.5;
			inversion = donacion - (centrosalud + comedor);
		} else {
			centrosalud = donacion * 0.25;
			comedor = donacion * 0.6;
			inversion = donacion - (centrosalud + comedor);
		}
			System.out.println("La institucion destinará " + centrosalud + " dólares al centro de salud.");
			
			System.out.println("La institucion destinará " + comedor + " dólares al comedor de niños.");
			
			System.out.println("La institucion destinará " + inversion + " dólares a la bolsa.");
			

	}

}
