package com;

import java.util.Scanner;

public class DivisionDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int resultado=0;
        int resultado2=0;
        int kilo;
		Scanner valor=new Scanner(System.in);
		

		System.out.println("Ingresa el primer numero:");
		resultado=valor.nextInt();
		
		System.out.println("Ingresa el segundo numero:");
		resultado2=valor.nextInt();
		
		if(resultado >= 1 && resultado2 >= 1){
			
			System.out.println("Resultado:"+resultado/resultado2);
		}else{
			System.out.println("Un numero es menor que 0");
		}
	}

}
