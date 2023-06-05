package com;

public class EjercicioCiclo6_JHC {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
		//todo el dinero lo reinvierte?
		
		double inversion = 1000.00;
        double intereses;
        int meses = 0;
        while (meses <= 11) {
            meses++;
            intereses = inversion * 0.02;
            
            System.out.println("meses: " + meses + "\n"
                    + "intereses: " + String.format("%.2f", intereses) + "\n"
                    + "inversion: " + String.format("%.2f", inversion) + "\n"		
                    + "inversión al mes: " + String.format("%.2f", (inversion + intereses)) + "\n");
            inversion += intereses;
        }
        
//        double inversion = 1000.00;
//        int mes = 1;
//        
//        while (mes <= 12 ) {
//        	inversion = inversion * 1.02;
//        	mes++;
//        }
//        
//        System.out.println(inversion);
        
	}

}
