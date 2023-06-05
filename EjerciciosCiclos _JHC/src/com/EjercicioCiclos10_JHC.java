package com;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioCiclos10_JHC {

	public static void main(String[] args) throws IOException {
		// 10. Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
		//impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares. 
		
		
        int numero;
        char respuesta;
        int sumaPar = 0;
        int sumaImpar = 0;
       
        
        Scanner sc = new Scanner(System.in);
        
        
        do {
        	
        	System.out.println("Programa que lea 20 n�meros e indique si son positivos o negativos y pares \n");
        	
        	System.out.print("Introduce un n�mero: ");
            numero = sc.nextInt();
    

            if (numero != 20) {
                if (numero > 0) {
                    System.out.print("Positivo");
                } else {
                    System.out.print("Negativo");
                }
                if (numero % 2 == 0) {
                	
                    System.out.println(" Par");
                    
                } else {
                	
                    System.out.println(" Impar");
                }
                 
                //Suma de numeros par e impar
                
                for (int i = 0; i < 10; i++) {
                	System.out.printf("Ingresa un n�mero entero (%d de 20): ", i + 1);
					int suma = sc.nextInt();
					
					
                if (numero % 2 == 0) {
                    sumaPar += suma;
                } else {
                    sumaImpar += suma;
                }
                
            }
                
                
            
            System.out.printf("Resultado: Total pares: %d; Total impares: %d ", sumaPar, sumaImpar);
            
            }

            System.out.print("Desea introducir m�s n�meros? (S/N): ");                                  
            respuesta = (char) System.in.read();

        } while (respuesta != 'N' && respuesta != 'n');
        

        
        
	}
}



