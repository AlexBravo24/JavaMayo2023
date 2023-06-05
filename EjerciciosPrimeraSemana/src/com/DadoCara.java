package com;

import java.util.Scanner;

public class DadoCara {

	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    int dado;
		    
		   
		    System.out.print("La cara obtenida: ");
		    dado = scanner.nextInt();
		    
		    if(dado > 6) {
				
				  System.out.println("Error");
				    
			}
		    
		    switch (dado) {
		    case 1:
		      System.out.println("La cara opuesta está el seis");
		      break;
		    case 2:
		      System.out.println("La cara opuesta está el cinco");
		      break;
		    case 3:
		      System.out.println("La cara opuesta está el cuatro");
		      break;
		    case 4:
		      System.out.println("La cara opuesta está el tres");
		      break;
		    case 5:
		      System.out.println("La cara opuesta está el dos");
		      break;
		    case 6:
		      System.out.println("En la cara opuesta está el uno");
		      break;
		    
		    }
		  }
	
}
