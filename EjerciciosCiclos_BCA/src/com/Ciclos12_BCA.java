package com;
import java.util.Scanner;
public class Ciclos12_BCA {

	public static void main(String[] args) {
	int edad, acumulador=0, contador=0, Promedio=0;
    
    Scanner entrada = new Scanner(System.in);
   
    
    
    for(int i=1; Promedio<=24; i++){
        
        
         System.out.println("Ingresa la edad: ");
         edad=entrada.nextInt();
        contador++;
        acumulador=acumulador+edad;
        Promedio=acumulador/contador;
        System.out.println("El promedio es: "+Promedio);
    }
    System.out.println("El promedio es mayor o igual a 25, gracias");
    
		}
	}


