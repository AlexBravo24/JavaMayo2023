package com;

public class EjercicioCiclos7_JHC {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		//dinero?
		
		//Variables
		double inversion = 700.00;
		double intereses;
		int meses = 0;
		
		//Procedimiento
		while (inversion <= 1500.00) {
			meses++;
			intereses = inversion * 0.02;
			
			//Imprimir
			System.out.println("meses: " + meses + "\n"
					+ "intereses: " + String.format("%.2f", intereses) + "\n"
					+ "inversion: " + String.format("%.2f", inversion) + "\n"
					+ "inversion al mes: " + String.format("%.2f", (intereses + inversion)) + "\n");
					inversion += intereses;
		}
	
		System.out.println("****************************************************");
		System.out.println("LLegar a la meta deseada tomara " + meses + " meses" );
		System.out.println("****************************************************");


	}

}
