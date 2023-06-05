package com;

public class Ciclo7_JOLC {

	public static void main(String[] args) {
		/*Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero? */
		double initialInvestment = 700.00;
        double targetAmount = 1500.00;
        double interestRate = 0.02;
        int months = 0;

        while (initialInvestment < targetAmount) {
            initialInvestment += initialInvestment * interestRate;
            months++;
        }

        System.out.println("El tiempo necesario en meses para alcanzar más de $1500 es: " + months + " meses");
    }
}

