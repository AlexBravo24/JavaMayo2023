package com;

public class Ciclo6_JOLC {

	public static void main(String[] args) {
		/*Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		todo el dinero lo reinvierte?*/
		
		double inversionInicial = 1000.00;
		
        double tasaInteresMensual = 0.02;
        int meses = 12;

        double saldoFinal = inversionInicial;
        for (int i = 0; i < meses; i++) {
            saldoFinal += saldoFinal * tasaInteresMensual;
            
        }

        System.out.println("El saldo final despu�s de un a�o es: $" + saldoFinal);
            
        

    }


    }

           

   


