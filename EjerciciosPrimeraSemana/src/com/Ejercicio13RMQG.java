package com;
import java.util.Scanner;

public class Ejercicio13RMQG {
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
        double donacion;
        double centroSalud;
        double comedorNinos;
        double inversion;

        System.out.print("Ingresa el monto total de la donaci�n: ");
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

        System.out.println("La instituci�n destinar� " + centroSalud + " d�lares al centro de salud.");
        System.out.println("La instituci�n destinar� " + comedorNinos + " d�lares al comedor de ni�os.");
        System.out.println("La instituci�n destinar� " + inversion + " d�lares a la bolsa.");
    }
}