package com;

public class Ejercicio7RMQG {
	/* Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
	mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
	dinero?*/

    public static void main(String[] args) {
        double inversion = 700.0;
        double interesMensual = 0.02;
        int meses = 0;
        while (inversion <= 1500) {
            inversion += inversion * interesMensual;
            meses++;
        }
        System.out.println("La persona tendrá más de $1500 en " + meses + " meses.");
    }
}