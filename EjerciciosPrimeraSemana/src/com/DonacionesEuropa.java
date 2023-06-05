package com;

import java.util.Scanner;

public class DonacionesEuropa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double donacion;
double salud;
double comedor;
double bolsa;
  System.out.println("Ingrese  el total de donaciones;");
   Scanner valor= new Scanner(System.in);
         
   donacion=valor.nextDouble();
		
		if(donacion >= 10000){
            salud = 0.30  * donacion;
            comedor = 0.50  * donacion;
            bolsa = 0.20  * donacion;
            System.out.println("Se destino a salud: "+salud+" al comedor: "+comedor+" y a la bolsa: "+bolsa);
      }else{
            salud = 0.25  * donacion;
            comedor = 0.60  * donacion;
            bolsa = 0.15  * donacion;
            System.out.println("Se destino a salud: "+salud+" al comedor: "+comedor+" y a la bolsa: "+bolsa);
           }
		
	}

}
