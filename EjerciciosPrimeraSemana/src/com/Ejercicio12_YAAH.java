package com;

import java.util.Scanner;

public class Ejercicio12_YAAH {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//			Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
//			ser introducidos por teclado por el usuario.

		
		
		
//		Scanner enter = new Scanner(System.in);
//		
//		System.out.println("Introduce tu altura: ");
//		double altura = enter.nextDouble();
//		
//		System.out.println("Introduce tu peso: ");
//		double peso = enter.nextDouble();
//		
//		
//		double imc = peso/(altura * altura);
//	
//		if (imc < 16) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Criterio de ingreso en hospital");
//		
//		}else if (imc >= 16 && imc < 17) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Infrapeso");
//		
//		}else if (imc >= 17 && imc < 18) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Bajo peso");
//		
//		}else if (imc >= 18 && imc < 25) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Peso normal (Saludable");
//		
//		}else if (imc >= 25 && imc < 30) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Sobrepeso (Obesidad de grado I)");
//		
//		}else if (imc >= 30 && imc < 35) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Sobrepeso crónico (Obesidad de grado II)");
//		
//		}else if (imc >= 35 && imc <= 40) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Sobrepeso premórbida (Obesidad de grado III)");
//		
//		}else if (imc > 40) {
//			System.out.println("Su IMC es: " + imc);
//			System.out.println("Obesidad mórbida (Obesidad de grado IV)");
//		
//		}else {
//			System.out.println("Error");
//		}
//		
		
//		double imc;
//		double altura = 1.8;
//		double peso = 80;
//		
//		imc = peso/ (altura*altura);
//		
//		System.out.printf("%.2f",imc);
		// redondea
//		System.out.printf(Math.round(imc));
		
		
//		Scanner in = new Scanner(System.in);
//		double numero;
//		
//		System.out.println("Introduce un número decimal: ");
//		numero = in.nextDouble();
//		
//		System.out.println("El número decimal es: " + numero);
//		
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce un número decimal: ");
	        double numero = scanner.nextDouble();
	        
	        System.out.println("El número decimal introducido es: " + numero);
	        
	        scanner.close();
		
		
		
	}

}
