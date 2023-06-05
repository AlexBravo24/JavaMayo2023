package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FileReadWrite_MAGA {

	public static void main(String[] args) {
		// La clase File nos permite acceder a los archivos externos
		// ubicarlos en nuestro equipo  para posteriormente
		// poder manipularlos con el apoyo de otras clase
		
		// Intentar realizar la lectura de un archivo
		
		// Declaramos una variable donde  vamos a recibir 
		// las lineas de texto
		
		String linea;
		
		
		try { //Intentamos las siguientes lineas
			// La clase file nos permite tener ubicado al archivo
			File archivo = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\fichero.txt");
			// Hay que leer el archivo
			FileReader fr = new FileReader(archivo);
			// Hay que cargar el contenido del archivo o leerlo para
			// poder visualizarlo/manipularlo
//			BufferedReader buffer = new BufferedReader( new InputStreamReader("C:\\Users\\marco\\OneDrive\\Escritorio\\fichero.txt") );
		
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
			// Ya que lo podemos leer y cargar de este lado, pues procedemos
			// a darle salida en consola
			while ((linea = in.readLine()) != null) {
				System.out.println(linea);
			}
			
			in.close();
			
			String abc = "Marco Alberto";
			//File archivo = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\fichero.txt");
			
			FileWriter line = new FileWriter(archivo, true);
			
//			for (int i = 0; i < abc.length(); i++) {
//				line.write( abc.charAt(i) + "\n" );
//			}
			
			line.write(abc);
			
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace(); // Si ocurre algun error o excepcion
			// Se imprimira en consola donde esta ocurriendo dicho error
			System.out.println("No se encontro el archivo");
		}

	}

}
