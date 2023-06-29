package com;

public class Ciclo6_JOLC {

	public static void main(String[] args) {
		/*Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		todo el dinero lo reinvierte?*/
		
		double inversionInicial = 1000.00;
		
        double tasaInteresMensual = 0.02;
        int meses = 12;

        double saldoFinal = inversionInicial;
        for (int i = 0; i < meses; i++) {
            saldoFinal += saldoFinal * tasaInteresMensual;
            
        }

        System.out.println("El saldo final después de un año es: $" + saldoFinal);
            
        

    }


    }

           

   


