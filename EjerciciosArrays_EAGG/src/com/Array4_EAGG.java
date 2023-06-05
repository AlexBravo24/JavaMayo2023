package com;

public class Array4_EAGG {

	public static void main(String[] args) {
		// 4. Dado un array de números de 5 posiciones 
		// con los siguientes valores: {1,2,3,4,5}. 
		// Guardar los valores de este array en otro array 
		// distinto pero con los valores invertidos, 
		// es decir, que el segundo array deberá tener los valores 
		// {5,4,3,2,1}.
		
		int [] num4= {1,2,3,4,5};	
		
		System.out.println("Los números en órden inverso son: ");
		
		int [] num5 = new int [num4.length];
		
		for (int i = (num4.length-1), j=0 ; i >= 0; i--, j++) {
			num5[j]=num4[i];
			System.out.println("["+num4[i]+"]");
			
			}
		
	}

}
