package com;

import java.util.Scanner;

public class Ciclo10_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lea 20 n�meros e indique si 
		//son positivos o negativos y pares o impares y 
		//adem�s muestre la sumatoria de los positivos y 
		//sumatoria de los impares.
		int n1;
		
		int positivos=0, impares=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa para introducir 20 n�meros");
		for(int i=0; i<=20; i++) {
			System.out.println("Favor de introducir un n�mero");
			n1=entrada.nextInt();
			if(n1==0) {
				System.out.println("El n�mero es el 0");
			}//IF 1
			else if(n1>0) {
				System.out.println("El n�mero es positivo");
				positivos=positivos+n1;
				 if(n1%2==0) {
					System.out.println("El n�mero es par");
				}
				 if(n1%2 !=0) {
						System.out.println("El n�mero es impar");
						impares=impares+n1;
					}
				
			}//IF 2
			else if(n1<0) {
				System.out.println("El n�mero es negativo");
				 if(n1%2==0) {
					System.out.println("El n�mero es par");
				}
				 if(n1%2 !=0) {
						System.out.println("El n�mero es impar");
						impares=impares+n1;
					}
			}//IF 3
			
			
		}//FOR
		System.out.println("La sumatoria de los n�meros positivos es: "+positivos);
		System.out.println("La sumatoria de los n�meros impares es: "+impares);

	}

}
