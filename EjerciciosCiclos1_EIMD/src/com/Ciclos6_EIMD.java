package com;

public class Ciclos6_EIMD {

	public static void main(String[] args) {
		/*
		 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
todo el dinero lo reinvierte?


		 */
		
		
		int meses=1 ;
		double  inicial=1000;
		
		while(meses<=12) {
			inicial=inicial*1.02;
		meses++;	
		}
		System.out.println("al final del año tendremos: $"+ inicial);
	}

}
