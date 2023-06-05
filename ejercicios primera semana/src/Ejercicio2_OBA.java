import java.util.Scanner;

public class Ejercicio2_OBA {
        	  
          public static void main(String[] args) {
        	  
        	  //Realiza un programa que pida un numero por 
    	      //teclado y nos indique si es par o impar.
        	  
    	Scanner scanner = new Scanner(System.in); // primero inportamos Scanner scanner
    	
    	int numero1;                              // cremos variable int llamada numero1 sin saber que es lo que vale aún
    	Scanner entrada = new Scanner(System.in); // se crea una variable de tipo Scanner llamada entrada
    	
    	System.out.println("pecleé un número:");  // pedinos el numero con syso
    	numero1 = entrada.nextInt();              // indicamos que el valor de numero1 es igual a peticion anterior
    	System.out.println("su número es: "+numero1); // reafirmo el numero tecleado
    	
    	System.out.print("Haciendo los calculos correspondientes..."); 
    	
    	if (numero1 % 2 == 0) {                       //creamos la condicion para ver si es par 
    		System.out.println(" ...su númer es par.");
    	}
    		
    		else { // encaso de no ser par
    			System.out.println(" ...su número en impar.");
    		}
    			
    		}
}
    	
    	
    	
    	
    	
            
    
    



		        
          	    
	


	


