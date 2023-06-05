package com;

import java.util.Scanner;

public class PagoAutobus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int alumnos=0;
        int ppersona=0;
        int total=0;
		Scanner valor=new Scanner(System.in);
		
		System.out.println("Ingresa el numero cantida de alumnos:");
		alumnos=valor.nextInt();
		   
		if(alumnos > 100) {
			ppersona=65;
			
	  		total=ppersona*alumnos;
			  System.out.println("El total a pagar sera: "+total+" y por persona se cobrara:"+ppersona);
			    
		}else if(alumnos >=50 && alumnos <= 99) {
                 ppersona=70;    			
			     total=ppersona*alumnos;
				   System.out.println("El total a pagar sera: "+total+" y por persona se cobrara:"+ppersona);
		    
		}else if(alumnos >=30 && alumnos <= 49){
			ppersona=95;    			
		     total=ppersona*alumnos;
			   System.out.println("El total a pagar sera: "+total+" y por persona se cobrara:"+ppersona);
			   
		}else if(alumnos < 30){
			System.out.println("el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.");
		}
		    
		    
		if(alumnos > 100) {

	
		}
	}
}
