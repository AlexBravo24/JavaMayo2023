package com;

import java.util.Scanner;

public class Ejercicio3_JAVC {

	public static void main(String[] args) {
		
		
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
		// segundo n�mero es 0, debe mostrar un mensaje de error.
		
		
		int numerador;
		int denominador;
		
		Scanner entrada = new Scanner (System.in);
		
        System.out.println("Introduce el numerador");
		
		numerador = entrada.nextInt();
		
		System.out.println("Introduce el denominador");
		
		denominador = entrada.nextInt();
		
		if (denominador!=0) {
			System.out.println((double) numerador / (double) denominador);
		}else {
			System.out.println("El segundo numero introducido es 0 " + "Reinicie el programa e introduzca un valor valido");
			
			
			
		}
		
		
		

	}

}
