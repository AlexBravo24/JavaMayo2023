package com;

import java.util.Scanner;
	
public class Ejercicio13_BAC {
public static void main(String[] args) {
	
	/*Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
	centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa*/
	
		Scanner entrada=new Scanner(System.in);
		
		Double Donacion, Centro_Salud, Comedor, Bolsa;
		
		System.out.println("Bienvenidos al centro de donaciones");
		System.out.println("Por favor digite la cantidad a donar:");
		Donacion = entrada.nextDouble();
		
		
		
		if(Donacion >= 10000) {
			
			Centro_Salud=Donacion*.30;
			Comedor=Donacion*.50;
			Bolsa=Donacion*.20;
			
			System.out.println("La cantidad dirigida a el centro de salud es:"+Centro_Salud);
			System.out.println("La cantidad dirigida a el comedor de ni�os es:"+Comedor);
			System.out.println("La cantidad dirigida a la bolsa es:"+Bolsa);
			
		}else if(Donacion < 10000) {
			
			Centro_Salud=Donacion*.25;
			Comedor=Donacion*.60;
			Bolsa=Donacion*.15;
			
			System.out.println("La cantidad dirigida a el centro de salud es:"+Centro_Salud);
			System.out.println("La cantidad dirigida a el comedor de ni�os es:"+Comedor);
			System.out.println("La cantidad dirigida a la bolsa es:"+Bolsa);
			
		}
	
}
}
