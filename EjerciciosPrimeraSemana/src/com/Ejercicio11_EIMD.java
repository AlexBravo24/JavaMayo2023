package com;

import java.util.Scanner;

public class Ejercicio11_EIMD {

	public static void main(String[] args) {
/*
 11. Una compa��a de transporte internacional 
 tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica
Central, Am�rica del Sur, Europa y Asia. 
El costo por servicio de transporte se basa en el peso del paquete y
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
ZONA UBICACI�N 				COSTO/KILOGRAMO
1 Am�rica del Norte			 24,00  Euros
2 Am�rica Central			 20, 00  Euros
3 Am�rica del Sur 			21,00  Euros
4 Europa 					10,00  Euros
5 Asia 						18,00  Euros
Parte de su pol�tica implica que los paquetes 
con un peso superior a 5kg no son transportados, por
cuestiones de log�stica y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, 
en su caso, el rechazo
de la entrega.
*/
		
	String peso,zona;
	double pr;
	int zr;
	Scanner sc =new Scanner(System.in);
	System.out.println("Dime el peso del producto en KG.");
	peso=sc.nextLine();
	pr=Double.parseDouble(peso);
	if (pr>5) {
		System.out.println("Se rechaz� El producto");
		System.exit(0);
	}
	System.out.println("Dime la zona :\n"
			+ "1 Am�rica del Norte \r\n" + 
			"2 Am�rica Central \r\n" + 
			"3 Am�rica del Sur \r\n" + 
			"4 Europa \r\n" + 
			"5 Asia ");
	zona=sc.nextLine();
		
	zr=  Integer.parseInt(zona);
	

	switch (zr) {
	case 1:
		System.out.println("El presio por este producto es de: " + (pr*24 ) + " Euros");
		
		break;
	case 2 :
		System.out.println("El presio por este producto es de: " + (pr*20 ) + " Euros");
		
		break;
	case 3:
		System.out.println("El presio por este producto es de: " + (pr*21 ) + " Euros");
		
		break;
	case 4:
		System.out.println("El presio por este producto es de: " + (pr*10 ) + " Euros");
		
		break;
	case 5:
		System.out.println("El presio por este producto es de: " + (pr*18 ) + "5");
		
		break;
	
		
	default:
		System.out.println("Zona desconocida");
		break;
	}
	sc.close();
	
	}

}
