package com;

import java.util.Scanner;

public class Ejercicio1_YAAH {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos 
		// n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		
		int number1, number2;
		
		Scanner intro =new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");	
		number1 = intro.nextInt();
		
		System.out.println("Introduce otro n�mero");	
		number2 = intro.nextInt();
		
		if ( number1 > number2 ) {
			System.out.println("El n�mero " + number1 + " es mayor que el n�mero " + number2);
		}else if(number1 < number2){
			System.out.println("El n�mero " + number2 + " es mayor que el n�mero " + number1);
		}else {
			System.out.println("El n�mero " + number2 + " es igual que el n�mero " + number1);
			
		}
	}
		
		
		
		
		
		
		

	

}
