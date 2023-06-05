package com;

import java.util.Scanner;

public class Ejercicio1_1_AFSC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique 
		//cuál es mayor o si son iguales.
		
		int numero1;
		int numero2;
		Scanner entrada1 =new Scanner(System.in);
		System.out.println("Introduce el primer numero:  ");
		numero1=entrada1.nextInt();
		Scanner entrada2 =new Scanner(System.in);
		System.out.println("Introduce el segundo numero:  ");
		numero2=entrada2.nextInt();
		if (numero1>numero2) {
		System.out.println(numero1+"Es mayor que "+numero2);
		}else if(numero1<numero2) {
		System.out.println(numero1+"Es menor que "+numero2);
		}else if(numero1==numero2) {
		System.out.println(numero1+"Es igual que "+numero2);
		}
		
}//main


}//clase