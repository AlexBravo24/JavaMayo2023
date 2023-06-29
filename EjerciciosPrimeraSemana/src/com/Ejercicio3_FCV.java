package com;

import java.util.Scanner;

public class Ejercicio3_FCV {
	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error.
		
		double numero1;
		double numero2;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenidos");
		System.out.println("Por favor introduzca el primer número");
		
		numero1=entrada.nextInt();
		
		System.out.println("Por favor introduzca el segundo número");
		
		numero2=entrada.nextInt();
		
		if(numero2!=0) {
			
			resultado=(numero1/numero2);
			System.out.println("El resultado de la división es: ");
			System.out.println(resultado);
		}
		else {
			System.out.println("Error");
		}
	}

}
