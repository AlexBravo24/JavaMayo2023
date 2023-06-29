package com;

import java.util.Scanner;

public class Ejercicio3_BCA {
	
	public static void main(String[] args) {
		int a, b, division;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		b=entrada.nextInt();
		
		
	if(b==0) {
		System.out.println("Error");

	}else {
		division=a/b;
		System.out.println("El resultado de la division es: "+division);
		
	}
	}

}
