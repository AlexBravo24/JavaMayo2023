package com;

import java.util.Scanner;

public class Ejercicio2_MBR {

	public static void main(String[] args) {
		/*
		 * 2.Realiza un programa que pida un número por teclado 
		 * y nos indique si es par o impar.
		 */
		int numero;
        Scanner entrada = new Scanner( System.in );

        System.out.printf( "INTRODUCE UN NÚMERO: " );
        numero = entrada.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "Este número es par" );
        }
        else
        {
            System.out.printf( "Este número es impar" );
        }
    }

	

}
