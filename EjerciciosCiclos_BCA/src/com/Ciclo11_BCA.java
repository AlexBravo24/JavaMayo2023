package com;
import java.util.Scanner;
public class Ciclo11_BCA {

	public static void main(String[] args) {
		 int alto, ancho, a, b;
		  Scanner ingreso = new Scanner(System.in);
		 
		  System.out.print("Alto: ");
		  alto = ingreso.nextInt();
		  System.out.print("Ancho: ");
		  ancho = ingreso.nextInt();
		 
		  for(a = 0; a < alto; a++){
		    for(b = 0; b < ancho; b++){
		      System.out.print("*");   
		    }
		      System.out.println("");
		  }
		  }
		

	}


