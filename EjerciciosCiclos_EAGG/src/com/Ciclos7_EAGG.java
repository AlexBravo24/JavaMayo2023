package com;

public class Ciclos7_EAGG {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, 
		// el cual le otorga un 2% de inter�s mensual. 
		// �En cu�ntos meses tendr� m�s de $1500, 
		// si reinvierte cada mes todo su dinero?

		double inversion = 700;
	    double intereses;
	    int meses = 0;
	        while (inversion <= 1500) {
	            meses++;
	            intereses = inversion * 0.02;
	            System.out.println("meses: " + meses + "\n"
	                    + "intereses: " + String.format("%.2f", intereses) + "\n"
	                    + "inversion: " + String.format("%.2f", inversion) + "\n"
	                    + "inversi�n al mes: " + String.format("%.2f", (inversion + intereses)) + "\n");
	            inversion += intereses;
	        }
		
	}

}
