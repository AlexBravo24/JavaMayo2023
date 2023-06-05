package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_JHC {

	public static void main(String[] args) {
		// La clase file nos permite acceder a archivos externos
		//ubicarlos en nuestro equipo para posteriormente 
		//poder manipularse con el apoyo de otras clases
		
		
//		String linea;
		
		
		try {//Intenamos ejecutar el siguiente codigo
			
//			File archivo = new File("C:\\Users\\jonat\\OneDrive\\Escritorio\\Fichero.txt");
//			//Hay que saber leer el archivo
//			FileReader fr = new FileReader(archivo);
//			//Hay que cargar el contenido del archivo 
//			//para poder visualizarlo/manipularlo
//			BufferedReader buffer = new BufferedReader (fr);
//			//Ya que lo podemos leer y cargar de este lado, pues
//			//procesos a darle una salida de consola  
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			
			String abc = "\nabcdefghi\n";
			File archivo = new File ("C:\\Users\\jonat\\OneDrive\\Escritorio\\Fichero.txt");
			
			FileWriter line = new FileWriter(archivo, true);
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i)+ "\n");
			}
			line.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace(); // Si ocurre algun error o excepcion
			//Se imprimira en consola donde esta ocurriendo dicho 
			System.out.println("No se encontro el archivo");
		}
		

	}

}
