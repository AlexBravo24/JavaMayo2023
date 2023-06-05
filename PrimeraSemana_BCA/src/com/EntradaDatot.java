package com;

import java.util.Scanner;


public class EntradaDatot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Introducir numeros por teclado
		//declaro una variable donde almacenar el numero que voy a teclear
		
		int numero;
		
		//Utilizamos una clase llamada scanner para leer
		//o"escuchar" lo que se va a introducir por teclado
		
		Scanner entrada=new Scanner(System.in);
		
		//Escribo un mensaje con una instruccion
	    System.out.println("Introduce un numero por teclado");

		//Guardamos en una variable 
	    
	    numero=entrada.nextInt();
	    
	    System.out.println("El valor tecleado fue = "+ numero);
        //Mientras no cierre el Scanner, puedo seguir introduciendo
	    //numeros con el
	    
	    System.out.println("Introduce otro numero");
	    int numero2 = entrada.nextInt();
	    //entrada.close();//cierra las entradas pero se cerro el scanner
	    //en caso de querer meter otro numero marcara error5
	    
	    System.out.println("La suma de numero1 y numero2 es: "+(numero +numero2));
        
	    System.out.println("Introduce un tercer numero");
	    int numero3 = entrada.nextInt();
        //hasta aqui pide el 3er numero, pero no hara nada con el
	    
	    
	    
		
	}

}
