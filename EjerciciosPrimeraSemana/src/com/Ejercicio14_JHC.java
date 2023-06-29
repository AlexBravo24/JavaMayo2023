package com;

import java.util.Scanner;

public class Ejercicio14_JHC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horasTrabajadas;
		int total;
		int horasex;
		
		Scanner entrada = new Scanner(System.in);
		
		 //ingreso de datos por el usuario
	     System.out.println("Ingrese el número de horas trabajadas");
	     horasTrabajadas=entrada.nextInt();
	     
	     //proceso de condición
	     if(horasTrabajadas <= 40){
	         total= horasTrabajadas*16;
	         
	         //muestra de datos en pantalla
	         System.out.println("Su sueldo es de $: "+ total);
	     }else{
	         horasex=horasTrabajadas-40;
	         total=(horasex*20)+(40*16);
	         System.out.println("Su sueldo es de $: "+ total);
	     }
	}

}
