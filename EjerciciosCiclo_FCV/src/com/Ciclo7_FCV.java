package com;

public class Ciclo7_FCV {
	public static void main(String[] args) {
		//Una persona desea invertir $700.00 en un banco, el 
		//cual le otorga un 2% de interés mensual. ¿En cuántos 
		//meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
		
		double inversion=700; 
		int meses=0;
		
		while (inversion<=1500) {
			inversion=inversion+(inversion*0.02);
			meses++;
		}
		System.out.println("Total de meses "+ meses);

	}

}
