package com;

import java.util.Scanner;

public class Ejercicio12_EAGG {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el �ndice de masa corporal
		// de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado
		// en el que se encuentra esa persona en funci�n del valor de IMC:
		// Nota 1: se recomienda el empleo de sentencias if�else anidadas. 
		// Nota 2: Los operandos (peso y altura) deben ser introducidos por 
		// teclado por el usuario.

		Scanner entrada = new Scanner(System.in);
		
		double peso, altura;
				
		System.out.println("Introduce tu peso en kg");
		peso = entrada.nextDouble();
				
		System.out.println("Introduce tu altura en m");
		altura = entrada.nextDouble();	
		
		double imc= peso / (altura*altura);
		
		System.out.printf("Su IMC es: " + "%.2f ", + imc);
		
		if (imc <16) {
			System.out.println("Diagn�stico: Criterio de ingreso en hospital");
		} else if (imc <=16 && imc < 17) {
			System.out.println("Diagn�stico: Infrapeso");
		} else if (imc <=17 && imc < 18) {
			System.out.println("Diagn�stico: Bajo peso");
		} else if (imc <=18 && imc < 25) {
			System.out.println("Diagn�stico: Peso normal (saludable)");
		} else if (imc <=25 && imc < 30) {
			System.out.println("Diagn�stico: Sobrepeso (obesidad de grado I)");
		} else if (imc <=30 && imc < 35) {
			System.out.println("Diagn�stico: Sobrepeso cr�nico (obesidad de grado II)");
		} else if (imc <=35 && imc < 40) {
			System.out.println("Diagn�stico: Obesidad prem�rbida (obesidad de grado III)");
		} else {
			System.out.println("Diagn�stico: Obesidad m�rbida");
		}
		
			
	}

}