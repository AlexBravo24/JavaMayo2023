package com;

import java.util.Scanner;

public class EjercicioCiclo_JHC {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???

		 int Multiplicando ;
		 System.out.println("Este programa realiza una tabla de multiplicar: ");
	       System.out.println("Ingrese el primer valor a multiplicar");
	       Scanner valor1 = new Scanner(System.in);
	       Multiplicando = valor1.nextInt();
	    
	       int multiplicador;
	       System.out.println("Ingrese el segundo valor a multiplicar: ");
	       Scanner valor2 = new Scanner(System.in);
	       multiplicador = valor2.nextInt();
	       
	       for(multiplicador = 1; Multiplicando <= multiplicador	 ;multiplicador++){
	       System.out.println("El resultado es\n" + Multiplicando + " X " + multiplicador +         " = " + Multiplicando * multiplicador );
	         }  
	}

}
