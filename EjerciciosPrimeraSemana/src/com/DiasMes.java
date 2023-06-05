package com;

import java.util.Scanner;

public class DiasMes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dia=0;
		Scanner valor=new Scanner(System.in);
		
		System.out.println("Ingresa el numero del mes:");
		dia=valor.nextInt();
		   
		if(dia > 12) {
			
			  System.out.println("Error");
			    
		}
		    
		    
		switch(dia) {
		   case 1:
			   System.out.println("Enero tiene 31");
			   break;
		   case 2:
			   System.out.println("Enero tiene 28");
			   break;
		   case 3:
			   System.out.println("Marzo tiene 31");
			   break;
		   case 4:
			   System.out.println("Abril tiene 30");
			   break;
		   case 5:
			   System.out.println("Mayo tiene 31");
			   break;
		   case 6:
			   System.out.println("Junio tiene 30");
			   break;
		   case 7:
			   System.out.println("Julio tiene 31");
			   break;
		   case 8:
			   System.out.println("Agosto tiene 31");
			   break;
		   case 9:
			   System.out.println("Septiembre tiene 30");
			   break;
		   case 10:
			   System.out.println("Octubre tiene 31");
			   break;
		   case 11:
			   System.out.println("Noviembre tiene 30");
			   break;
		   case 12:
			   System.out.println("Diciembre tiene 31");
			   break;

		   }
	}

}
