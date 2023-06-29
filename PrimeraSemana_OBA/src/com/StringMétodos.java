package com;

public class StringMétodos {

	public static void main(String[] args) {
		/* método de la clase string
		 * declaramos una variable de tipo string y le 
		 * asignamos un valor
		 */
		
         String cadena = "Hoy es martes 30 de mayo 2023";//un String es una susesion de caracteres
         
         /*.lenght () nos devuelve el tamaño de la cadena
          * en un valor numerico de tipo entero
          */
         System.out.println(cadena.length());
         
         /*al devolverme un valor numerico se 
          * pueden hacer operaciones con el
          */
         System.out.println(20+cadena.length());
         
         //.isEmpty verifica si la cadena esta vacia
         System.out.println(cadena.isEmpty());
         
         //.charat devuelve el caracter en el indice especificado
         System.out.println(cadena.charAt(0));     //012345 y no: 123456
         System.out.println(cadena.charAt(1));
         System.out.println(cadena.charAt(2));
         
         //substring '1': nos devuelve una subcadena apartir de el lugar que pidamos
         System.out.println(cadena.substring(4));
         
         //substring '2' devuelve los caracteres con un indice inicial y otro final
         System.out.println(cadena.substring(5, 15));
         
         //.toLowerCase : combierte la cadena de texto a minusculas
         System.out.println(cadena.toLowerCase());
         
         //.toUpperCase : combierte la cadena de texto a mayusculas
         System.out.println(cadena.toUpperCase());
         
         //.equals : comparar un objeto con otro o si una cadena de texto es igual a la que le dices o pidas
         System.out.println(cadena.equals("HOY es Martes 30 de mayo de 2023")); // esto es falso
         
         //.equalsignorecase : va a ignorar si la cadena esta en mayusculAS O MINUSculas
         System.out.println(cadena.equalsIgnoreCase("hoy es martes 30 de mayo 2023"));
         
         //.replace :  remplaza los caracteres que especifiquemos con los que le demos
         System.out.println(cadena.replace("e","x"));
         System.out.println(cadena.replace(" ",""));
         
         
         
         
         
         
         
         
         
         
         
         
	}
	

}
