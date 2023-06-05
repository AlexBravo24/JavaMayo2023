package com;
import java.util.Scanner;
public class Ejercicio14RMQG {
    public static void main(String[] args) {
		/*
		 * Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa
		 * y lo reparte entre uncentro de salud, un comedor de ni�os y una parte lo
		 * invierte en la bolsa de acuerdo a lo siguiente:Si el monto de la donaci�n es
		 * de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�osy
		 * el resto se invierte en la bolsa. Si el monto de la donaci�n es menor que
		 * $10000: 25% se destina al centro de salud, 60% al comedor deni�os y el resto
		 * se invierte en la bolsa. La instituci�n desea saber cu�nto de dinero
		 * destinar� a cada rubro anualmente.
		 */
        Scanner scanner = new Scanner(System.in);
        int horasTrabajadas;
        double salario;

        System.out.print("Ingresa el n�mero de horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();
        scanner.close();

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16;
        } else {
            salario = 40 * 16 + (horasTrabajadas - 40) * 20;
        }

        System.out.println("El salario semanal del obrero es de " + salario + " d�lares.");
    }
}