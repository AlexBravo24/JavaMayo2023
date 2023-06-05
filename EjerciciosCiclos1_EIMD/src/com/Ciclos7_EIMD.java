package com;

public class Ciclos7_EIMD {

	public static void main(String[] args) {
	/*
	 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
dinero?

	 */
		
		int meses=1 ;
		
		double  inicial=700;
		
		while(inicial<1500) {
			inicial=inicial*1.02;
		meses++;	
		}
		System.out.println("En el mes "+meses+" tendremos " + inicial);
	}

}
