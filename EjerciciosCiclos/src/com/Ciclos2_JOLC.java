package com;

import java.util.Scanner;

public class Ciclos2_JOLC {

	public static void main(String[] args) {
		
		/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
        desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
        23 x 95 = ?
          */
		Scanner entrada = new Scanner (System.in);
		int valor1;
		int valor2; 
		System.out.println("ingresa la tabla que quieras realizar");
		valor1=entrada.nextInt();
		System.out.println("ingresa hasta donde quieras realizar la multiplicacion");
		valor2 = entrada.nextInt();
		
		if (valor1>0) {
			for (int i = 1; i <= valor2; i++) 
				System.out.println(valor1 +"x" + i +"=" + valor1*i);
			
		} else {System.out.println("el numero que introducio es incorrecto");
			
			
		
			{
				
			}
		
		
		
				
	
			
		}
	
		
		
		
		}
			
		}
		

	 


