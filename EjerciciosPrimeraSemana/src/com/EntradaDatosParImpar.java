package com;

import java.util.Scanner;

public class EntradaDatosParImpar {
	
     public static void main(String[] args) {
    Scanner valor=new Scanner(System.in);
    	 int numero;
    	 System.out.println("Ingresa un numero:");
    	 numero=valor.nextInt();
    	 
    	 if(numero % 2 ==0) {
    		 System.out.println("El numero es par");
    	 } else {
    		 System.out.println("El numero no es par");
    	 }
    	 
     }
}
