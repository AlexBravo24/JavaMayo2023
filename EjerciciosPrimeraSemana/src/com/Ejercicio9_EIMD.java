package com;

import java.util.Scanner;

public class Ejercicio9_EIMD {

	public static void main(String[] args) {
	/*
	 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
introducimos otro n�mero nos da un error.
	 */
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime en numero El d�a de la semana (del 1 al 7)");
		numero=sc.nextInt();
	switch (numero) {
	case 1:
		System.out.println("El D�a de la semana es: Domingo");
		break;
	case 2:
		System.out.println("El D�a de la semana es: Lunes");
		break;
	case 3:
		System.out.println("El D�a de la semana es: Martes");
		break;
	case 4:
		System.out.println("El D�a de la semana es: Miercoles");
		break;
	case 5:
		System.out.println("El D�a de la semana es: Jueves");
		break;
	case 6:
		System.out.println("El D�a de la semana es: Viernes");
		break;
	case 7:
		System.out.println("El D�a de la semana es: Sabado");
		break;
	default:
		System.out.println("ERROR: n�mero incorrecto");
		break;
	}	
	sc.close();	
	}

}
