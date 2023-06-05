package com;

public class Ciclos6_OBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        double capitalInicial = 1000.00; // Capital inicial de $1000.00
		        double tasaInteres = 0.02; // Tasa de interés mensual del 2%
		        int meses = 12; // Número de meses en un año

		        // Calcular la cantidad de dinero después de un año
		        double capitalFinal = calcularCapitalFinal(capitalInicial, tasaInteres, meses);

		        // Mostrar el resultado
		        System.out.println("Después de un año, la cantidad de dinero será: $" + capitalFinal);
		    }

		    // Método para calcular la cantidad de dinero después de un año
		    public static double calcularCapitalFinal(double capitalInicial, double tasaInteres, int meses) {
		        double capitalFinal = capitalInicial;
		        for (int i = 0; i < meses; i++) {
		            capitalFinal += capitalFinal * tasaInteres; // Calcula el interés mensual y lo suma al capital final
		        }
		        return capitalFinal;
		        
		        
		    }
		}

	


