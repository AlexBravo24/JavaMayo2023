package com;

import java.util.Scanner;

public class DiasDeSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dia=0;
		Scanner valor=new Scanner(System.in);
		
		System.out.println("Ingresa el numero de un dia de la semana:");
		dia=valor.nextInt();
		   
		if(dia > 7) {
			
			  System.out.println("Error");
			    
		}
		    
		    
		switch(dia) {
		   case 1:
			   System.out.println("Lunes");
			   break;
		   case 2:
			   System.out.println("Martes");
			   break;
		   case 3:
			   System.out.println("Miercoles");
			   break;
		   case 4:
			   System.out.println("Jueves");
			   break;
		   case 5:
			   System.out.println("Viernes");
			   break;
		   case 6:
			   System.out.println("Sabado");
			   break;
		   case 7:
			   System.out.println("Domingo");
			   break;

		   }
	}

}
