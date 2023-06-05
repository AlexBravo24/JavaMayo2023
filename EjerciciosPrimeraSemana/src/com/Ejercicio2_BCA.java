package com;

import java.util.Scanner;

public class Ejercicio2_BCA {
public static void main(String[] args) {
	//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar
	
	int a;
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("introduzca un número ");
	a = entrada.nextInt();
	
	if (a%2==0) {
		System.out.println(" Es un numero par");
		
	}else {
		System.out.println("Es un numero impar");
	}
	
	
	
	
}
}
