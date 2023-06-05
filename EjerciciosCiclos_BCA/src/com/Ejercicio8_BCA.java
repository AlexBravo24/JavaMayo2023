package com;
import java.util.Scanner;
public class Ejercicio8_BCA {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
	   int num1=2, num2;
	   System.out.println("ingresa el primer numero");
	   
	   num1=entrada.nextInt();
	   
	   System.out.println("ingresa el segundo numero");
	   num2=entrada.nextInt();
	   
		
	do {
		
		 System.out.println(num1);
		num1++;
	} while (num1<num2);

	}

}
