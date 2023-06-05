package com;  //Nombre del paquete

public class TipoDeDatos { //Nombre de clase y
	
    public static void main(String[] args) { //Metodo Main
	
    	//Comentario  de una sola linea
    	
    	/*TIPOS DE DATOS
    	 * PRIMITIVOS
    	 * NUMERICOS ENTEROS
    	 */
    	//Declarar variables sin asignar valor inicial
    	
    	byte b;
    	short s;
    	int i;
    	long l;
    	
    	//Asignarles valores a mis varibles posteriormente
    	
    	b=127; // Asignando valores a mi  varible byte 1byte o  8 bits de memoria
    	s=32767; //Asignado un  valor  a mi varible short que ocupa 2 byte de memoria
	    i=2147483647; // Asignando un valor  de hasta 4 bytes
	    l=2147483650l; //Puede asgnarles valores con  la letra l puede aumentar el  tamaño de almacenamiento
	    
	    
	    //La  variable tipo int es la mas utilizada
	    //Puedo declarar variales e inicializarlas al mismo  tiempo
	    byte by=16;
	    int i1=6000;
	    
	    //TIPOS DE DATOS PRIMITIVOS
	    /*Tipo de datos con punto flotantes
	     * 
	     * 
	     */
	    float f=4000.566f; //Ocupan 4 byte de  memoria y necesitan  la letra f de suprijo
	    double d=13455.586;//Ocupa 8 bytes de memoria con punto decimal
	    
	    
	    /*TIPO DE DATOS BOOLEANOS
	     * 
	     * 
	     */
	    boolean boo=true; //Unico valores true o false
	    
	    char caracter='a'; //Solo admite cadenas de caracteres
	    
	    /*TIPO DE DATOS OBJETO
	     * ENVOLTORIO O WRAPPER
	 	 */
	    
	    Byte b1=127; 
	    Short s1=1000;
	    Integer i2=20000000;
	    Long l3=400000000000l;
	    
	    //añaden metodos a las variables permitiendo  aplicarlos en  caso que se necesiten

	    
	    //TIPO DE DATOS DE CADENA DE TEXTO
	    String cadena="esto es una cadena";
	    String nombre;
	    String nombre1="Jose";
	    String nombre2="David";
	    String apellido1="Martinez";
	    String apellido2="Santos";
	    nombre="Jose";
	    nombre="David";
	    
	    //Control+Espacio te imprime en consola
	    System.out.println(nombre);
	    System.out.println(nombre1);
	    System.out.println(nombre2);
	  //Concatenando valores
	    System.out.println("Mi nombre completo es:"+nombre1+" "+nombre2+" "+apellido1+" "+apellido2);
	    //Imprimir numero sin comillas
	    System.out.println(1000);
	   
	    
    }//Cierre de Main
	
/*¨
 *Para guarda cambios en  Control+S
 */
	
}//cierre de clases
