package com;
import java.util.Scanner;

public class Ejercicio9RMQG {
    public static void main(String[] args) {
    	
		/*
		 * Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el
		 * d�a correspondiente. Si introducimos otro n�mero nos da un error.
		 */
    	
        Scanner scanner = new Scanner(System.in);
        int dia;
        String diaSemana;

        System.out.print("Ingresa el n�mero del d�a de la semana (del 1 al 7): ");
        dia = scanner.nextInt();
        scanner.close();

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Mi�rcoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "S�bado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("ERROR: n�mero incorrecto");
                return;
        }

        System.out.println("El d�a correspondiente al n�mero ingresado es " + diaSemana + ".");
    }
}