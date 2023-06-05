package com;
import java.util.Scanner;

public class Ejercicio2RMQG {
	// - Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
	//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
	//23 x 95 = ???
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número para la tabla de multiplicar: ");
        int num = scanner.nextInt();
        System.out.print("Introduce el número de iteraciones que deseas: ");
        int iteraciones = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= iteraciones; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}