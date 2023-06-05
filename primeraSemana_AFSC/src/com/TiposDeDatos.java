package com;

public class TiposDeDatos {
	public static void main(String[] args) {//metodo main y apertura
		
		//comentarios de una sola linea
		/*comentarios 
		 * de multiples lineas
		 * no interfiere con codigo
		 */
		//para guardar ctr+S
		
		/*tipos de datos 
		 * primitivo
		 * numericos enteros
		 */
		//Declarar variables sin asignación de valor
		
		byte b;
		short s;
		int i;
		long l;
		
		//asignar valores a variables posteriormente
		
		b=127;//asignar valor -128 a 127 
		s=32767;//short ocupa 2 byts de memoria
		i=200000000;//int hasta 4 byts
		l=2147483647l;//long para soportar debe llevar sufijo l(ele no uno) al final
		
		//La variable comodin es la tipo int(varable de tipo entero)
		//se puede declarar variable y asigar valor de inmediato
		byte by =16;
		int i1=6000;
		/*tipos de datos 
		 * primitivo
		 * numericos en punto o coma flotante
		 * Permite almacenar valores con punto deimal
		 */
		float f = 4000.566f;//ocupan un espacio de 4 bytes en memoria ynecesita sufijo(f)
		double d = 13455.586;//ocupa un espacio de 8 byts en memoria
		/*tipos de datos primitivo
		 * Booleanos
		 * caracteres
		 */
		boolean boo = true;//facilitan el trabajo al evaluar expresiones o condiciones
		// solo aceptan valores true or false
		char caracter ='a';//solo admiten un caracter y ocupan una memoria de 2 byts
		//se asignan entre comilla simple
		
		/*tipos de datos estructurado 
		 * Tipo de dato objeto
		 * Tipo de dato envoltorio  o wrapper
		 */
		
			Byte b1 = 127;
			Short s1 = 1000;
			Integer i2 = 20000000;
			Long l3 = 400000000000l;
		//Añaden metodos a nuestras variables, permitiendonos aplicarlosen caso que se necesiten
			/*tipos de datos estructurado objeto
			 * Tipo de dato cadena de texto
			 */
			String cadena = "cadena de texto";
			String nombre;
			nombre = "Alejandro";
			nombre = "Alejandro Francisco";//respeta el ultimo dato gusrdado en la variable
			String nombre1="Sandoval";
			String nombre2="Cardenas";
			
			//imprimir en consola o mostrar datos que tenemos
			System.out.println(nombre);
			System.out.println(nombre1);
			System.out.println(nombre2);
			System.out.println("El numero contenido en i2 es :");
			System.out.println(i2);
			System.out.println("El valor de i2es:  "+i2);
			
			//concatenando valores siempre poner +
			System.out.println("Mi nombre completo es:  " + " "+ nombre + " " + nombre1 + " "+ nombre2);
			//imprimir numeros
			System.out.println(1000);
	}//cierre del main

}//cierre de la clase

