package com;

import java.util.Scanner;

public class Ejercicio4_BCA {

	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		
		Scanner entrada=new Scanner(System.in);
		char letra;
        System.out.println("Ingresar una letra: ");
        
       letra = entrada.next().charAt(0);
       if(letra > 'a' && letra < 'z')
           
           System.out.println("Esta es una letra minuscula");
        
       else 
           
          System.out.println("Esta es una letra mayuscula");


	}

}
