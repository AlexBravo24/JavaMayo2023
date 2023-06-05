package com;

import java.util.Scanner;

public class Ejercicio10_MBR {

	public static void main(String[] args) {
		/*10.Realiza un programa que pida un número entero entre uno y doce 
		 * e imprima el número de días que tiene el mes correspondiente.
		 * Como vemos en el listado, tendríamos las siguientes opciones:

Si mes = 1, enero debe mostrar 31 días.
Si mes = 2, febrero debe mostrar 28 días.
Si mes = 3, marzo debe mostrar 31 días.
Si mes = 4, abril debe mostrar 30 días.
Si mes = 5, mayo debe mostrar 31 días.
Si mes = 6, junio debe mostrar 30 días.
Si mes = 7, julio debe mostrar 31 días.
Si mes = 8, agosto debe mostrar 31 días.
Si mes = 9, septiembre debe mostrar 30 días.
Si mes = 10, octubre debe mostrar 31 días.
Si mes = 11, noviembre debe mostrar 30 días.
Si mes = 12, diciembre debe mostrar 31 días.
Si mes = otro valor , se debe mostrar un error
Como vemos, los resultados a mostrar por nuestro programa se repiten para varios valores, de forma que podríamos resumirlo de la siguiente forma:

Si mes = (1, 3, 5, 7, 8, 10, 12), el resultado es 31 días.
Si mes = (2), el resultado es 28 días.
Si mes = (4, 6, 9, 11), el resultado es 30 días.
Si mes = otro valor, el resultado es ERROR*/
		Scanner entrada = new Scanner(System.in);
	    int mes;
	// Solicitud de datos al usuario
	    System.out.println("SE MUESTRA EL NÚMERO DE DÍAS CORRESPONDIENTE AL MES INGRESADO");

	    	    System.out.println(" 1.- Enero.");
	    System.out.println(" 2.- Febreo.");
	    System.out.println(" 3.- Marzo.");
	    System.out.println(" 4.- Abril.");
	    System.out.println(" 5.- Mayo.");
	    System.out.println(" 6.- Junio.");
	    System.out.println(" 7.- Julio.");
	    System.out.println(" 8.- Agosto.");
	    System.out.println(" 9.- Septiembre.");
	    System.out.println("10.- Octubre.");
	    System.out.println("11.- Noviembre.");
	    System.out.println("12.- Diciembre.");
	    System.out.println("Ingreseun número del 1 al 12:");

	    mes = entrada.nextInt();
	// Realizamos comparaciones y mostramos el resultado
	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
	      System.out.println("El mes seleccionado tiene 31 días");
	    } else if (mes ==2){
	      System.out.println("Febrero tiene 28 días");
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("El mes seleccionado tiene 30 días");
	    } else {
	      System.out.println("Error, el mes debe estar entre 1-12.");
	    } 
		

	}

}
