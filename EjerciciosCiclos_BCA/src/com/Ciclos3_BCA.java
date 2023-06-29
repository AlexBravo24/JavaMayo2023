package com;
//3. Realiza un programa para determinar si un String es palíndromo. 

import java.util.Scanner;
public class Ciclos3_BCA {
	

	public static void main(String[] args) {
	
	
	String p1, p2;
	int op;
	Scanner entrada=new Scanner(System.in);
	
	do {
		
	
	System.out.println("Ingresa una frase");
	
	p1 = entrada.next();
	p2 = p1.replace(" ", "");
	StringBuffer b = new StringBuffer(p2);
	b=b.reverse();
	if(p2.equalsIgnoreCase(b.toString())) {
		
		System.out.println("La palabra '"+ p2 + "' Si es palindromo");
		
	}else {
		System.out.println("La palabra '"+ p2 + "' No es palindromo");
		
	}
	System.out.println("Oprima 1 para ingresar otra palabra o 2 para salir");
	op=entrada.nextInt();
	
	} while (op != 2);
		
	}

	
}
