package com;

import java.util.Scanner;

public class Ejercicio3_JOLC {


	
	  public static void main(String[] args) {
		  
		  
		  
	    Scanner scanner = new Scanner (System.in);
	    int numerador;
	    int denominador;
	
	    
	    
	    System.out.println("Este programa muestra la division entre dos n�meros enteros:");
	    System.out.print("Introduce el primer n�mero: ");
	    numerador = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    denominador = scanner.nextInt();
	    
	  
	    if (denominador != 0){
	        System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("El segundo n�mero introducido es 0. "
	            + "Reinicie el programa e introduzca un valor v�lido.");
	    }  
	  }
	}

