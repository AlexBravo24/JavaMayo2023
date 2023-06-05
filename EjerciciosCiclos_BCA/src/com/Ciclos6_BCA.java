package com;



public class Ciclos6_BCA {

	public static void main(String[] args) {
		
	   		double inv = 1000;
	   		double inte;
	   		int m = 0;
	   		
	   		while(inv <= 1500) {
	   			m++;
	   			inte = inv * 0.02;
	   			System.out.println("Meses: "+ m);
	   			System.out.println("Intereses: " + String.format("%.2f",inte));
	   			System.out.println("Inversion: " + String.format("%.2f",inv));
	   			System.out.println("Ganancia mensual: " + String.format("%.2f",(inte+inv)));
	   			System.out.println("Ganancia anual: " + String.format("%.2f",(inte+inv)*12));
	   			inv+=inte;
	   			
	   			
	   		}
	   		
	}

}
