package com;
/*
 * Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
de la entrega.

 */
import java.util.Scanner;
public class Ejercicio11_BCA {

	public static void main(String[] args) {
		
		float peso, costo;
	       int zona;
	       
	       Scanner entrada = new Scanner(System.in);
	       System.out.println("Ingresa el peso del paquete en quilos: ");
	       
	       peso = entrada.nextFloat();
	       
	       if (peso>5){
	           
	       System.out.println("El paquete no puede ser transportado: ");
	           
	       }
	       else{
	           
	         System.out.println("Ingresa la zona: ");  
	       
	    }
	       zona = entrada.nextInt();
	       if (zona==1){
	          
	               
	               System.out.println("1: America del norte: ");
	               
	                costo = peso * 24;
	       System.out.println("El cobro por el envio del paquete es:  $  " + costo + " euros");      
	           
	       } else if (zona==2){
	          
	               
	               System.out.println("2: America central: ");
	               
	                costo = peso * 20;
	       System.out.println("El cobro por el envio del paquete es:  $ " + costo + " euros");      
	       
	       }else if (zona==3){
	          
	               
	               System.out.println("3: America del sur: ");
	               
	                costo = peso * 21;
	       System.out.println("El cobro por el envio del paquete es:  $ " + costo + " euros");      
	       
	       }
	      else if (zona==4){
	          
	               
	               System.out.println("4: Europa: ");
	               
	                costo =  peso * 10;
	       System.out.println("El cobro por el envio del paquete es:  $ " + costo + " euros");      
	       
	       }  else if (zona==11){
	          
	               
	               System.out.println("5: Asia: ");
	               
	                costo =  peso * 18;
	       System.out.println("El cobro por el envio del paquete es:  $ " + costo + " euros");      
	       
	       }  

	}

}
