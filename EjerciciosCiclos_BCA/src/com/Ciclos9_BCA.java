package com;

import java.util.Scanner;

public class Ciclos9_BCA {
 //Programa Java que lea dos números y muestre los números pares entre ellos 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("Los números pares entre " + num1 + " y " + num2 + " son: ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

	}

}
