package com;

import java.util.Scanner;

public class PrecioUva {

	public static void main(String[] args) {
		int base;
        String tipo;
        int tamaño;
        double base2;
        double resultado=0;
        int kilo;
		Scanner valor=new Scanner(System.in);
		

		System.out.println("Ingresa tipo Uva:");
		tipo=valor.nextLine();
		System.out.println("Ingresa los KG de uvas");
		kilo=valor.nextInt();
		System.out.println("Ingresa el precio de KG de Uva porfavor:");
		base=valor.nextInt();
		System.out.println("Ingresa el tamaño:");
		tamaño=valor.nextInt();
		 
		if(tipo.equalsIgnoreCase("A") && tamaño == 1) {
	            base2 = base * 0.20;
	            resultado = base + base2;
	        } else if(tipo.equalsIgnoreCase("A") && tamaño == 2) {
	            base2 = base * 0.30;
	            resultado = base + base2;
	        } else if(tipo.equalsIgnoreCase("B") && tamaño == 1) {
	            base2 = base * 0.30;
	            resultado = base - base2;
	        } else if(tipo.equalsIgnoreCase("B") && tamaño == 2) {
	            base2 = base * 0.50;
	            resultado = base - base2;
	        }

	        System.out.println("EL precio es: " + resultado * kilo);	
	        }

}
