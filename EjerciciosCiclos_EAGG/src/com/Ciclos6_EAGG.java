package com;

public class Ciclos6_EAGG {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, 
		// el cual le otorga un 2% de inter�s mensual. 
		// �Cu�l ser� la cantidad de dinero que esta persona tendr� 
		// al cabo de un a�o si todo el dinero lo reinvierte?

		
		
	   
	    
		System.out.println("Dinero inicial $1,000)");  
	    
		
		double cantidad = 1000;
	    int x=1;
	    while (x <= 12) {
	    	cantidad += (cantidad * 0.02);
	    	x++;
	    }
	    
	    System.out.printf("Dinero invertido despu�s de un a�o: $%.2f", cantidad);
	    
	            

	}

}
