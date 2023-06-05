package com;

import java.util.Scanner;

public class Ejercicio12RMQG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        while (avg <= 25) {
            System.out.println("Ingresa una edad: ");
            int age = scanner.nextInt();
            scanner.close();
            sum += age;
            count++;
            avg = (double) sum / count;
        }
        System.out.println("El promedio de las edades ingresadas es: " + avg);
    }
}
