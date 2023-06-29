package com;

public class Ciclos6_OBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        double capitalInicial = 1000.00; // Capital inicial de $1000.00
		        double tasaInteres = 0.02; // Tasa de inter�s mensual del 2%
		        int meses = 12; // N�mero de meses en un a�o

		        // Calcular la cantidad de dinero despu�s de un a�o
		        double capitalFinal = calcularCapitalFinal(capitalInicial, tasaInteres, meses);

		        // Mostrar el resultado
		        System.out.println("Despu�s de un a�o, la cantidad de dinero ser�: $" + capitalFinal);
		    }

		    // M�todo para calcular la cantidad de dinero despu�s de un a�o
		    public static double calcularCapitalFinal(double capitalInicial, double tasaInteres, int meses) {
		        double capitalFinal = capitalInicial;
		        for (int i = 0; i < meses; i++) {
		            capitalFinal += capitalFinal * tasaInteres; // Calcula el inter�s mensual y lo suma al capital final
		        }
		        return capitalFinal;
		        
		        
		    }
		}

	


