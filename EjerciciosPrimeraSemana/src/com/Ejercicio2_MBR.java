package com;

import java.util.Scanner;

public class Ejercicio2_MBR {

	public static void main(String[] args) {
		/*
		 * 2.Realiza un programa que pida un n�mero por teclado 
		 * y nos indique si es par o impar.
		 */
		int numero;
        Scanner entrada = new Scanner( System.in );

        System.out.printf( "INTRODUCE UN N�MERO: " );
        numero = entrada.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "Este n�mero es par" );
        }
        else
        {
            System.out.printf( "Este n�mero es impar" );
        }
    }

	

}
