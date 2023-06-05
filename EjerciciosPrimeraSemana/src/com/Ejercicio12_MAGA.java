package com;

import java.util.Scanner;

public class Ejercicio12_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 12: 
		 * Construir un programa que calcule el índice de masa corporal de una persona 
		 * (IMC = peso [kg] / altura2 [m]) e indique el estado en el 
		 * que se encuentra esa persona en función del valor de IMC:
		 * */
		
		Scanner e = new Scanner(System.in);
		float peso, altura, imc;
		
		System.out.println("-----------------------------------------");
		System.out.println("Calculo del IMC - Indice de Masa Corporal");
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("Indique su peso(KG): ");
		peso = e.nextFloat();
		System.out.println("Indique su altura(MTS): ");
		altura = e.nextFloat();
		imc = 0;
		
		if (altura < 1) {
			System.out.println("ERROR: altura incorrecto division by zero");
		}else {
			imc = peso / altura;
		}
		
		if (imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc >= 16 && imc <= 17) {
			System.out.println("Infrapeso");
		}else if (imc >= 17 && imc <= 18) {
			System.out.println("Bajo peso");
		}else if (imc >= 18 && imc <= 25) {
			System.out.println("Peso normal(saludable)");
		}else if (imc >= 25 && imc <= 30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}else if (imc >= 30 && imc <= 35) {
			System.out.println("Sobrepeso cronico (obesidad de grado II)");
		}else if (imc >= 35 && imc <= 40) {
			System.out.println("Obesidad premorbida (obesidad de grado III)");
		}else if (imc > 40) {
			System.out.println("Obesidad morbida (obesidad de grado IV)");
		}
	}

}
