package com;

import java.util.Scanner;

public class Ejercicio2_JAVC {

	public static void main(String[] args) {
		
		// 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar
		
    int numero;

    Scanner entrada = new Scanner (System.in);
	
	System.out.println("Introduce un Numero");
	
	numero = entrada.nextInt();
	
	if (numero%2==0) {
		System.out.println("El Numero es Par ");
		
	}

	else { 
		System.out.println("El numero es Impar ");
		
	}


		
		
		
	}

}
