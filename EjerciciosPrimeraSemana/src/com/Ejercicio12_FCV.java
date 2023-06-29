package com;

import java.util.Scanner;

public class Ejercicio12_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				/*Construir un programa que calcule el índice de masa corporal de una persona
				(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se
				encuentra esa persona en función del valor de IMC**/
		double peso;
		double altura;
		double imc;
		
		System.out.println("Bienvenido");
		System.out.println("Introduzca su peso en Kg");
		Scanner entrada = new Scanner (System.in);
		
		peso=entrada.nextDouble();
		
		System.out.println("Introduzca su altura en metros");
		
		altura=entrada.nextDouble();
		
		System.out.println(altura);
		
		imc=peso/((altura)*(altura));
		
		if(imc<16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if((imc>=16)&&(imc<17)){
			System.out.println("Infrapeso");
		}else if((imc>=17)&&(imc<18)){
			System.out.println("Bajo peso");
		}else if((imc>=18)&&(imc<25)){
			System.out.println("Peso normal");
		}else if((imc>=25)&&(imc<30)){
			System.out.println("Sobrepeso");
		}else if((imc>=30)&&(imc<35)){
			System.out.println("Sobrepeso crónico");
		}else if((imc>=35)&&(imc<40)){
			System.out.println("Obesidad premórbida");
		}else if((imc>40)){
			System.out.println("Obesidad mórbida");
		}
		

	}

}
