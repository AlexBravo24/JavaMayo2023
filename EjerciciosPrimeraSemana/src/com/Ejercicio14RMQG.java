package com;
import java.util.Scanner;
public class Ejercicio14RMQG {
    public static void main(String[] args) {
		/*
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa
		 * y lo reparte entre uncentro de salud, un comedor de niños y una parte lo
		 * invierte en la bolsa de acuerdo a lo siguiente:Si el monto de la donación es
		 * de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niñosy
		 * el resto se invierte en la bolsa. Si el monto de la donación es menor que
		 * $10000: 25% se destina al centro de salud, 60% al comedor deniños y el resto
		 * se invierte en la bolsa. La institución desea saber cuánto de dinero
		 * destinará a cada rubro anualmente.
		 */
        Scanner scanner = new Scanner(System.in);
        int horasTrabajadas;
        double salario;

        System.out.print("Ingresa el número de horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();
        scanner.close();

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16;
        } else {
            salario = 40 * 16 + (horasTrabajadas - 40) * 20;
        }

        System.out.println("El salario semanal del obrero es de " + salario + " dólares.");
    }
}