package com;

import java.util.Scanner;

public class Ejercicio3_FCV {
	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el
		//segundo n�mero es 0, debe mostrar un mensaje de error.
		
		double numero1;
		double numero2;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenidos");
		System.out.println("Por favor introduzca el primer n�mero");
		
		numero1=entrada.nextInt();
		
		System.out.println("Por favor introduzca el segundo n�mero");
		
		numero2=entrada.nextInt();
		
		if(numero2!=0) {
			
			resultado=(numero1/numero2);
			System.out.println("El resultado de la divisi�n es: ");
			System.out.println(resultado);
		}
		else {
			System.out.println("Error");
		}
	}

}
