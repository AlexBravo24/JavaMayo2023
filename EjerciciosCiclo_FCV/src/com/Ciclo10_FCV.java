package com;

import java.util.Scanner;

public class Ciclo10_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lea 20 números e indique si 
		//son positivos o negativos y pares o impares y 
		//además muestre la sumatoria de los positivos y 
		//sumatoria de los impares.
		int n1;
		
		int positivos=0, impares=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa para introducir 20 números");
		for(int i=0; i<=20; i++) {
			System.out.println("Favor de introducir un número");
			n1=entrada.nextInt();
			if(n1==0) {
				System.out.println("El número es el 0");
			}//IF 1
			else if(n1>0) {
				System.out.println("El número es positivo");
				positivos=positivos+n1;
				 if(n1%2==0) {
					System.out.println("El número es par");
				}
				 if(n1%2 !=0) {
						System.out.println("El número es impar");
						impares=impares+n1;
					}
				
			}//IF 2
			else if(n1<0) {
				System.out.println("El número es negativo");
				 if(n1%2==0) {
					System.out.println("El número es par");
				}
				 if(n1%2 !=0) {
						System.out.println("El número es impar");
						impares=impares+n1;
					}
			}//IF 3
			
			
		}//FOR
		System.out.println("La sumatoria de los números positivos es: "+positivos);
		System.out.println("La sumatoria de los números impares es: "+impares);

	}

}
