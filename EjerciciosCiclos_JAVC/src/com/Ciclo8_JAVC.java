package com;

import java.util.Scanner;

public class Ciclo8_JAVC {

	public static void main(String[] args) {
		
		
		//8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor
		
		int num1, num2;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresar el Primer Numero ");
		
		num1 = entrada.nextInt();
		
		System.out.println("Ingresar el Segundo Numero ");
		
		num2 = entrada.nextInt();
		
		do {
			
			System.out.println(num1);
			
			num1++;
			
		} while  (num1<num2);
		
		
	
		
		
		
		
	}

}
