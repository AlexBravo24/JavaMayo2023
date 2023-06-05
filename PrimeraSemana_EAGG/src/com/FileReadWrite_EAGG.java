package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_EAGG {

	public static void main(String[] args) {
		// La clase File nos permite acceder a archivos externos
		// ubicarlos en nuestro equipo para posteriormente
		// poder manipularlos con el apoyo de otras clases.
		
		// Intentar realizar una lectura de archivos.
		
		
		// try ctrl + espacio
		// Declaramos un String donde vamos a poder recibir 
		// las líneas de texto.
		
		String linea;
		
		try { // Intentamos ejecutar el siguiente código.
			// La clase file nos permite tener acceso a la ubicación del archivo
			// y tener una representación del mismo en memoria.
//			File archivo = new File ("C:\\Users\\anahi\\Desktop\\Fichero.txt");
//			
//			// Hay que saber leer el archivo.
//			FileReader fr = new FileReader (archivo);
//			
//			// Hay que cargar el contenido del archivo o leerlo como tal
//			// para poder visualizarlo o manipularlo.
//			BufferedReader buffer = new BufferedReader (fr);
//			
//			// Ya que lo podemos leer y cargar de este lado, pues
//			// procedemos a darle una salida en consola.
//			
//			while ((linea = buffer.readLine ()) != null) {
//				System.out.println(linea);
//				
//			}
			String abc = "\nabcdefghi\n";
			File archivo = new File ("C:\\Users\\anahi\\Desktop\\Fichero.txt");
			// Ahora podemos manipularlo con escritura mediante la clase
			// FileWriter
			
			FileWriter line = new FileWriter (archivo, true); // Con true es mantener lo que tiene el archivo
			
			for (int i = 0; i < abc.length(); i++) {
				line.write (abc.charAt(i) + "\n"); // Escribe el salto de línea
				
			} // Si quitamos line.write
			line.close(); // Aquí ya me escribe el archivo
			
		} catch (Exception e) {
			e.printStackTrace(); //Si ocurre algún error o excepción
			// se imprimirá en consola donde está ocurriendo dicho error
			System.out.println("No se encontró el archivo");
		}
		
		
		
		

	}

}
