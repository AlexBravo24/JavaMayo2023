package com;

import java.util.Scanner;

public class Ciclos10_EIMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 10. Programa que lea 20 números e indique si son positivos o negativos y pares o
impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
 */
		double numeros[]=new double[20],pares=0,impares=0;
		
		Scanner sc =new Scanner(System.in);
		for (int i = 0; i <20; i++) {
			System.out.println();
				System.out.println("\tIntroduce el numero: "+i);
				numeros[i]=sc.nextDouble();
				if(numeros[i]>0) {
					System.out.print("El número es positivo");
				}else {System.out.print("El número es negativo");}
				
				if(numeros[i]%2==0) {
					pares=pares+numeros[i];
					System.out.println(" y es par");
				}else {
					impares=impares+numeros[i];
					System.out.println(" y es impar");
				}
		}
		System.out.println();
		System.out.println("\tLa suma de los pares es: "+pares);
		System.out.println("\tLa suma de los impares es: " +impares);
		sc.close();
	}

}
