package com;

import java.util.Scanner;

public class Ejercicio9_EAGG {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) 
		// y escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.

		int dia;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero del 1 al 7 para mostrarte un d�a de la semana");
		
		dia = entrada.nextInt();
		
		if (dia==1) {
			System.out.println("Lunes");
		}else if (dia==2) {
			System.out.println("Martes");
		}else if (dia==3) {
			System.out.println("Miercoles");
		}else if(dia==4) {
			System.out.println("Jueves");
		}else if(dia==5) {
			System.out.println("Viernes");
		}else if(dia==6) {
			System.out.println("S�bado");
		}else if(dia==7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}

}
