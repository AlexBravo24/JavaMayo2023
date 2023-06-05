package com;

import java.util.Scanner;

public class Arrays1_JDMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor=new Scanner(System.in);
		
		int[] numero=new int [10];
		
        for (int j = 0; j < numero.length; j++) {
     	   
     	System.out.println("ingresar el "+j+ " valor:");
     	numero[j]=valor.nextInt();    
     	 }
        
        for (int i = 0; i < numero.length; i++) {
        	System.out.println(+i+ " indice "+" valor "+numero[i]);
				
		}
        			
		
	}
	}


