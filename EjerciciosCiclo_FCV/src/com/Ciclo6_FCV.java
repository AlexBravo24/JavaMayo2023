package com;

import java.util.Scanner;

public class Ciclo6_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Una persona desea invertir $1000.00 en un banco, el cual 
		//le otorga un 2% de inter�s mensual. �Cu�l ser� la cantidad de 
		//dinero que esta persona tendr� al cabo de un a�o si todo el 
		//dinero lo reinvierte

		double total=0, inversion, interes;
		System.out.println("Bienvenido programa para calcular el dinero invertido en un a�o");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca la cantidad de dinero");
		inversion=entrada.nextDouble();
		System.out.println("Introduzca el inter�s");
		interes=entrada.nextDouble();
		for(int i=0; i<=12; i++) {
			inversion=inversion+(inversion*(interes/100));
		}
		System.out.println("El monto total es: "+ inversion);
		
	}

}
