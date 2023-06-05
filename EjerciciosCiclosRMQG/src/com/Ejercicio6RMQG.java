package com;

public class Ejercicio6RMQG {
    public static void main(String[] args) {
		/*
		 * Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al
		 * cabo de un año si todo el dinero lo reinvierte?
		 */
        double inversion = 1000.0;
        double interesMensual = 0.02;
        int meses = 12;
        for (int i = 1; i <= meses; i++) {
            inversion += inversion * interesMensual;
        }
        System.out.printf("Al cabo de un año, la persona tendrá $%.2f", inversion);
    }
}