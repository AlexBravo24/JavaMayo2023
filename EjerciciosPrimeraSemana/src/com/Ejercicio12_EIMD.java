package com;

import java.util.Scanner;

public class Ejercicio12_EIMD {
public static void main(String[] args) {
	/*
	 Construir un programa que calcule el índice de masa corporal de una persona 
	 (IMC = peso [kg] / altura2
[m]) e indique el estado en el que se encuentra esa persona en función del valor 
de IMC:

IMC				Diagnostico
<16				Criterio de ingreso en hospital
de 16 a 17 		infrapeso
de 17 a 18 		bajo peso
de 18 a 25 		peso normal(saludable)
de 25 a 30 		sobre peso (obesidad de grado I)
de 30 a 35 		sobre peso crónico (obesidad de grado II)
de 35 a 40 		obesidad premórbida (obesidad de grado III)
>40 			obesidad morbida (obesidad de grado IV)
 
Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
ser introducidos por teclado por el usuario
	 */
	
	String peso, altura ;
	double imc;
	Scanner sc =new Scanner(System.in);
	System.out.println("Dime tu peso [kg]");
	peso=sc.nextLine();
	double pr=Double.parseDouble(peso);
	System.out.println("Dime tu altura [m]");
	altura=sc.nextLine();
	double ar=Double.parseDouble(altura);
	imc=pr/(ar*ar);
	
	if (imc<16) {
		System.out.printf("Tu Indice de Masa Corporal es: " +imc+"\nDiagnostico: Criterio de ingreso en hospital");
		
		
	}else if  (imc>=16 && imc<17 ) {
		System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nDiagnostico: infrapeso");
		}else if  (imc>=17 && imc<18 ) {
			System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nDiagnostico: bajo peso");
			}else if  (imc>=18 && imc<25 ) {
				System.out.println("Tu Indice de Masa Corporal es: " +imc+"\npeso normal(saludable)");
				}else if  (imc>=25 && imc<30 ) {
					System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nsobre peso (obesidad de grado I)");
					}else if  (imc>=30 && imc<35 ) {
						System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nsobre peso crónico (obesidad de grado II)");
						}else if  (imc>=35 && imc<40 ) {
							System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nobesidad premórbida (obesidad de grado III)");
							}else if  (imc>40 ) {
								System.out.println("Tu Indice de Masa Corporal es: " +imc+"\nobesidad premórbida (obesidad de grado III)");
								}
		
	sc.close();
	
}

}
