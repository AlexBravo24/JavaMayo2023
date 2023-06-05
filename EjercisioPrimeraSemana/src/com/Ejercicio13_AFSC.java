package com;

import java.util.Scanner;

public class Ejercicio13_AFSC {

	public static void main(String[] args) {
		// Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa 
		//y lo reparte entre un centro de salud, un comedor de ni�os y 
		//una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al 
		//centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 25% se destina
		//al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		Scanner entrada = new Scanner(System.in);
		double donacion,csalud, comedor,bolsa;
		
		 System.out.println("\n Ingresa la Donaci�n Anual: ");
		    donacion = entrada.nextInt();
		    
		    if(donacion >= 10000){
	            csalud = 0.30  * donacion;
	            comedor = 0.50  * donacion;
	            bolsa = 0.20  * donacion;
	            System.out.println("Se destinara a Centro de Salud: " +csalud);
	            System.out.println("Se destinara a Comedor: " +comedor);
	            System.out.println("Se destinara a Bolsa: " +bolsa);
	            
		    }else{
	            csalud = 0.25  * donacion;
	            comedor = 0.60  * donacion;
	            bolsa = 0.15  * donacion;
	            
	            System.out.println("Se destinara a Centro de Salud: " +csalud);
	            System.out.println("Se destinara a Comedor: " +comedor);
	            System.out.println("Se destinara a Bolsa: " +bolsa);
		    }
		
		
	}//main

}
