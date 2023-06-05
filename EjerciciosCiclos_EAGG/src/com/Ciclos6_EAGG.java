package com;

public class Ciclos6_EAGG {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, 
		// el cual le otorga un 2% de interés mensual. 
		// ¿Cuál será la cantidad de dinero que esta persona tendrá 
		// al cabo de un año si todo el dinero lo reinvierte?

		
		
	   
	    
		System.out.println("Dinero inicial $1,000)");  
	    
		
		double cantidad = 1000;
	    int x=1;
	    while (x <= 12) {
	    	cantidad += (cantidad * 0.02);
	    	x++;
	    }
	    
	    System.out.printf("Dinero invertido después de un año: $%.2f", cantidad);
	    
	            

	}

}
