package com;

import java.util.Scanner;

public class EjercicioCiclo_8AFSC {
public static void main(String[] args) {
	//8. Programa Java que lea dos n�meros 
	//y muestre los n�meros desde el menor hasta el mayor
	
	
	Scanner entrada = new Scanner(System.in);
    int numero1, numero2, menor, mayor;
   
    
    do {
        System.out.print("Introduce un n�mero entero: ");
        numero1 = entrada.nextInt();
        System.out.print("Introduce otro n�mero entero distinto del anterior: ");                   
        numero2 = entrada.nextInt();
        
        if(numero1 == numero2){
            System.out.println("Debes introducir dos n�meros distintos");
        }
    } while (numero1 == numero2);
   

    if (numero1 > numero2) {
        mayor = numero1;
        menor = numero2;
    } else {
        mayor = numero2;
        menor = numero1;
    }
   
    System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");
    for (int i = menor; i <= mayor; i++) {
        System.out.println(i);
    }

	
}//main
}
