package com;

import java.util.Scanner;

public class EjercicioCiclo_12AFSC {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea superior a 25.
		Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Escribe tu edad : ");
        numero = entrada.nextInt();

        while (numero != 25) {

            if (numero > 0) {
                System.out.print("Ingresa otra edad");
            } else {
                System.out.print("Ingresa otra edad");
            }

            }


	}

}
