package com;

import java.util.Scanner;

public class Ejercicio9_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
		escriba el d�a correspondiente. Si introducimos 
		otro n�mero nos da un error.*/
		
		int dia;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Favor de introducir un n�mero");
		
		dia=entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Error, n�mero invalido");
			break;
		}

	}

}
