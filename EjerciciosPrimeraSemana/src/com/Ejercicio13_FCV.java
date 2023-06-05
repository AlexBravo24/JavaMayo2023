package com;

import java.util.Scanner;

public class Ejercicio13_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Una institución benéfica recibe anualmente una donación proveniente de Europa y 
		lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte 
		en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donación es de $10000 o más: 30% se destina al centro de 
			salud, 50% al comedor de niños y el resto se invierte en la bolsa.
			Si el monto de la donación es menor que $10000: 25% se destina al centro de 
			salud, 60% al comedor de niños y el resto se invierte en la bolsa.
			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.*/

		double monto;
		double salud;
		double comedor;
		double bolsa;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Favor de ingresar el monto anual");
		monto=entrada.nextDouble();
		if(monto>=10000) {
			salud=monto*0.30;
			comedor=monto*0.50;
			bolsa=monto*0.20;
			System.out.println("El presupuesto para salud es: "+salud);
			System.out.println("El presupuesto para el comedor es: "+comedor);
			System.out.println("El presupuesto para la bolsa es: "+bolsa);
		}else if (monto<=10000) {
			salud=monto*0.25;
			comedor=monto*0.60;
			bolsa=monto*0.15;
			System.out.println("El presupuesto para salud es: "+salud);
			System.out.println("El presupuesto para el comedor es: "+comedor);
			System.out.println("El presupuesto para la bolsa es: "+bolsa);
		}
	}

}
