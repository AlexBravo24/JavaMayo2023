package com;

import java.util.Scanner;

public class Ejercicio1_MBR {

	public static void main(String[] args) {
		/* 1.Realiza un programa que reciba dos n�meros por 
		 * teclado e indique cu�l es mayor o si son iguales.*/
		int numero1;
	    int numero2;
		Scanner scanner = new Scanner (System.in);
	    
	// Se solicitan los datos a introducir 
	    System.out.println("SE INDICA CUAL ES EL NUMERO MAYOR");
	    System.out.print("Introduce el primer n�mero: ");
	    numero1 = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    numero2 = scanner.nextInt();
	    
	// Se realiza un if anidado
	    if (numero1 > numero2){
	        System.out.println("El primer n�mero [" +numero1 + "] es mayor que el n�mero dos," +numero2);
	    }else if (numero1 < numero2){
	        System.out.println("El segundo n�mero [" +numero2 + "] es mayor que el segundo n�mero [" +numero1 + "]");
	    }else {
	        System.out.println("Ambos n�meros son iguales, " +numero1);
	    }    

	}

}
