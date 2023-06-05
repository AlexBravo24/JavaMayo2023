package com;

import java.util.Scanner;

public class Ejercicio1_YAAH {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos 
		// números por teclado e indique cuál es mayor o si son iguales.
		
		
		int number1, number2;
		
		Scanner intro =new Scanner(System.in);
		
		System.out.println("Introduce un número");	
		number1 = intro.nextInt();
		
		System.out.println("Introduce otro número");	
		number2 = intro.nextInt();
		
		if ( number1 > number2 ) {
			System.out.println("El número " + number1 + " es mayor que el número " + number2);
		}else if(number1 < number2){
			System.out.println("El número " + number2 + " es mayor que el número " + number1);
		}else {
			System.out.println("El número " + number2 + " es igual que el número " + number1);
			
		}
	}
		
		
		
		
		
		
		

	

}
