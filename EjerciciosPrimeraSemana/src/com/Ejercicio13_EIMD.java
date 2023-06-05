package com;

import java.util.Scanner;

public class Ejercicio13_EIMD {

	public static void main(String[] args) {
		/*
		 13. Una institución benéfica recibe anualmente una donación proveniente 
		 de Europa y lo reparte entre un
centro de salud, un comedor de niños y una parte lo invierte en la 
bolsa de acuerdo a lo siguiente:
Si el monto de la donación es de 
$10000 o más:
30% se destina al centro de salud, 
50% al comedor de niños
y el resto se invierte en la bolsa.
Si el monto de la donación es 
menor que $10000: 
25% se destina al centro de salud, 
60% al comedor de
niños 
y el resto se invierte en la bolsa.
La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		 */
		double donacion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa La donacion");
		donacion=sc.nextDouble();
		if (donacion>=10000 ) {
			System.out.println("La donacion es: $" + donacion+ "\nEl 30% es para el centro de salud\n30% de " + donacion+ "= $"+(donacion*.30)+
					"\nEl 50% es para el comedor de los niños\n50% de " +donacion+"= $"+(donacion*.5)+"\nEl resto es para la bolsa \nResto= $" +(donacion*.2)
					);
		}else {
			System.out.println("La donacion es: $" + donacion+ "\nEl 25% es para el centro de salud\n30% de " + donacion+ "= $"+(donacion*.25)+
					"\nEl 60% es para el comedor de los niños\n50% de " +donacion+"= $"+(donacion*.6)+"\nEl resto es para la bolsa \nResto= $" +(donacion*.15)
					);	
		}
		
		sc.close();

	}

}
