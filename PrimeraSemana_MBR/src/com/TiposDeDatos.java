package com;

public class TiposDeDatos {

    public static void main(String[] args){ //metodo main y apertura
    	
    	//Comentarios de una sola lìnea
    	
	/*
	 * Comentarios
	 * de
	 * multiples lineas
	 * 
	 */
    	
    	
    	//para guardar cambios en nuestra clase se realiza con el atajo 
    	//Ctrl + S
    	
    	
    	/*TIPOS DE DATOS
    	 * PRIMITIVOS
    	 * NUMERICOS ENTEROS
    	 * */
    	//Declarar variables sin asignacion de valor
    	
    	byte b;
    	short s;
    	int i;
    	long l;
    	
    	//Asignarles valores a mis varibles posteriormente
    	
    	b = 127;//asignando un valor  a mi variable del tipo byte de -128 a 127
    	s = 32767;//Asignando un valor  a mi varibale short (2bytes de memoria)
    	i = 200000000; //Asignando un valor a mi variable int (4 bytes)
    	l = 21474836599990l;//En las variables long, una vez rebasado 
    	// el rango que puede almacenar las del tipo int, nececitan el sufijo "l"
    	//para poder almacenar ese valor 
    	
    	//la variable comodin es la de tipo int
    	//Puedo declarar variables y asignar su valor inmediatamente 
    	
    	byte by = 16;
    	int il = 6000;
    	
    	/*TIPOS DE DATOS PRIMITIVOS
    	 * NÙMERICOS EN PUNTO O COMA FLOTANTE
    	 * nos permiten almacenar valores con punto decimal
    	 */
    	float f = 4000.566f; //ocupan mas espacio de 4 bytes en memoria y nececitan 
    	//del sufijo "f"
    	double d = 13455.586; //ocupan un espcio de 8 bytes en memoria
    	
    	//La variable comodin de los numeros decimales es la de tipo double
    	
    	
    	/*TIPOS DE DATOS PRIMITIVOS
    	 * BOOLEANOS
    	 * CARACTER
    	 */
    	boolean boo = true; //facilitan el trabajo al evaluar expresiones 
    	//o condiciones y solo admiten valores true or false 
    	
    	char caracter = 'a'; //Solo admiten un caracter, y ocupan
    	//de 2 bytes y se asignan entre comilla simple 
    	
    	
    	/*TIPOS DE DATOS ESTRUCTURADOS
    	 * TIPOS DE DATO OBJETO
    	 * 
    	 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
    	 * 
    	 */
    	
    	Byte b1 = 127;
    	Short s1 = 1000;
    	Integer i2 = 20000000;
    	Long l3 = 400000000000l;
    	
    	//Añaden mètodos  a nuestras variables, permitiendonos aplicarlos 
    	//en caso de que se necesiten
    	
    String cadena = "Esto es una cadena de texto.";	
    
    String nombre;
    
    nombre = "Alejandro";
    
    nombre = "Jose";
    
    String nombre1 = "Alejandro";
    String nombre2 = "Jorge Alejandro";
    String apellidos = "Bravo Ramirez";

    
    //imprimir en consola o mostrar datos en ella
    System.out.println(nombre);
  //atajo para escribir la instruccion de impresion Syso + ctrl + barra espaciadora

    System.out.println(nombre1); 
    System.out.println(nombre2);
    //System.out.println("El numero contenido en i2 es :");
    System.out.println(i2);
    //Concatenando valores
    
    System.out.println("Mi nombre completo es: " + nombre2+" "+ apellidos );
    System.out.println(1000);
    
    //System.out.println("El valor de i2 es: "+ i2 + " " + il+ " " + nombre + " " + nombre1);
	}//Cierre del main

}//Cierre de la clase 














