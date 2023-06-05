package com;

public class Ciclos7_OBA {

	public static void main(String[] args) {
		
		
		
		        double capitalInicial = 700.00; // Capital inicial de $700.00
		        double tasaInteres = 0.02; // Tasa de inter�s mensual del 2%
		        double capitalObjetivo = 1500.00; // Capital objetivo de $1500.00

		        // Calcular el n�mero de meses necesarios para alcanzar el capital objetivo
		        int meses = calcularMesesParaCapitalObjetivo(capitalInicial, tasaInteres, capitalObjetivo);

		        // Mostrar el resultado
		        System.out.println("La persona tendr� m�s de $" + capitalObjetivo + " en " + meses + " meses.");
		    }

		    // M�todo para calcular el n�mero de meses necesarios para alcanzar el capital objetivo
		    public static int calcularMesesParaCapitalObjetivo(double capitalInicial, double tasaInteres, double capitalObjetivo) {
		        double capitalActual = capitalInicial;
		        int meses = 0;

		        while (capitalActual < capitalObjetivo) {
		            capitalActual += capitalActual * tasaInteres; // Calcula el inter�s mensual y lo suma al capital actual
		            meses++;
		        }

		        return meses;
		        
		        
		    }
		

	}


