package com;

import java.util.Scanner;

public class Ejercicio5_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		int edad;
		int nota;
		String sexo;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bienvenidos");
		System.out.println("Favor de introducir su edad");
		
		edad=entrada.nextInt();
		
		System.out.println("Favor de introducir su nota");
		
		nota=entrada.nextInt();
		
		System.out.println("Favor de introducir su sexo solo con la letra F o M");
		
		sexo=entrada.next();
		
		if((nota==5)&&(edad==18)&&(sexo.equals("M"))){
			System.out.println("POSIBLE");
		}else if((nota==5)&&(edad==18)&&(sexo.equals("F"))) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("No aceptada");
		}
		
	}

}
