package com;

public class Ciclos6_EIMD {

	public static void main(String[] args) {
		/*
		 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
todo el dinero lo reinvierte?


		 */
		
		
		int meses=1 ;
		double  inicial=1000;
		
		while(meses<=12) {
			inicial=inicial*1.02;
		meses++;	
		}
		System.out.println("al final del a�o tendremos: $"+ inicial);
	}

}
