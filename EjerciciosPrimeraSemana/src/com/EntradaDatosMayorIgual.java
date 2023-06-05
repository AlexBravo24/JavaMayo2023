package com;

import java.util.Scanner;

public class EntradaDatosMayorIgual {

	public static void main(String[] args) {
        
     int numero1;
     int numero2;
     Scanner valor=new Scanner(System.in);
     System.out.println("Ingrese el primer numero:");
     numero1=valor.nextInt();
     
     int lineas=30;
    	 for (int i=0; i < lineas; i++)
    	 { 
    	 System.out.println("");
    	 }
     
     System.out.println("Ingrese el segundo numero:");
     numero2=valor.nextInt();
     
     if(numero1>numero2) {
    	 System.out.println("El mayor es:"+numero1);
    	 
     }else if(numero1==numero2){
    	 System.out.println("Los numero son iguales:"+numero1+"="+numero2);
    	 
     }else{ 
    	 System.out.println("El mayor es:"+numero2);   	 
           } 
     
	}

}
