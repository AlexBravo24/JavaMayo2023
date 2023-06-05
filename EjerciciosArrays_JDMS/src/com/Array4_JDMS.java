package com;

public class Array4_JDMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero= {1,2,3,4,5};
		int[] numero2=new int[5]; 
	
		for (int i = numero.length-1; i >= 0 ; i--) {
            numero2[i]=(numero[i]);
            System.out.println(numero2[i]);
        }	
	}

}
