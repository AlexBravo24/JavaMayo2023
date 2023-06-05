package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_YAAH {

	public static void main(String[] args) {
		// 
		
		// La clase file nos permite acceder a archivos externos 
		// ubicarlos en nuestro equipo para posteriormente
		// poder manipularlos con el apoyo de otras clases.
		
		// Intentar realizar una lectura de archivos.
		// try ctrl + espacio
		// Declaramos un String donde vamos a poder recibir las lineas de texto
		
		String linea;
		
		try { // Intentamos ejecutar el siguiente código.
			// La clase file nos permite tener acceso a la ubicación del archivo
			// Y tener una representación del mismo en memoria
//			File archivo = new File("C:\\Users\\Lobito\\Desktop\\fichero.txt");
//			// Hay que saber leer un archivo
//			FileReader fr = new FileReader(archivo);
//			// Hay que cargar el contenido del archivo o leerlo como tal
//			// para poder visualizarlo/manipularlo
//			BufferedReader buffer = new BufferedReader(fr);
//			BufferedReader buffer = new BufferedReader(fr);
//			// Ya que lo podemos leer y cargar de este lado, pues 
//			// procedemos a darle una salida en consola
//
//			while((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
		
			
			
			String abc = "abcdefghi";
			File archivo = new File("C:\\Users\\Lobito\\Desktop\\fichero.txt");
			// Ahora podemos manipulalrlo con escritura mediante la clase FileWriter
			
			FileWriter line = new FileWriter(archivo, true);
			
			line.write(abc);
//			for (int i = 0; i < abc.length(); i++) {
//				line.write(abc.charAt(i) + "\n");
//			}
			line.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();// Si ocurre un error o excepción

		// se imprime en consola donde esta ocurriendo dicho error
		System.out.println("No se encontró el archivo");
		}

	}

}
