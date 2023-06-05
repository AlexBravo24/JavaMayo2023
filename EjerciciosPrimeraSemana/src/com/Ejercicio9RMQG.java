package com;
import java.util.Scanner;

public class Ejercicio9RMQG {
    public static void main(String[] args) {
    	
		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */
    	
        Scanner scanner = new Scanner(System.in);
        int dia;
        String diaSemana;

        System.out.print("Ingresa el número del día de la semana (del 1 al 7): ");
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
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("ERROR: número incorrecto");
                return;
        }

        System.out.println("El día correspondiente al número ingresado es " + diaSemana + ".");
    }
}