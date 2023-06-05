package com;
import java.util.Scanner;

public class Ejercicio13RMQG {
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
        double donacion;
        double centroSalud;
        double comedorNinos;
        double inversion;

        System.out.print("Ingresa el monto total de la donación: ");
        donacion = scanner.nextDouble();
        scanner.close();

        if (donacion >= 10000) {
            centroSalud = donacion * 0.3;
            comedorNinos = donacion * 0.5;
            inversion = donacion - centroSalud - comedorNinos;
        } else {
            centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.6;
            inversion = donacion - centroSalud - comedorNinos;
        }

        System.out.println("La institución destinará " + centroSalud + " dólares al centro de salud.");
        System.out.println("La institución destinará " + comedorNinos + " dólares al comedor de niños.");
        System.out.println("La institución destinará " + inversion + " dólares a la bolsa.");
    }
}