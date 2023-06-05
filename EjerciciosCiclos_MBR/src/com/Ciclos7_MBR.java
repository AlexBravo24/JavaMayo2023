package com;

public class Ciclos7_MBR {

	public static void main(String[] args) {
		/*7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
		 * ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?*/
		double inversion = 700;
		int mes = 1;
		for(;;) {
			inversion = inversion *1.02;
			if(inversion >= 1500) break;
			mes++;
		}
		System.out.println("Mes : "+ mes);
		System.out.println("Dinero ahorrado : "+ inversion);

	}

}
