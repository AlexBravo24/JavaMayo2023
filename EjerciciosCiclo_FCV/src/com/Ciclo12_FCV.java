package com;

import java.util.Scanner;

public class Ciclo12_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresan un conjunto de n edades de personas 
		//por teclado. El programa finalizara cuando el promedio
		//de las edades sea superior a 25.
		
		int promedio=0, suma=0, edad=0, personas=0;
		Scanner entrada = new Scanner (System.in);
		do {
			personas++;
			System.out.println("Ingresar la edad");
			edad=entrada.nextInt();
			suma=suma+edad;
			promedio=suma/personas;

		}while(promedio<=25);
		System.out.println("Cantidad de personas "+personas);
		System.out.println("El promedio es: "+promedio);


	}

}
