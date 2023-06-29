package com;

import java.util.Scanner;

public class Ejercicio13_JHC {

	public static void main(String[] args) {
		// 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
		//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:


		
		int montoDonacion;
		double centroS;
		double comedorN;
		double invBolsa;
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos del usuario		
				System.out.println("Este programa define los monto de donacion a una institucion provenientes de Europa");
				System.out.println("Introduce el monto de donacion: ");
				montoDonacion = entrada.nextInt();
				
		//Procedimiento
		if (montoDonacion >=  10000) {
			centroS = montoDonacion * 0.30;
			comedorN = montoDonacion * 0.50;
			invBolsa = montoDonacion - (centroS + comedorN);
		}else {
			centroS = montoDonacion *0.25 ;
			comedorN = montoDonacion * 0.60;
			invBolsa = montoDonacion - (centroS + comedorN);		
		}
		
		//Imprimir en pantalla
		System.out.println("El monto de donacion es: " + montoDonacion);
		System.out.println("El monto a centro de salud es: " + centroS);
		System.out.println("El monto a comedor niños es: " + comedorN);
		System.out.println("El monto de inversion a la bolsa es: " + invBolsa);
		
		}

}
