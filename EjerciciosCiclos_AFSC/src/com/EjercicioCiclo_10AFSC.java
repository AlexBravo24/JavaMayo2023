package com;

import java.util.Scanner;

public class EjercicioCiclo_10AFSC {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique 
		// si son positivos o negativos y pares o impares 
		// y además muestre la sumatoria de los positivos y sumatoria de los impares.
		Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Escribe un numero (0 para acabar): ");
        numero = entrada.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("El numero es 'Positivo' y es ");
            } else {
                System.out.print("El numero es 'Negativo' y es ");
            }
            if(numero % 2 == 0){
                System.out.println("'Par'");
            }else{
                System.out.println("'Impar'");
            }

            System.out.print("\nIntroduce un número (0 para acabar): ");                                  
            numero = entrada.nextInt();
        }
        System.out.println("La sumatoria de los positivos es:   "+numero);

	}

}
