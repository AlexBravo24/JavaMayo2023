package com;

import java.util.Scanner;

public class SolicitudDeAceptacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		int edad;
		String sexo;
		String F="F";
		String M="M";
		Scanner valor=new Scanner(System.in);


		System.out.println("Favor de ingresar Sexo");
		sexo=valor.nextLine();
		
		System.out.println("Favor de ingresar nota");
		nota=valor.nextInt();
           
		System.out.println("Favor de ingresar Edad");
		edad=valor.nextInt();

		
		if(nota >= 5 && edad >= 18) {
			if(sexo == F) {
				System.out.println("Contratado");	
			}
			  if(sexo==M){
				System.out.println("Posible");
	    		  }

			}
   	  if(nota < 5 || edad < 18) {

			System.out.println("Rechazado");
	          }
	}

}
