package com;

import java.util.Scanner;

public class HorasTrabajadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    int horas;
		    int salario;
		    int extras;
		    int bace=640;
		    int salarioex;
		    int salarioexfinal;
		    
		    System.out.print("Cuantas horas trabajo? ");
		    horas = scanner.nextInt();
		    
		    if(horas<=40) {
		    	
		    	salario=horas*16;

			    System.out.print("Su salario semanal es:"+salario);
		    }else {
		    	extras=horas-40;
		    	salarioex=extras*20;
		    	salarioexfinal=salarioex+bace;

			    System.out.print("Su salario semanal con horas extras es:"+salarioexfinal);
		    }
		    
	}

}
