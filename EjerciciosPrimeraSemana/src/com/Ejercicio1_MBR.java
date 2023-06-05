package com;

import java.util.Scanner;

public class Ejercicio1_MBR {

	public static void main(String[] args) {
		/* 1.Realiza un programa que reciba dos números por 
		 * teclado e indique cuál es mayor o si son iguales.*/
		int numero1;
	    int numero2;
		Scanner scanner = new Scanner (System.in);
	    
	// Se solicitan los datos a introducir 
	    System.out.println("SE INDICA CUAL ES EL NUMERO MAYOR");
	    System.out.print("Introduce el primer número: ");
	    numero1 = scanner.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    numero2 = scanner.nextInt();
	    
	// Se realiza un if anidado
	    if (numero1 > numero2){
	        System.out.println("El primer número [" +numero1 + "] es mayor que el número dos," +numero2);
	    }else if (numero1 < numero2){
	        System.out.println("El segundo número [" +numero2 + "] es mayor que el segundo número [" +numero1 + "]");
	    }else {
	        System.out.println("Ambos números son iguales, " +numero1);
	    }    

	}

}
