package com;

import java.util.Scanner;

/*Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
Muestra por consola el �ndice y el valor al que corresponde*/

public class Array1_RMQG {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un n�mero para la posici�n " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("�ndice: " + i + ", Valor: " + numeros[i]);
        }
    }
}

