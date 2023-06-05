package com;

import java.util.Scanner;

public class Ejercicio13_YAAH {

	public static void main(String[] args) {
		// 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			niños y el resto se invierte en la bolsa.
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		
		
		double donacion;
		
		Scanner into = new Scanner(System.in); 
		
		System.out.println("Introduce la cantidad de la donación: ");
		donacion = into.nextDouble();
		
		if ( donacion >= 10000 ) {
			System.out.println("Se destinan: " + (donacion * 30 / 100) + " al Centro de Salud");
			System.out.println("Se destinan: " + (donacion * 50 / 100) + " al Comedor de Niños");
			System.out.println("Se destinan: " + (donacion * 20 / 100) + " a la bolsa");
		} else if ( donacion < 10000 ) {
			System.out.println("Se destinan: " + (donacion * 25 / 100) + " al Centro de Salud");
			System.out.println("Se destinan: " + (donacion * 60 / 100) + " al Comedor de Niños");
			System.out.println("Se destinan: " + (donacion * 15 / 100) + " a la bolsa");
		}else { 
			System.out.println("Error");
		}
		
		
	}

}
