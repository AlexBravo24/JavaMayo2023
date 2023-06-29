package com;

import java.util.Scanner;

public class Ejercicio8_BCA {

	public static void main(String[] args) {
		// 
		
		int resultado;
        Scanner entrada = new Scanner(System.in);
       System.out.println("Ingresar el resultado del lanzamiento: ");
       
       resultado = entrada.nextInt();
       
       switch(resultado){
       case 1:
            System.out.println("Seis");
           break;
       case 2:
           System.out.println("Cinco");
           break;
       case 3:
           System.out.println("Cuatro");
           break;
       case 4:
           System.out.println("Tres");
           break;
       case 5:
           System.out.println("Dos");
           break;
       case 6:
           System.out.println("Uno");
           break;
           default:
           System.out.println("ERROR: número incorecto");
           
           }

	}

}
