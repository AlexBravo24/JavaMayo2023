package com;

import java.util.Scanner;

public class Ciclos9_EIMD {
public static void main(String[] args) {
/*
 9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos 
 */
	
	
	double uno,dos;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer numero");
	uno=sc.nextDouble();
	System.out.println("Ingrese el segundo n�mero");
	dos=sc.nextDouble();
	
	for (double i = uno; i <= dos; i++) {
		if(i%2==0) {
		
			System.out.println(i);
	}}
	sc.close();
	
}

}
