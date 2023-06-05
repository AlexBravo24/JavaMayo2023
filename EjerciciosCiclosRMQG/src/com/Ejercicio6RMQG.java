package com;

public class Ejercicio6RMQG {
    public static void main(String[] args) {
		/*
		 * Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de
		 * inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al
		 * cabo de un a�o si todo el dinero lo reinvierte?
		 */
        double inversion = 1000.0;
        double interesMensual = 0.02;
        int meses = 12;
        for (int i = 1; i <= meses; i++) {
            inversion += inversion * interesMensual;
        }
        System.out.printf("Al cabo de un a�o, la persona tendr� $%.2f", inversion);
    }
}