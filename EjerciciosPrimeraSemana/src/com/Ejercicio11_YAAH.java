package com;

import java.util.Scanner;

public class Ejercicio11_YAAH {

	public static void main(String[] args) {
		// 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
//		Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
//		cuestiones de log�stica y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//		de la entrega.
//		
		
		String pais;
		String pais2;
		double peso;
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Introduzca el pa�s a viajar:  ");
		pais = into.nextLine();
		
		System.out.println("Introduzca el peso:  ");
		peso = into.nextDouble();
		
		pais2 = pais.toLowerCase();
		
		if (peso <=5 && pais2.equals("america del norte") ) {
			System.out.println("El costo por servicio de paqueteria es: " + (peso*24) + " euros");
		
		}else if (peso <=5 &&  pais2.equals("america central") ) {
			System.out.println("El costo por servicio de paqueteria es: " + (peso*20) + " euros");
			
		}else if (peso <=5 &&  pais2.equals("america del sur") ) {
			System.out.println("El costo por servicio de paqueteria es: " + (peso*21) + " euros");
			
		}else if (peso <=5 &&  pais2.equals("europa") ) {
			System.out.println("El costo por servicio de paqueteria es: " + (peso*10) + " euros");
			
		}else if (peso <=5 &&  pais2.equals("asia") ) {
			System.out.println("El costo por servicio de paqueteria es: " + (peso*18) + " euros");
			
		}else if ( peso > 5 )  {
			System.out.println("El paquete pesa m�s de 5Kg, RECHAZADA");
			
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
	}

}
